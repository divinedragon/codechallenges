package codingbat.logic1;

public class P03_SquirrelPlay {

    public boolean squirrelPlay(final int temp, final boolean isSummer) {

        final int lowerLimit = 60;
        final int upperLimit = (isSummer) ? 100 : 90;

        return (temp >= lowerLimit && temp <= upperLimit);
    }
}
