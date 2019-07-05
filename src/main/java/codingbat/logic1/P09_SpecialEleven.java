package codingbat.logic1;

public class P09_SpecialEleven {

    private static final int ELEVEN = 11;

    public boolean specialEleven(final int n) {

        final int remainder = n % ELEVEN;

        return (remainder == 0) || (remainder == 1);
    }
}
