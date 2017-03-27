package codingbat.warmup2;

import java.util.stream.IntStream;

public class P012_StringX {

    public String stringX(final String str) {

        if (str == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        if (str.length() >= 3) {

            result.append(str.charAt(0));

            IntStream.range(1, str.length() - 1).forEach(i -> {

                char currentChar = str.charAt(i);

                if (currentChar != 'x') {
                    result.append(currentChar);
                }
            });

            result.append(str.charAt(str.length() - 1));

        } else {
            result.append(str);
        }

        return result.toString();
    }
}
