package codingbat.warmup1;

public class P015_Front22 {

    public String front22(String str) {

        String prefixSuffix;

        if (str.length() >= 2) {
            prefixSuffix = str.substring(0, 2);
        } else {
            prefixSuffix = str;
        }

        return prefixSuffix + str + prefixSuffix;
    }
}
