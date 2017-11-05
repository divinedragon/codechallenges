package codingbat.logic1;

public class P04_CaughtSpeeding {

    public int caughtSpeeding(final int speed, final boolean isBirthday) {

        final int lowerLimit = (isBirthday) ? 66 : 61;
        final int upperLimit = (isBirthday) ? 85 : 80;

        if (speed < lowerLimit) {
            return 0;
        } else if (speed <= upperLimit) {
            return 1;
        } else {
            return 2;
        }
    }
}
