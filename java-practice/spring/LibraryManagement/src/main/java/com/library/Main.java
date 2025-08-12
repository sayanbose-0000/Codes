package com.library;

import com.library.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    BookService bookService = applicationContext.getBean("bookService", BookService.class);

    bookService.display();

    applicationContext.close();
  }
}
