package codingbat.string1;

import java.util.Optional;

public class P27_MinCat {

    public String minCat(final String a, final String b) {

        String A = Optional.ofNullable(a).orElse("");
        String B = Optional.ofNullable(b).orElse("");

        if (A.length() > B.length()) {
            return A.substring(A.length() - B.length()) + B;
        } else if (B.length() > A.length()) {
            return A + B.substring(B.length() - A.length());
        } else {
            return A + B;
        }
    }
}
