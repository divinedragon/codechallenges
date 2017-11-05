package codingbat.logic1;

public class P05_SortaSum {

    public int sortaSum(final int a, final int b) {
        
        final int sum = a + b;
        
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }
}
