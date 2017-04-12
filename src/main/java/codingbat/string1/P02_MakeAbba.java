package codingbat.string1;

public class P02_MakeAbba {

    public String makeAbba(final String a, final String b) {

        StringBuilder result = new StringBuilder();

        String aNormalized = (a != null && !a.isEmpty()) ? a : "";
        String bNormalized = (b != null && !b.isEmpty()) ? b : "";

        // @formatter:off
        return result
                .append(aNormalized)
                .append(bNormalized)
                .append(bNormalized)
                .append(aNormalized)
                .toString();
        // @formatter:on
    }
}
