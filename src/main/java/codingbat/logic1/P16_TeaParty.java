package codingbat.logic1;

public class P16_TeaParty {

    public int teaParty(final int tea, final int candy) {

        if (isGood(tea, candy) && isGreat(tea, candy)) {
            return 2;
        } else if (isGood(tea, candy)) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean isGreat(final int tea, final int candy) {

        final int twiceTea = 2 * tea;
        final int twiceCandy = 2 * candy;

        return (tea >= twiceCandy) || (candy >= twiceTea);
    }

    private boolean isGood(final int tea, final int candy) {
        return (tea >= 5 && candy >= 5);
    }
}
