package codingbat.logic1;

public class P06_AlarmClock {

    static final String ALARM_OFF = "off";

    static final String ALARM_7AM = "7:00";

    static final String ALARM_10AM = "10:00";

    public String alarmClock(final int day, final boolean vacation) {
        if (vacation) {
            if (day >= 5) {
                return ALARM_OFF;
            } else {
                return ALARM_10AM;
            }
        } else {
            if (day >= 5) {
                return ALARM_10AM;
            } else {
                return ALARM_7AM;
            }
        }
    }
}
