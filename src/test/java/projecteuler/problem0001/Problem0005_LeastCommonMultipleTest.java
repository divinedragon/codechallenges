package projecteuler.problem0001;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projecteuler.problem0001.Problem0005_LeastCommonMultiple;

public class Problem0005_LeastCommonMultipleTest {

    @DataProvider(name = "testcases")
    public Object[][] testcases() {
        return new Object[][]{
            {new Integer(10), new Integer(2520) },
            {new Integer(20), new Integer(232792560) },
        };
    }

    @Test(dataProvider = "testcases")
    public void testLeastCommonMultiple(final int number, final int expectedResult) {

        assertTrue(expectedResult == Problem0005_LeastCommonMultiple.leastCommonMultiple(number), "LCD calculated incorrect");
    }
}
