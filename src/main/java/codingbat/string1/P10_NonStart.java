package codingbat.string1;

import java.util.Optional;

public class P10_NonStart {

    public String nonStart(final String a, final String b) {

        String strA = Optional.ofNullable(a).orElse("");
        String strB = Optional.ofNullable(b).orElse("");

        String A = strA.substring(Math.min(strA.length(), 1));
        String B = strB.substring(Math.min(strB.length(), 1));

        return A + B;
    }
}
