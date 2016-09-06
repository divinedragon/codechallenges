package projecteuler.problem0001;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projecteuler.problem0001.Problem0006_NaturalNumbers;

public class Problem0006_NaturalNumbersTest {

    @DataProvider(name = "testcases")
    public Object[][] testcases() {
        return new Object[][] {
            {new Integer(10), new Integer(2640)},
            {new Integer(100), new Integer(25164150)}
        };
    }

    @Test(dataProvider = "testcases")
    public void testNaturalNumberProblem6(final int limit, final int expectedResult) {
        assertTrue(expectedResult == Problem0006_NaturalNumbers.problem6(limit),
                "Calculation is incorrect");
    }
}
