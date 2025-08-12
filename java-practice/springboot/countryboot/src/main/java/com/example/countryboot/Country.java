package com.example.countryboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

  private static Logger LOGGER = LoggerFactory.getLogger(Country.class);

  private String code;
  private String name;

  public String getCode() {
    LOGGER.info("Started getCode()");
    return code;
  }

  public String getName() {
    LOGGER.info("Started getName()");
    return name;
  }

  public void setCode(String code) {
    LOGGER.info("Started setCode()");
    this.code = code;
  }

  public void setName(String name) {
    LOGGER.info("Started setName()");
    this.name = name;
  }
}
