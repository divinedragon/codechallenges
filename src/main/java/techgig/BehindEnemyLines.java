package techgig;

import java.util.Arrays;

public class BehindEnemyLines {

    public static int appearanceCount(final int wordLength, final int searchStringLength, final String word,
            final String searchString) {

        int count = 0;

        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);

        String wordSorted = new String(wordChars);

        for (int i = 0; i <= (searchStringLength - wordLength); i++) {

            char[] subStringChars = searchString.substring(i, i + wordLength).toCharArray();
            Arrays.sort(subStringChars);

            String subStringSorted = new String(subStringChars);

            if (wordSorted.equals(subStringSorted)) {
                count++;
            }
        }

        return count;
    }
}
