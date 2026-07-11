export const EXPO_PUBLIC_TMDB_HEADER = process.env.EXPO_PUBLIC_TMDB_HEADER;

export const tmdbOptions = {
  method: "GET",
  headers: {
    accept: 'application/json',
    Authorization: `Bearer ${EXPO_PUBLIC_TMDB_HEADER}`
  }
};

export const tmdbBaseUrl = "https://api.themoviedb.org/3";
