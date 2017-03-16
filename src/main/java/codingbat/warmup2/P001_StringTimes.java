package codingbat.warmup2;

public class P001_StringTimes {

    public String stringTimes(String str, int n) {

        String result = "";

        for (int i = 1; i <= n; i++) {
            result += str;
        }

        return result;
    }
}
