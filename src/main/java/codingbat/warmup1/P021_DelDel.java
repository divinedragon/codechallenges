package codingbat.warmup1;

public class P021_DelDel {

    public String delDel(String str) {

        if (str.length() >= 4 && "del".equals(str.substring(1, 4))) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }
}
