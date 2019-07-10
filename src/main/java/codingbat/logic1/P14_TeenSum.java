package codingbat.logic1;

public class P14_TeenSum {

    public int teenSum(final int a, final int b) {
        return (isTeen(a) || isTeen(b)) ? 19 : (a + b);
    }

    private boolean isTeen(final int number) {
        return (number >= 13 && number <= 19);
    }
}
