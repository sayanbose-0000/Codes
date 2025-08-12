package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AdvCalcTestCeil.class, AdvCalcTestFloor.class, AdvCalcTestRoot.class, AdvCalcTestSquare.class })
public class AllTests {
}
