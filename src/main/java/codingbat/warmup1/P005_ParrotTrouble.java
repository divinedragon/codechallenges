package codingbat.warmup1;

public class P005_ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }

        return false;
    }
}
