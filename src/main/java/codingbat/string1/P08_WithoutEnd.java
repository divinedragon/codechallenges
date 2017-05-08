package codingbat.string1;

public class P08_WithoutEnd {
    public String withoutEnd(final String str) {

        if (str == null || str.isEmpty() || str.length() < 2) {
            return "";
        }

        return str.substring(1, str.length() - 1);
    }
}
