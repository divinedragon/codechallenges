package codingbat.string1;

import java.util.Optional;

public class P09_ComboString {

    public String comboString(final String a, final String b) {

        String strA = Optional.ofNullable(a).orElse("");
        String strB = Optional.ofNullable(b).orElse("");

        String shortStr = "";
        String longStr = "";

        if (strA.length() <= strB.length()) {
            shortStr = strA;
            longStr = strB;
        } else {
            shortStr = strB;
            longStr = strA;
        }

        return shortStr + longStr + shortStr;
    }
}
