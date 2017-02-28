package codingbat.warmup1;

public class P031_EveryNth {

    public String everyNth(String str, int n) {

        if (str.length() < n) {
            return str.charAt(0) + "";
        }

        String output = str.charAt(0) + "";

        for (int i = 1; (i * n) < str.length(); i++) {
            output += str.charAt(i * n);
        }

        return output;
    }
}
