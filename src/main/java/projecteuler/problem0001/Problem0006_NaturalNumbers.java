package projecteuler.problem0001;

public class Problem0006_NaturalNumbers {

    public static void main(String[] args) {
        System.out.println(problem6(10));
        System.out.println(problem6(100));
    }

    public static int problem6(int limit) {

        int sumOfNumbers = getSumOfNumbers(limit);
        int squareOfSumOfNumbers = (int) Math.pow(sumOfNumbers, 2);
        int sumOfSquareOfNumbers = getSumOfSquareOfNumbers(limit);

        return (squareOfSumOfNumbers - sumOfSquareOfNumbers);
    }

    public static int getSumOfNumbers(int limit) {
        return (limit * (limit + 1)) / 2;
    }

    public static int getSumOfSquareOfNumbers(int limit) {
        return (limit * (limit + 1) * ((2 * limit) + 1)) / 6;
    }

}
