package codingbat.logic1;

public class P10_More20 {

    public boolean more20(final int n) {

        final int remainder = n % 20;

        return remainder == 1 || remainder == 2;
    }
}
