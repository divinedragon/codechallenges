package codingbat.string1;

public class P18_TwoChar {

    public String twoChar(final String str, final int index) {

        if (str == null || str.length() < 2 || index < 0) {
            return "";
        }

        int startIndex = ((index + 2) > str.length()) ? 0 : index;

        return str.substring(startIndex, startIndex + 2);
    }
}
