package codingbat.logic1;

import java.util.Optional;

public class P17_FizzString {

    public String fizzString(final String str) {

        final String string = Optional.ofNullable(str).orElse("").trim();

        if (string.length() == 0) {
            return string;
        }

        final int startPosition = 0;
        final int lastPosition = string.length() - 1;

        final String firstChar = String.valueOf(string.charAt(startPosition));
        final String lastChar = String.valueOf(string.charAt(lastPosition));

        if (firstChar.equalsIgnoreCase("f") && lastChar.equalsIgnoreCase("b")) {
            return "FizzBuzz";
        } else if (firstChar.equalsIgnoreCase("f")) {
            return "Fizz";
        } else if (lastChar.equalsIgnoreCase("b")) {
            return "Buzz";
        } else {
            return string;
        }
    }
}
