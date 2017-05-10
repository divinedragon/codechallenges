package codingbat.string1;

import java.util.Optional;

public class P15_MiddleTwo {

    public String middleTwo(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.length() > 0) {
            if (strNormalized.length() % 2 != 0) {
                throw new UnsupportedOperationException("MiddleTwo for odd lengths is not supported");
            }

            int middlePos = (strNormalized.length() / 2) - 1;

            return strNormalized.substring(middlePos, middlePos + 2);
        }

        return "";

    }
}
