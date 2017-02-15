package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P001_SleepInTest {

    private P001_SleepIn fixture;

    @Before
    public void setUp() {
        fixture = new P001_SleepIn();
    }

    @Test
    public void shouldNotSleepIfWeekdayAndNotVacation() {
        boolean shouldSleep = false;

        boolean isWeekday = true;
        boolean isVacation = false;

        boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep, is(equalTo(isSleeping)));
    }

    @Test
    public void shouldSleepIfNotWeekdayAndNotVacation() {
        boolean shouldSleep = true;

        boolean isWeekday = false;
        boolean isVacation = false;

        boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep, is(equalTo(isSleeping)));
    }

    @Test
    public void shouldSleepIfNotWeekdayAndVacation() {
        boolean shouldSleep = true;

        boolean isWeekday = false;
        boolean isVacation = true;

        boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep, is(equalTo(isSleeping)));
    }

    @Test
    public void shouldSleepIfWeekdayAndVacation() {
        boolean shouldSleep = true;

        boolean isWeekday = true;
        boolean isVacation = true;

        boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep, is(equalTo(isSleeping)));
    }
}
