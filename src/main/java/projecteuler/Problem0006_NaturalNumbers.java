package projecteuler;

public class Problem0006_NaturalNumbers {

    public static void main(String[] args) {
        System.out.println(problem6(10));
        System.out.println(problem6(100));
        System.out.println(problem6(10000));
    }

    public static long problem6(int limit) {

        long sumOfNumbers = getSumOfNumbers(limit);
        long squareOfSumOfNumbers = (long) Math.pow(sumOfNumbers, 2);
        long sumOfSquareOfNumbers = getSumOfSquareOfNumbers(limit);

        return (squareOfSumOfNumbers - sumOfSquareOfNumbers);
    }

    public static long getSumOfNumbers(int limit) {
        return (limit * (limit + 1L)) / 2;
    }

    public static long getSumOfSquareOfNumbers(int limit) {
        return (limit * (limit + 1L) * ((2 * limit) + 1)) / 6;
    }
}
