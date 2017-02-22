package codingbat.warmup1;

public class P009_NotString {

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
