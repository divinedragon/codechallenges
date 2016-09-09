package projecteuler;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem0005_LeastCommonMultipleTest {

    @Parameters
    public static Object[][] testcases() {
        // @formatter:off
        return new Object[][]{
            {new Integer(10), new Integer(2520) },
            {new Integer(20), new Integer(232792560) },
            {new Integer(3), new Integer(6) },
        };
        // @formatter:on
    }

    private Integer number;

    private Integer expectedResult;

    public Problem0005_LeastCommonMultipleTest(final Integer number, final Integer expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testLeastCommonMultiple() {
        assertThat(Problem0005_LeastCommonMultiple.leastCommonMultiple(number), is(expectedResult));
    }
}
