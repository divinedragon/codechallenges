package codingbat.warmup1;

public class P013_BackAround {

    public String backAround(String str) {

        String prefixSuffix;

        if (str.length() >= 1) {
            prefixSuffix = str.substring(str.length() - 1);
        } else {
            prefixSuffix = str;
        }

        return prefixSuffix + str + prefixSuffix;
    }
}
