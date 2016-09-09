package projecteuler;

public class Problem0001_MultiplesOf3And5 {

    public static void main(String[] args) {
        System.out.println("Sum of Multiples of 3 or 5 below 10 --> " + getSumOfMultiplesOf3And5(10));
        System.out.println("Sum of Multiples of 3 or 5 below 1000 --> " + getSumOfMultiplesOf3And5(1000));
    }

    public static long getSumOfMultiplesOf3And5(int limit) {
        return getSumOfMultiple(limit, 3) + getSumOfMultiple(limit, 5) - getSumOfMultiple(limit, 15);
    }

    public static long getSumOfMultiple(final int limit, final int n) {
        long p = (limit - 1) / n;
        return (n * p * (p + 1)) / 2;
    }
}
