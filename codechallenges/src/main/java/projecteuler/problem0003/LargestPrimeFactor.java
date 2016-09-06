package projecteuler.problem0003;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactor(600851475143L));
    }

    public static long getLargestPrimeFactor(final long number) {

        long value = number;

        long largestPrimeFactor = 0L;

        /* If the Number is divisible by 2, we will divide it till it can be divided by 2 */
        if (value % 2 == 0) {
            largestPrimeFactor = 2;

            while (value % 2 == 0) {
                value = value / 2;
            }
        }

        long factor = 3L;
        long maxFactor = (long) Math.sqrt(value);

        while (value > 1 && factor < maxFactor) {

            if (value % factor == 0) {
                largestPrimeFactor = factor;

                while (value % factor == 0) {
                    value = value / factor;
                }
            }

            factor = factor + 2;
            maxFactor = (long) Math.sqrt(value);
        }

        if (value == 1) {
            return largestPrimeFactor;
        } else {
            return value;
        }
    }
}
