package codingbat.string1;

import java.util.Optional;

public class P22_LastChars {
    public String lastChars(final String a, final String b) {

        String aNormalized = Optional.ofNullable(a).filter(s -> !s.isEmpty()).orElse("@");
        String bNormalized = Optional.ofNullable(b).filter(s -> !s.isEmpty()).orElse("@");

        return String.valueOf(aNormalized.charAt(0)) + String.valueOf(bNormalized.charAt(bNormalized.length() - 1));
    }
}
