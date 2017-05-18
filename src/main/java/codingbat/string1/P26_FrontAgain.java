package codingbat.string1;

import java.util.Optional;

public class P26_FrontAgain {

    public boolean frontAgain(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.length() >= 2) {
            String firstTwo = strNormalized.substring(0, 2);
            String lastTwo = strNormalized.substring(strNormalized.length() - 2);

            return firstTwo.equals(lastTwo);
        } else {
            return false;
        }
    }
}
