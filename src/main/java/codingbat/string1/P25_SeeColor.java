package codingbat.string1;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P25_SeeColor {

    public String seeColor(final String str) {

        String strNormalized = Optional.ofNullable(str).orElse("");

        Pattern pattern = Pattern.compile("^(red|blue)");
        Matcher matcher = pattern.matcher(strNormalized);

        return matcher.find() ? matcher.group(1) : "";
    }
}
