import { useEffect, useState } from "react";

// Custom hook to get data
export const useFetch = <T>(fetchData: () => Promise<T>, fetchOnMount: boolean = false) => {
  const [data, setData] = useState<T | null>(null);
  const [error, setError] = useState<Error | null>(null);
  const [loading, setLoading] = useState<boolean>(false);

  const runHook = async () => {
    try {
      setLoading(true);
      const response = await fetchData();
      setData(response);

    } catch (err) {
      setError(err as Error);

    } finally {
      setLoading(false);
    }
  };

  const resetHook = () => {
    setData(null);
    setError(null);
    setLoading(false);
  };

  useEffect(() => {
    if (fetchOnMount) {
      runHook();
    }
  }, []);

  return { data, error, loading, runHook, resetHook };
};
