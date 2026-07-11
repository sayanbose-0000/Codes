import { ActivityIndicator, FlatList, Text } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import MovieList from "~/components/home/MovieList";
import { fetchMovies } from "~/libs/apis/api";
import { useFetch } from "~/libs/hooks/useFetch";
import { IMovie, IMoviesListResponse } from "~/libs/types/MovieTypes";
const Home = () => {
  const { data: moviesList, error: moviesError, loading: isLoading } = useFetch<IMoviesListResponse>(() => fetchMovies(), true);

  return (
    <SafeAreaView className="bg-dark text-light min-h-screen p-3">
      <Text className="text-light font-bold pb-0 text-2xl mb-2 mx-auto">Trending</Text>
      {
        isLoading ?
          <ActivityIndicator size={"large"} className="h-full flex justify-center items-center"/>
          :
          moviesError ?
            <Text className="text-light">Error: {moviesError.message}</Text>
            :
            <FlatList
              data={moviesList?.results}
              keyExtractor={(item) => item.id.toString()}
              renderItem={({ item }: { item: IMovie; }) => <MovieList movie={item} />}
              contentContainerClassName="pb-44 pt-5 flex flex-row flex-wrap justify-center items-start gap-5" // padding bottom
            />
      }
    </SafeAreaView>
  );
};

export default Home;
