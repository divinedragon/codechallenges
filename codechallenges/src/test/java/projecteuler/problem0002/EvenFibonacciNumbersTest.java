package projecteuler.problem0002;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projecteuler.problem0002.EvenFibonacciNumbers;

public class EvenFibonacciNumbersTest {

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
        assertTrue(expectedResult == EvenFibonacciNumbers.getEvenFibonacciNumberSum(maxValue),
                "Sum of Even Valued Fibonacci Numbers is incorrect");
    }
}
