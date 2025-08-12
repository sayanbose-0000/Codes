package com.example.country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

  private Logger LOGGER = LoggerFactory.getLogger(Country.class);

  private String code;
  private String name;

  public void setName(String name) {
    LOGGER.info("setName() running");
    this.name = name;
  }

  public void setCode(String code) {
    LOGGER.info("setCode() running");
    this.code = code;
  }

  public String getName() {
    LOGGER.info("getName() running");
    return name;
  }

  public String getCode() {
    LOGGER.info("getCode() running");
    return code;
  }
}
