package codingbat.string1;

import java.util.Optional;

public class P30_DeFront {

    public String deFront(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        String first = strNormalized.length() > 0 && 'a' == strNormalized.charAt(0) ? "a" : "";
        String second = strNormalized.length() > 1 && 'b' == strNormalized.charAt(1) ? "b" : "";
        String rest = strNormalized.length() > 2 ? strNormalized.substring(2) : "";

        return first + second + rest;
    }
}
