package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculatorAddTest.class, CalculatorSubtractTest.class })
public class CalculatorSuite {
}
