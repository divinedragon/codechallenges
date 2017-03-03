package codingbat.warmup1;

public class P020_LoneTeen {

    public boolean loneTeen(int a, int b) {
        return (13 <= a && a <= 19) ^ (13 <= b && b <= 19);
    }
}
