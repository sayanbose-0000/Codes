export type IMovie = {
  id: number;
  title: string;
  original_title: string;
  overview: string;
  poster_path: string;
  backdrop_path: string;
  release_date: string;
  vote_average: number;
  vote_count: number;
  adult: boolean;
  original_language: string;
  genre_ids: number[];
  video: boolean;
  popularity: number;
};

export type IMoviesListResponse = {
  page: number;
  results: IMovie[];
  total_pages: number;
  total_results: number;
};
