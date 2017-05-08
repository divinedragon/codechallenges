package codingbat.string1;

import java.util.Optional;

public class P12_Right2 {

    public String right2(final String str) {
        String returnStr = Optional.ofNullable(str).orElse("");

        if (returnStr.length() <= 2) {
            return returnStr;
        }

        return returnStr.substring(returnStr.length() - 2) + returnStr.substring(0, returnStr.length() - 2);
    }
}
