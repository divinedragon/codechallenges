package com.divinedragon.codechallenges.projecteuler.problem2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.divinedragon.codechallenges.projecteuler.problem2.EvenFibonacciNumbers;

public class EvenFibonacciNumbersTest {

    @Test
    public void getEvenFibonacciNumberSumMaxValue10() {

        Assert.assertTrue(4613732 == EvenFibonacciNumbers.getEvenFibonacciNumberSum(4000000),
                "Sum of Even Valued Fibonacci Numbers less than 20 is incorrect");
    }

    @Test
    public void getEvenFibonacciNumberSumMaxValue4Million() {

        Assert.assertTrue(4613732 == EvenFibonacciNumbers.getEvenFibonacciNumberSum(4000000),
                "Sum of Even Valued Fibonacci Numbers less than 20 is incorrect");
    }
}
