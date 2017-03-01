package codingbat.warmup1;

public class P019_HasTeen {

    public boolean hasTeen(int a, int b, int c) {
        return (13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19);
    }
}
