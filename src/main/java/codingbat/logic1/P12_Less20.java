package codingbat.logic1;

public class P12_Less20 {

    public boolean less20(final int n) {

        final int remainder = n % 20;
        final int twentyMinusRemainder = Math.abs(20 - remainder);

        return twentyMinusRemainder == 1 || twentyMinusRemainder == 2;
    }
}
