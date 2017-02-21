package codingbat.warmup1;

public class P005_ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
}
