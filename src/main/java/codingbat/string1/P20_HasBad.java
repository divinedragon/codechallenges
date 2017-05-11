package codingbat.string1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P20_HasBad {

    public boolean hasBad(final String str) {
        if (str == null || str.isEmpty() || str.length() < 3) {
            return false;
        }

        Pattern pattern = Pattern.compile("^.{0,1}bad");
        Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }
}
