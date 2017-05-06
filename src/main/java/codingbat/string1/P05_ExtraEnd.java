package codingbat.string1;

public class P05_ExtraEnd {

    public String extraEnd(final String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        String suffix = str.substring(Math.max(str.length() - 2, 0));

        StringBuilder result = new StringBuilder();
        for (int i = 3; i > 0; i--) {
            result.append(suffix);
        }

        return result.toString();
    }
}
