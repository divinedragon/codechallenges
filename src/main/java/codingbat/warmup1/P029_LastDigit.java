package codingbat.warmup1;

public class P029_LastDigit {

    public boolean lastDigit(int a, int b) {

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;

        return (lastDigitA == lastDigitB);
    }
}
