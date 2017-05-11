package codingbat.string1;

public class P19_MiddleThree {

    public String middleThree(final String str) {

        if (str == null || str.isEmpty() || str.length() % 2 == 0) {
            return "";
        }

        int index = (str.length() - 3) / 2;

        return str.substring(index, index + 3);
    }
}
