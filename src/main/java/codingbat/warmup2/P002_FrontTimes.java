package codingbat.warmup2;

public class P002_FrontTimes {

    public String frontTimes(String str, int n) {

        StringBuilder result = new StringBuilder();

        if (str != null && !str.isEmpty()) {

            String front = (str.length() < 3) ? str : str.substring(0, 3);

            for (int i = 1; i <= n; i++) {
                result.append(front);
            }
        }

        return result.toString();
    }
}
