package codingbat.string1;

import java.util.Optional;

public class P32_WithoutX {

    public String withoutX(final String str) {
        return Optional
                .ofNullable(str)
                .orElse("")
                .replaceAll("^x", "")
                .replaceAll("x$", "");
    }
}
