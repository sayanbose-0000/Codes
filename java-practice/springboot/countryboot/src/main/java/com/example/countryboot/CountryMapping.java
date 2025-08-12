package com.example.countryboot;

import java.util.ArrayList;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryMapping {

  @GetMapping("/country/{code}")
  public ResponseEntity<String> displayCountry(@PathVariable String code) {
    try (
      ConfigurableApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("country.xml")
    ) {
      ArrayList<Country> countries = (ArrayList<Country>) applicationContext.getBean("countryList");

      return countries
        .stream()
        .filter(c -> c.getCode().equalsIgnoreCase(code))
        .findFirst()
        .map(c -> ResponseEntity.ok("Country name: " + c.getName() + ", code: " + c.getCode()))
        .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country not found"));
    }
  }
}
