package codingbat.string1;

import java.util.Optional;

public class P16_EndsLy {

    public boolean endsLy(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        return strNormalized.endsWith("ly");
    }
}
