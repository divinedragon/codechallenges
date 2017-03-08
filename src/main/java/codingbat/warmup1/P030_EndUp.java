package codingbat.warmup1;

public class P030_EndUp {

    public String endUp(String str) {

        if (str.length() < 3) {
            return str.toUpperCase();
        }

        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
}
