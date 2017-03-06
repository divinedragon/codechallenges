package codingbat.warmup1;

public class P024_IntMax {

    public int intMax(int a, int b, int c) {
        int max = (a > b) ? a : b;

        if (c > max) {
            max = c;
        }

        return max;
    }
}
