package com.example.tight_coupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightCouplingApplication {

  public static void main(String[] args) {
    SpringApplication.run(TightCouplingApplication.class, args);

    UserManager userManager = new UserManager();
    System.out.println(userManager.getUserInfo());
  }
}
