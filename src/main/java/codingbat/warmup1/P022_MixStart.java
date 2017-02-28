package codingbat.warmup1;

public class P022_MixStart {

    public boolean mixStart(String str) {
        return (str.length() >= 3 && str.substring(1, 3).equals("ix"));
    }
}
