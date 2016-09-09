package projecteuler;

public class Problem0145_ReversibleNumbers {

    public static void main(String[] args) {
        int T = 2;
        int[] input = new int[] { 0, 1000, 1000000000 };

        for (int i = 1; i <= T; i++) {
            int N = input[i];
            System.out.println(getCount(N));
        }

    }

    public static long getCount(final long number) {

        int count = 0;

        for (long N = 1L; N < number; N++) {

            if (N % 10 == 0) {
                continue;
            }

            long reverseN = reverse(N);
            // boolean isReversible = isReversible(N, reverseN);
            // System.out.printf("%5d + %5d = %10d | %s\n", N, reverseN, (N +
            // reverseN), isReversible);

            if (isReversible(N, reverseN)) {
                count++;
            }
        }

        return count;
    }

    public static long reverse(final long number) {
        return Long.parseLong((new StringBuilder(number + "").reverse().toString()));
    }

    public static boolean isReversible(final long N, final long reverseN) {

        long sum = N + reverseN;

        if (sum < 10 && sum % 2 == 1) {
            return true;
        }

        String sumStr = sum + "";
        if (sumStr.length() % 2 != 0) {
            return false;
        }

        for (int c = 0; c < sumStr.length(); c++) {
            if (Integer.parseInt(sumStr.substring(c, c + 1)) % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
