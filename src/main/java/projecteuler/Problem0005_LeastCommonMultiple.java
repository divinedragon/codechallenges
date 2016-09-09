package projecteuler;

public class Problem0005_LeastCommonMultiple {

    private static final int[] PRIMES = SieveOfEratosthenes.getPrimes(1000);

    public static void main(String[] args) {
        System.out.println(leastCommonMultiple(10));
        System.out.println(leastCommonMultiple(20));
    }

    public static int leastCommonMultiple(final int number) {

        int lcdValue = 1;
        int counter = 0;

        int powerLogicLimit = (int) Math.sqrt(number);

        int[] power = new int[number];
        for (int i = 0; i < power.length; i++) {
            power[i] = 1;
        }

        while (PRIMES[counter] <= number) {

            if (PRIMES[counter] <= powerLogicLimit) {
                power[counter] = (int) (Math.log(number) / Math.log(PRIMES[counter]));
            }

            lcdValue = lcdValue * ((int) Math.pow(PRIMES[counter], power[counter]));

            counter++;
        }

        return lcdValue;
    }
}
