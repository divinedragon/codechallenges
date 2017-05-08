package codingbat.string1;

import java.util.Optional;

public class P14_WithoutEnd2 {

    public String withouEnd2(final String str) {
        String s = Optional.ofNullable(str).orElse("");

        if (s.length() <= 2) {
            return "";
        }

        int beginIndex = Math.min(s.length(), 1);
        int endIndex = Math.max(0, s.length() - 1);

        return s.substring(beginIndex, endIndex);
    }
}
