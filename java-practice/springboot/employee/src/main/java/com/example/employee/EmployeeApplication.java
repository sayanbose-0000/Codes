package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

  public static ConfigurableApplicationContext applicationContext;

  // Runs only once when class is loaded
  static {
    applicationContext = new ClassPathXmlApplicationContext("employeeData.xml");
  }

  public static void main(String[] args) {
    SpringApplication.run(EmployeeApplication.class, args);
  }

  public static ConfigurableApplicationContext getData() {
    return applicationContext;
  }
}
