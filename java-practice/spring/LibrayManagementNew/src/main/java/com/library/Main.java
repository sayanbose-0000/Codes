package com.library;

import com.library.service.LibraryService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        LibraryService ls = applicationContext.getBean(LibraryService.class);
        ls.display();

        System.out.println("BookService Loaded: " + applicationContext);

        applicationContext.close();
    }
}
