package com.divinedragon.codechallenges.projecteuler.problem6;

public class NaturalNumbers {

    public static void main(String[] args) {
        problem6(100);
    }

    public static void problem6(int limit) {

        int sumOfNumbers = getSumOfNumbers(limit);
        int squareOfSumOfNumbers = (int) Math.pow(sumOfNumbers, 2);
        int sumOfSquareOfNumbers = getSumOfSquareOfNumbers(limit);
        System.out.println(sumOfNumbers);
        System.out.println(squareOfSumOfNumbers);
        System.out.println(sumOfSquareOfNumbers);
        System.out.println(squareOfSumOfNumbers - sumOfSquareOfNumbers);
    }

    public static int getSumOfNumbers(int limit) {

        return (limit * (limit + 1)) / 2;
    }

    public static int getSumOfSquareOfNumbers(int limit) {

        return (limit * (limit + 1) * ((2 * limit) + 1)) / 6;
    }

}
