package codingbat.warmup2;

public class P005_StringBits {

    public String stringBits(String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
