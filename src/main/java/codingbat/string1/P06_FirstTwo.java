package codingbat.string1;

public class P06_FirstTwo {

    public String firstTwo(final String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        return str.substring(0, Math.min(str.length(), 2));
    }
}
