package com.divinedragon.codechallenges.projecteuler.problem2;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        System.out.println("Sum of Even Fibonacci Numbers - " + getEvenFibonacciNumberSum(20));
        System.out.println(
                "Sum of Even Fibonacci Numbers - " + getEvenFibonacciNumberSum(4000000L));
    }

    public static long getEvenFibonacciNumberSum(final long maxValue) {

        long sum = 2L;
        long previous = 1L;
        long current = 2L;
        long next = 0L;

        System.out.print("Fibonacci Numbers --> " + previous + " " + current);

        while (true) {

            next = current + previous;
            previous = current;
            current = next;

            if (next > maxValue) {
                break;
            }

            System.out.print(" " + next);
            if (next % 2 == 0) {
                sum += next;
            }
        }

        System.out.println();
        return sum;
    }
}
