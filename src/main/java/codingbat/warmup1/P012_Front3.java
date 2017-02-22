package codingbat.warmup1;

public class P012_Front3 {

    public String front3(String str) {
        String front;

        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }
        return front + front + front;
    }
}
