package codingbat.string1;

public class P07_FirstHalf {

    public String firstHalf(final String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        return str.substring(0, (int) Math.ceil(str.length() / 2.0));
    }
}
