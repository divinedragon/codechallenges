package codingbat.string1;

import java.util.Optional;

public class P29_Without2 {

    public String without2(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.length() == 0 || strNormalized.length() == 2) {
            return "";
        }

        if (strNormalized.length() > 2
                && strNormalized.substring(0, 2).equals(strNormalized.substring(strNormalized.length() - 2))) {
            return strNormalized.substring(2);
        }
        return strNormalized;
    }
}
