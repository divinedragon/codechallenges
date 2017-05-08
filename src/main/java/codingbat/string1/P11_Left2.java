package codingbat.string1;

import java.util.Optional;

public class P11_Left2 {

    public String left2(final String str) {

        String returnStr = Optional.ofNullable(str).orElse("");

        if (returnStr.length() <= 2) {
            return returnStr;
        }

        return returnStr.substring(2) + returnStr.substring(0, 2);
    }
}
