package com.divinedragon.codechallenges.projecteuler.problem3;

public final class SieveOfEratosthenes {

    private static int[] PRIMES;

    private static int MAX = 1000;

    static {
        PRIMES = new int[MAX];
        int primeCounter = 0;

        int n = (int) (10 * MAX); // Overestimate by 40%

        boolean[] isPrimeArray = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrimeArray[i] = true;
        }

        for (int i = 2; i <= n && primeCounter != MAX; i++) {
            if (isPrimeArray[i]) {
                PRIMES[primeCounter] = i;
                primeCounter++;

                for (int j = i; i * j <= n; j++) {
                    isPrimeArray[i * j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int limit = 1000;
        int[] myPrimes = getPrimes(limit);
        for (int i = 0; i < limit; i++) {
            System.out.println(myPrimes[i]);
        }
    }

    public static int[] getPrimes(int limit) {

        if (limit > MAX) {
            throw new UnsupportedOperationException(
                    "Supported Prime Number generation limit is 1000.");
        }

        int[] outputPrimes = new int[limit];

        for (int i = 0; i < limit; i++) {
            outputPrimes[i] = PRIMES[i];
        }

        return outputPrimes;
    }
}
