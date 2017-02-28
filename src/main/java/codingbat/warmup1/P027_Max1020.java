package codingbat.warmup1;

public class P027_Max1020 {

    public int max1020(int a, int b) {

        boolean isAinRange = (10 <= a && a <= 20);
        boolean isBinRange = (10 <= b && b <= 20);

        int max = 0;

        if (isAinRange && a > max) {
            max = a;
        }

        if (isBinRange && b > max) {
            max = b;
        }

        return max;
    }
}
