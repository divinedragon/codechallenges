package projecteuler.problem0004;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import projecteuler.problem0004.LargestPallindromeProduct;

public class LargestPalindromeProductTest {

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

        assertTrue(expectedResult == LargestPallindromeProduct.getLargestPallindromeProduct(
                numberOfDigits), "Largest Pallindrome calculated incorrectly");
    }
}
