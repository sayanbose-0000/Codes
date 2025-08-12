package com.example.country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CountryApplication {
  private static Logger LOGGER = LoggerFactory.getLogger(CountryApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CountryApplication.class, args);


    try(ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("country.xml")) {
      Country us = applicationContext.getBean("countryUS", Country.class);
      Country de = applicationContext.getBean("countryDE", Country.class);
      Country in = applicationContext.getBean("countryIN", Country.class);
      Country jp = applicationContext.getBean("countryJP", Country.class);


      LOGGER.info("Country name: " + us.getCode() + ", country code: " + us.getName());
      LOGGER.info("Country name: " + de.getCode() + ", country code: " + de.getName());
      LOGGER.info("Country name: " + in.getCode() + ", country code: " + in.getName());
      LOGGER.info("Country name: " + jp.getCode() + ", country code: " + jp.getName());
    }
  }
}
