package codingbat.warmup1;

public class P025_Close10 {

    public int close10(int a, int b) {

        int closeA = Math.abs(10 - a);
        int closeB = Math.abs(10 - b);

        if (closeA < closeB) {
            return a;
        }

        if (closeA > closeB) {
            return b;
        }
        return 0;

    }
}
