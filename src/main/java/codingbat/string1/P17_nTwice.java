package codingbat.string1;

public class P17_nTwice {

    public String nTwice(final String str, final int n) {

        if (str == null || str.length() == 0) {
            return "";
        }

        if (str.length() < n) {
            throw new IllegalArgumentException("Length of the String is too short");
        }

        String front = str.substring(0, n);
        String end = str.substring(str.length() - n);

        return front + end;
    }
}
