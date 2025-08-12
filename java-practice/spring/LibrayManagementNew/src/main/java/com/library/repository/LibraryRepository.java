package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LibraryRepository {
    public void display() {
        System.out.println("Library Repository Running...");
    }
}
