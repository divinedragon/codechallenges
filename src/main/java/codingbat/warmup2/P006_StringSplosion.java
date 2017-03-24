package codingbat.warmup2;

public class P006_StringSplosion {

    public String stringSplosion(String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= str.length(); i++) {
            result.append(str.substring(0, i));
        }

        return result.toString();
    }
}
