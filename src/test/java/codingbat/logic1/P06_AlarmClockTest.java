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

        final int day = 5;
        final boolean vacation = true;

        final String expected = P06_AlarmClock.ALARM_OFF;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual, is(equalTo(expected)));
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

        final int day = 6;
        final boolean vacation = false;

        final String expected = P06_AlarmClock.ALARM_10AM;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual, is(equalTo(expected)));
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
