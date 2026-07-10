package com.example.loose_coupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LooseCouplingApplication {

  public static void main(String[] args) {
    SpringApplication.run(LooseCouplingApplication.class, args);

    UserProvider userDatabaseProvider = new UserDatabase();
    UserManager userManager = new UserManager(userDatabaseProvider);

    System.out.println(userManager.getUserInfo());


    UserProvider userWebServiceProvider = new UserDatabase();
    UserManager userManager2 = new UserManager(userWebServiceProvider);

    System.out.println(userManager2.getUserInfo());
  }
}
