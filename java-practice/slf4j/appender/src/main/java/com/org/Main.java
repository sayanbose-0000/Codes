package com.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger LOGGER = LoggerFactory.getLogger(Main.class);

        LOGGER.info("This is an info");
        LOGGER.error("This is an error message");
        LOGGER.warn("This is a warning");
    }
}