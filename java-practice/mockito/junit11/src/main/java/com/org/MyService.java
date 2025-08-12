package com.org;

// MyService implements the ExternalAPI
// We want to test if MyService works, but how to?? External API isn't implemented yet!!
public class MyService {
    public String fetchData(ExternalAPI api) {
            System.out.println("My Service running...");
            return api.getData();
    }
}
