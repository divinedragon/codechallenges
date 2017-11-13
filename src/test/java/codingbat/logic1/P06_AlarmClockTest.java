package codingbat.logic1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P06_AlarmClockTest {

    private P06_AlarmClock fixture;

    @Before
    public void setUp() {
        fixture = new P06_AlarmClock();
    }

    @Test
    public void shouldReturnOffWhenVacationAndWeekend() {

        final int day1 = 6;
        final int day2 = 0;
        final boolean vacation = true;

        final String expected = P06_AlarmClock.ALARM_OFF;

        final String actual1 = fixture.alarmClock(day1, vacation);
        final String actual2 = fixture.alarmClock(day2, vacation);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnOffWhenVacationAndWeekday() {

        final int day = 2;
        final boolean vacation = true;

        final String expected = P06_AlarmClock.ALARM_10AM;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnOffWhenNotVacationAndWeekend() {

        final int day1 = 0;
        final int day2 = 6;
        final boolean vacation = false;

        final String expected = P06_AlarmClock.ALARM_10AM;

        final String actual1 = fixture.alarmClock(day1, vacation);
        final String actual2 = fixture.alarmClock(day2, vacation);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnOffWhenNotVacationAndWeekday() {

        final int day = 4;
        final boolean vacation = false;

        final String expected = P06_AlarmClock.ALARM_7AM;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual, is(equalTo(expected)));
    }
}
