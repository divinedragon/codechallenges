package codingbat.warmup1;

public class P002_MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}
