package codingbat.logic1;

public class P13_NearTen {

    public boolean nearTen(final int num) {

        final int remainder = num % 10;

        final int closeToTen = (remainder < 5) ? remainder : 10 - remainder;

        return (closeToTen <= 2);
    }
}
