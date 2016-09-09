package projecteuler;

import org.springframework.util.Assert;

public class Problem0004_LargestPallindromeProduct {

    public static void main(String[] args) {

        System.out.println(
                "Largest Pallindrome Product of 2 digit numbers - " + getLargestPallindromeProduct(2, 1000000));
        System.out.println(
                "Largest Pallindrome Product of 3 digit numbers - " + getLargestPallindromeProduct(3, 1000000));
    }

    public static long getLargestPallindromeProduct(final int numberOfDigits, final int productLimit) {

        Assert.isTrue(numberOfDigits > 0);

        long minValue = Long.parseLong("1" + new String(new char[numberOfDigits - 1]).replace("\0", "0"));

        long maxValue = Long.parseLong(new String(new char[numberOfDigits]).replace("\0", "9"));

        long value1 = maxValue;
        long value2 = maxValue;

        long product = 0L;
        String productStr = "";
        String productStrReverse = "";

        long maxProduct = 0L;

        for (value1 = maxValue; value1 >= minValue; value1--) {

            for (value2 = value1; value2 <= maxValue; value2++) {

                product = value1 * value2;

                if (product > maxProduct && product < productLimit) {
                    productStr = product + "";
                    productStrReverse = new StringBuilder(productStr).reverse().toString();

                    if (productStr.equals(productStrReverse)) {
                        maxProduct = product;
                    }
                }
            }
        }

        return maxProduct;
    }
}
