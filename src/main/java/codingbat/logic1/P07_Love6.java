package codingbat.logic1;

public class P07_Love6 {

    public boolean love6(final int a, final int b) {

        final int valueToCompare = 6;

        final boolean any = (a == valueToCompare || b == valueToCompare);
        final boolean sum = ((a + b) == valueToCompare);
        final boolean difference = (Math.abs(a - b) == valueToCompare);

        return any || sum || difference;
    }
}
