package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringLearnApplication.class, args);

    displayDate("12/03/2007");
  }

  public static void displayDate(String date) {
    ConfigurableApplicationContext applicationContext =
      new ClassPathXmlApplicationContext("date-format.xml");

    SimpleDateFormat dateFormat = applicationContext.getBean(
      "dateFormat",
      SimpleDateFormat.class
    );

    try {
      System.out.println("The date is: " + dateFormat.parse(date));
    } catch (ParseException pe) {
      System.out.println(pe);
    }

    applicationContext.close();
  }
}
