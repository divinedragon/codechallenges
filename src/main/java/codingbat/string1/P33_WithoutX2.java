package codingbat.string1;

import java.util.Optional;

public class P33_WithoutX2 {

    public String withoutX2(final String str) {
        String strNormalized = Optional.ofNullable(str).orElse("");

        String front = "";
        String tail = "";
        if (strNormalized.length() <= 2) {
            front = strNormalized;
            tail = "";
        } else {
            front = strNormalized.substring(0, 2);
            tail = strNormalized.substring(2);
        }

        return front.replaceAll("x", "") + tail;
    }
}
