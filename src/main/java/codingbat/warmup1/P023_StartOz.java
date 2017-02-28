package codingbat.warmup1;

public class P023_StartOz {

    public String startOz(String str) {

        if (str.length() >= 2) {

            String output = "";

            String first = str.substring(0, 1);
            String second = str.substring(1, 2);

            if ("o".equals(first)) {
                output += first;
            }

            if ("z".equals(second)) {
                output += second;
            }

            return output;

        } else {
            return str;
        }
    }
}
