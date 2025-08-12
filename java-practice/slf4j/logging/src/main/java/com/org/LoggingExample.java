package com.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggingExample {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingExample.class);

    static User user = new User();

    public static void main(String[] args) {
        LOGGER.error("This is an error");
        LOGGER.warn("This is a warning");

        LOGGER.info("The user is {}", user.getData());
    }
}
