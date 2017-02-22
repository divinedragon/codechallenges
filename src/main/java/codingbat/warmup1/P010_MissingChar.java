package codingbat.warmup1;

public class P010_MissingChar {

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }
}
