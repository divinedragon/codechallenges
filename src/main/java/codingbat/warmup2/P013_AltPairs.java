package codingbat.warmup2;

public class P013_AltPairs {

    public String altPairs(final String str) {

        if (str == null) {
            return "";
        }

        if (str.isEmpty() || str.length() <= 2) {
            return str;
        }

        StringBuilder result = new StringBuilder();

        int count = 0;
        int currentCharPos = 2 * count;
        int nextCharPos = currentCharPos + 1;
        int stringLength = str.length();

        do {

            result.append(str.charAt(currentCharPos));

            if (nextCharPos < stringLength) {
                result.append(str.charAt(nextCharPos));
            }

            count += 2;

            currentCharPos = 2 * count;
            nextCharPos = currentCharPos + 1;

        } while (currentCharPos < stringLength);

        return result.toString();
    }

    /********************************************************
     *    This is the official solution on the website.     *
     ********************************************************
    public String altPairsSolution(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i = 0; i < str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }
    */
}
