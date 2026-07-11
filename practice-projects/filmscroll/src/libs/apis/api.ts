import { tmdbBaseUrl, tmdbOptions } from "../config/config";

export const fetchMovies = async (query?: string) => {
  const endpoint = query ?
    `${tmdbBaseUrl}/search/movie?query=${query}`
    :
    `${tmdbBaseUrl}/discover/movie?sort_by=popularity.desc`;

  const response = await fetch(endpoint, tmdbOptions);
  console.log(response)

  if (!response.ok) {
    throw new Error("Failed to fetch movies");
  }

  return await response.json();
};
