package com.library.service;

import com.library.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    private LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public void display() {
        System.out.println("Library Service Running...");
        libraryRepository.display();
    }
}
