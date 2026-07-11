import { use, useEffect, useState } from "react";
import { ActivityIndicator, FlatList, Text, TextInput, View } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import MovieList from "~/components/home/MovieList";
import { fetchMovies } from "~/libs/apis/api";
import { useFetch } from "~/libs/hooks/useFetch";
import { IMovie, IMoviesListResponse } from "~/libs/types/MovieTypes";

const Search = () => {
  const [query, setQuery] = useState<string>("");
  const { data: moviesList, error: moviesError, loading: isLoading, runHook, resetHook } = useFetch<IMoviesListResponse>(() => fetchMovies(query), false);

  return (
    <SafeAreaView className="bg-dark text-light min-h-screen p-3">

      <View className="relative w-full h-14 rounded-3xl overflow-hidden ">

        <TextInput
          placeholder="Search movies..."
          placeholderTextColor="#aaa"
          value={query}
          onChangeText={setQuery}
          onSubmitEditing={() => runHook()}
          returnKeyType="search"
          className="flex-1 text-white px-5 text-xl"
        />
      </View>

      {
        isLoading ?
          <ActivityIndicator size={"large"} className="h-full flex justify-center items-center" />
          :
          moviesError ?
            <Text className="text-light">Error: {moviesError.message}</Text>
            :
            moviesList ?
              moviesList.results.length === 0 ?
                <Text className="text-dim mx-auto my-auto text-xl">No movies found</Text>
                :
                <FlatList
                  data={moviesList?.results}
                  keyExtractor={(item) => item.id.toString()}
                  renderItem={({ item }: { item: IMovie; }) => <MovieList movie={item} />}
                  contentContainerClassName="pb-44 pt-5 flex flex-row flex-wrap justify-center items-start gap-5" // padding bottom
                />
              :
              <Text className="text-dim mx-auto my-auto text-xl">Search for movies in the seartch box</Text>
      }
    </SafeAreaView>
  );
};

export default Search;
