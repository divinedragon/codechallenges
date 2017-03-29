package projecteuler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem0002_EvenFibonacciNumbersTest {

    private Integer maxValue;

    private Long expectedResult;

    @Parameters
    public static Object[][] testCases() {
        return new Object[][] { { new Integer(4000000), new Long(4613732) } };
    }

    public Problem0002_EvenFibonacciNumbersTest(final Integer maxValue, final Long expectedResult) {
        this.maxValue = maxValue;
        this.expectedResult = expectedResult;
    }

    @Test
    public void getEvenFibonacciNumberSumMaxValue() {
        assertThat(Problem0002_EvenFibonacciNumbers.getEvenFibonacciNumberSum(maxValue), is(expectedResult));
    }
}
