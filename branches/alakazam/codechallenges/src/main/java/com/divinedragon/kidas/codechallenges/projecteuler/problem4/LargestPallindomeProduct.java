package com.divinedragon.kidas.codechallenges.projecteuler.problem4;

import org.springframework.util.Assert;

public class LargestPallindomeProduct {

    public static void main(String[] args) {

        System.out.println("Largest Pallindrome Product of 2 digit numbers - "
                + getLargestPallindromeProduct(2));
        System.out.println("Largest Pallindrome Product of 3 digit numbers - "
                + getLargestPallindromeProduct(3));
    }

    public static long getLargestPallindromeProduct(final int numberOfDigits) {

        Assert.isTrue(numberOfDigits > 0);

        long minValue = Long.parseLong("1" + new String(new char[numberOfDigits - 1]).replace("\0", "0"));

        long maxValue = Long.parseLong(new String(new char[numberOfDigits]).replace("\0", "9"));

        long value1 = maxValue;
        long value2 = maxValue;

        long product = 0L;
        String productStr = "";
        String productStrReverse = "";

        long maxProduct = 0L;

        int checks = 0;
        
        for (value1 = maxValue; value1 >= minValue; value1--) {

            for (value2 = value1; value2 <= maxValue; value2++) {

                product = value1 * value2;

                if (product > maxProduct) {
                    productStr = product + "";
                    productStrReverse = new StringBuilder(productStr).reverse().toString();

                    //System.out.println(value1 + " x " + value2 + " => " + productStr);
                    checks++;
                    if (productStr.equals(productStrReverse)) {
                        maxProduct = product;
                    }
                }
            }
        }

        //System.out.println("Total Checks -> " + checks);
        return maxProduct;
    }
}
