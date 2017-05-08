package codingbat.string1;

import java.util.Optional;

public class P13_TheEnd {

    public String theEnd(final String str, final boolean front) {
        String s = Optional.ofNullable(str).orElse("");

        String frontChar = s.substring(0, Math.min(s.length(), 1));
        String lastChar = s.substring(Math.max(0, s.length() - 1));
        return (front) ? frontChar : lastChar;
    }
}
