package codingbat.string1;

import java.util.Optional;

public class P28_ExtraFront {

    public String extraFront(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        int endIndex = Math.min(strNormalized.length(), 2);

        return strNormalized.substring(0, endIndex) + strNormalized.substring(0, endIndex)
                + strNormalized.substring(0, endIndex);
    }
}
