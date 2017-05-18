package codingbat.string1;

import java.util.Optional;

public class P24_LastTwo {

    public String lastTwo(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.length() >= 2) {

            int mid = strNormalized.length() - 2;

            return str.substring(0, mid) + str.substring(mid + 1) + str.substring(mid, mid + 1);
        }

        return strNormalized;
    }
}
