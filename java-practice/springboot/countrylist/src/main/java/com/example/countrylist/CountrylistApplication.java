package com.example.countrylist;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CountrylistApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(CountrylistApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(CountrylistApplication.class, args);

    try (
      ConfigurableApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("country.xml");
    ) {
      ArrayList<Country> countries = new ArrayList<Country>(
        (ArrayList<Country>) applicationContext.getBean("countryList")
      );

      countries.forEach(country ->
        LOGGER.info(
          "Country code: " + country.getCode() + ", name: " + country.getName()
        )
      );
    }
  }
}
