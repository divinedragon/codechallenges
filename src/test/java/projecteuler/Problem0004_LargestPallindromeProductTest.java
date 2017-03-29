package projecteuler;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem0004_LargestPallindromeProductTest {

    private Integer numberOfDigits;

    private Integer productLimit;

    private Long expectedResult;

    @Parameters
    public static Object[][] testCases() {
        // @formatter:off
        return new Object[][] { { new Integer(2), 1000000, new Long(9009) },
                { new Integer(3), 1000000, new Long(906609) } };
        // @formatter:on
    }

    public Problem0004_LargestPallindromeProductTest(final Integer numberOfDigits, final Integer productLimit,
            final Long expectedResult) {
        this.numberOfDigits = numberOfDigits;
        this.productLimit = productLimit;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testGetLargestPallindromeProduct() {

        assertThat(Problem0004_LargestPallindromeProduct.getLargestPallindromeProduct(numberOfDigits, productLimit),
                is(expectedResult));
    }
}
