package codingbat.warmup2;

public class P011_StringMatch {

    public int stringMatch(String a, String b) {

        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            return 0;
        }

        int loopCounter = Math.min(a.length(), b.length());

        int totalMatches = 0;

        for (int i = 0; i < loopCounter - 1; i++) {

            String subStringA = a.substring(i, i + 2);
            String subStringB = b.substring(i, i + 2);

            if (subStringA.equals(subStringB)) {
                totalMatches++;
            }
        }

        return totalMatches;
    }
}
