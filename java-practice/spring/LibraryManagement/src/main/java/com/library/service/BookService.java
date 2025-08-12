package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public void display() {
    System.out.println("BookService Running...");
    bookRepository.display();
  }
}
