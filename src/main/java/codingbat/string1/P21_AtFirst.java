package codingbat.string1;

public class P21_AtFirst {

    public String atFirst(final String str) {

        if (str == null || str.isEmpty()) {
            return "@@";
        }

        if (str.length() == 1) {
            return str.substring(0, 1) + "@";
        }

        return str.substring(0, 2);
    }
}
