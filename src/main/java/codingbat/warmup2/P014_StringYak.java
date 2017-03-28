package codingbat.warmup2;

public class P014_StringYak {

    public String stringYak(final String str) {

        if (str == null) {
            return "";
        }

        if (str.isEmpty() || str.length() < 3) {
            return str;
        }

        return str.replaceAll("y[a-zA-Z0-9]{1}k", "");
    }
}
