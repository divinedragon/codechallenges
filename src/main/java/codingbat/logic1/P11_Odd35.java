package codingbat.logic1;

public class P11_Odd35 {

    public boolean old35(final int n) {

        final boolean isDivisibleBy3 = (n % 3 == 0);
        final boolean isDivisibleBy5 = (n % 5 == 0);

        return (isDivisibleBy3 && !isDivisibleBy5) || (!isDivisibleBy3 && isDivisibleBy5);
    }
}
