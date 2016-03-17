package com.divinedragon.codechallenges.projecteuler.problem1;

public class MultiplesOf3And5 {

    public static void main(String[] args) {

        System.out.println("Sum of Multiples of 3 or 5 below 10 --> "
                + getSumOfMultiples(new int[] {3, 5}, 10));
        System.out.println("Sum of Multiples of 3 or 5 below 1000 --> "
                + getSumOfMultiples(new int[] {3, 5}, 1000));

    }

    public static long getSumOfMultiples(final int[] multipliers, final int numberLimit) {

        long sum = 0L;

        for (int num = 1; num < numberLimit; num++) {

            for (int multiplier : multipliers) {

                if (num % multiplier == 0) {
                    sum += num;
                    break;
                }
            }
        }

        return sum;
    }
}
