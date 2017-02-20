package codingbat.warmup1;

public class P004_Diff21 {

    public int diff21(int n) {
        int diff = n - 21;

        return (diff >= 0) ? (2 * diff) : -(diff);
    }
}
