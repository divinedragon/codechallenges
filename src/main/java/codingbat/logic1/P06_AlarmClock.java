package codingbat.logic1;

public class P06_AlarmClock {

    public static final String ALARM_OFF = "off";

    public static final String ALARM_7AM = "7:00";

    public static final String ALARM_10AM = "10:00";

    public String alarmClock(final int day, final boolean vacation) {
        if (vacation) {
            if (day == 6 || day == 0) {
                return ALARM_OFF;
            } else {
                return ALARM_10AM;
            }
        } else {
            if (day == 6 || day == 0) {
                return ALARM_10AM;
            } else {
                return ALARM_7AM;
            }
        }
    }
}
