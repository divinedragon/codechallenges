package projecteuler;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem0006_NaturalNumbersTest {

    @Parameters
    public static Object[][] testcases() {
        // @formatter:off
        return new Object[][] {
            {new Integer(10), new Long(2640)},
            {new Integer(100), new Long(25164150)},
            {new Integer(10000), new Long(2500166641665000L)},
        };
        // @formatter:on
    }

    private Integer limit;

    private Long expectedResult;

    public Problem0006_NaturalNumbersTest(final Integer limit, final Long expectedResult) {
        this.limit = limit;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testNaturalNumberProblem6() {
        assertThat(Problem0006_NaturalNumbers.problem6(limit), is(expectedResult));
    }
}
