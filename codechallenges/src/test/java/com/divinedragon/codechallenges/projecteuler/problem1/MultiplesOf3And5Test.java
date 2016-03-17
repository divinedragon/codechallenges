package com.divinedragon.codechallenges.projecteuler.problem1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.divinedragon.codechallenges.projecteuler.problem1.MultiplesOf3And5;

public class MultiplesOf3And5Test {

    @Test
    public void getSumOfMultiples3And5LessThan10() {
        Assert.assertTrue(23 == MultiplesOf3And5.getSumOfMultiples(new int[] {3, 5}, 10),
                "Incorrect Sum of Multiples of 3 and 5 Below 10");
    }

    @Test
    public void getSumOfMultiples3And5LessThan1000() {
        Assert.assertTrue(233168 == MultiplesOf3And5.getSumOfMultiples(new int[] {3, 5}, 1000),
                "Incorrect Sum of Multiples of 3 and 5 Below 1000");
    }
}
