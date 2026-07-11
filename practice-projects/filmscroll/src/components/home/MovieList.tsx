import { Link } from "expo-router";
import { Image, Text, TouchableWithoutFeedback, View } from "react-native";
import { IMovie } from "~/libs/types/MovieTypes";

const MovieList = ({ movie }: { movie: IMovie; }) => {
  return (
    <Link href={`/movies/${movie.id}` as any} asChild>
      <TouchableWithoutFeedback>
        <View className="flex gap-2 w-32 my-0.5">
          <Image source={{ uri: `https://image.tmdb.org/t/p/w500/${movie.poster_path}` }}
            className="h-48 rounded-xl"
            resizeMode="contain" />
          <Text className="text-light text-left text-sm" numberOfLines={1}>{movie.title}</Text>
          <View className="flex flex-row justify-between">
            <Text className="text-dim text-sm ">{movie.release_date.split("-")[0]}</Text>
            <Text className="text-dim text-sm ">✱ {movie.vote_average.toPrecision(2)}</Text>
          </View>
        </View>
      </TouchableWithoutFeedback>
    </Link>
  );
};

export default MovieList;
