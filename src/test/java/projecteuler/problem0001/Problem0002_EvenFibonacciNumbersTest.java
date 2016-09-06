package projecteuler.problem0001;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projecteuler.problem0001.Problem0002_EvenFibonacciNumbers;

public class Problem0002_EvenFibonacciNumbersTest {

    @DataProvider(name = "testcases")
    public Object[][] testCases() {
        return new Object[][] {
            {new Integer(4000000), new Integer(4613732)}
        };
    }

    @Test(dataProvider = "testcases")
    public void getEvenFibonacciNumberSumMaxValue(
            final Integer maxValue,
            final Integer expectedResult) {
        assertTrue(expectedResult == Problem0002_EvenFibonacciNumbers.getEvenFibonacciNumberSum(maxValue),
                "Sum of Even Valued Fibonacci Numbers is incorrect");
    }
}
