package projecteuler;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projecteuler.Problem0004_LargestPallindromeProduct;

public class Problem0004_LargestPallindromeProductTest {

    @DataProvider(name = "testcases")
    public Object[][] testCases() {
        return new Object[][] {
            {new Integer(2), new Integer(9009)},
            {new Integer(3), new Integer(906609)}
        };
    }

    @Test(dataProvider = "testcases")
    public void testGetLargestPallindromeProduct(
            final Integer numberOfDigits,
            final Integer expectedResult) {

        assertTrue(expectedResult == Problem0004_LargestPallindromeProduct.getLargestPallindromeProduct(
                numberOfDigits), "Largest Pallindrome calculated incorrectly");
    }
}
