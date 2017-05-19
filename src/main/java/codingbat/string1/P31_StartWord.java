package codingbat.string1;

import java.util.Optional;

public class P31_StartWord {

    public String startWord(final String str, final String word) {
        String strNormalized = Optional.ofNullable(str).orElse("");
        String wordNormalized = Optional.ofNullable(word).orElse("");

        if (strNormalized.length() == 0 || wordNormalized.length() == 0) {
            return "";
        }

        if (strNormalized.length() == 1 && wordNormalized.length() == 1) {
            return strNormalized;
        }

        String search = wordNormalized.length() == 1 ? wordNormalized : wordNormalized.substring(1);
        int startIndex = 1;
        int endIndex = Math.min(strNormalized.length(), 1 + search.length());
        String text = strNormalized.substring(startIndex, endIndex);

        String matchedText = (wordNormalized.length() > 1) ? text : "";
        return (text.equals(search)) ? strNormalized.charAt(0) + matchedText : "";
    }
}
