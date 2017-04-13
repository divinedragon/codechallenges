package codingbat.string1;

public class P03_MakeTags {

    public String makeTags(final String tag, final String word) {

        if (tag == null || tag.isEmpty()) {
            return "";
        }

        String wordNormalized = (word != null && !word.isEmpty()) ? word : "";

        return String.format("<%s>%s</%s>", tag, wordNormalized, tag);
    }
}
