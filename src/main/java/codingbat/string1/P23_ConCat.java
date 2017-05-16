package codingbat.string1;

import java.util.Optional;

public class P23_ConCat {

    public String conCat(final String a, final String b) {
        String aNormalized = Optional.ofNullable(a).orElse("");
        String bNormalized = Optional.ofNullable(b).orElse("");

        if (aNormalized.length() > 0 && bNormalized.length() > 0) {

            if (aNormalized.charAt(aNormalized.length() - 1) == bNormalized.charAt(0)) {
                return aNormalized.substring(0, aNormalized.length() - 1) + bNormalized;
            }
        }

        return aNormalized + bNormalized;
    }
}
