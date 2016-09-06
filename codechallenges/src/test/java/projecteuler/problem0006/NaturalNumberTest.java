package com.divinedragon.codechallenges.projecteuler.problem6;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NaturalNumberTest {

    @DataProvider(name = "testcases")
    public Object[][] testcases() {
        return new Object[][] {
            {new Integer(10), new Integer(2640)},
            {new Integer(100), new Integer(25164150)}
        };
    }

    @Test(dataProvider = "testcases")
    public void testNaturalNumberProblem6(final int limit, final int expectedResult) {
        assertTrue(expectedResult == NaturalNumbers.problem6(limit),
                "Calculation is incorrect");
    }
}
