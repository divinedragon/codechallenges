package problem0005;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projecteuler.problem0005.LeastCommonMultiple;

public class LeastCommonMultipleTest {

    @DataProvider(name = "testcases")
    public Object[][] testcases() {
        return new Object[][]{
            {new Integer(10), new Integer(2520) },
            {new Integer(20), new Integer(232792560) },
        };
    }

    @Test(dataProvider = "testcases")
    public void testLeastCommonMultiple(final int number, final int expectedResult) {

        assertTrue(expectedResult == LeastCommonMultiple.leastCommonMultiple(number), "LCD calculated incorrect");
    }
}
