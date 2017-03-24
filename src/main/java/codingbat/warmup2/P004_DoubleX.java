package codingbat.warmup2;

public class P004_DoubleX {

    public boolean doubleX(String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        int strLength = str.length();

        for (int i = 0; i < strLength - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }

        return false;
    }
}
