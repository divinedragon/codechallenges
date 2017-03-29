package projecteuler;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem0001_MultiplesOf3And5Test {

    private Integer numberList;

    private Long expectedResult;

    @Parameters
    public static Object[][] testCases() {
        // @formatter:off
        return new Object[][] { { new Integer(10), new Long(23) }, { new Integer(1000), new Long(233168) } };
        // @formatter:on
    }

    public Problem0001_MultiplesOf3And5Test(final Integer numberList, final Long expectedResult) {
        this.numberList = numberList;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testGetSumOfMultiples3And5() {
        assertThat(Problem0001_MultiplesOf3And5.getSumOfMultiplesOf3And5(numberList), is(expectedResult));
    }
}
