package projecteuler;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem0003_LargestPrimeFactorTest {

    private Long number;

    private Long expectedResult;

    @Parameters
    public static Object[][] testCases() {
        // @formatter:off
        return new Object[][] { { new Long(13195), new Long(29) }, { new Long(600851475143L), new Long(6857) } };
        // @formatter:on
    }

    public Problem0003_LargestPrimeFactorTest(final Long number, final Long expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testGetLargestPrimeFactor() {
        assertThat(Problem0003_LargestPrimeFactor.getLargestPrimeFactor(number), is(expectedResult));
    }
}