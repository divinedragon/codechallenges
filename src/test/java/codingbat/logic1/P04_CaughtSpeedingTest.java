package codingbat.logic1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P04_CaughtSpeedingTest {

    private P04_CaughtSpeeding fixture;

    @Before
    public void setUp() {
        fixture = new P04_CaughtSpeeding();
    }

    @Test
    public void shouldReturn0WhenSpeedIsLessThanLowerLimitAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 59;

        final int expected = 0;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn0WhenSpeedIsLessThanLowerLimitAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 64;

        final int expected = 0;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 61;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 66;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeUpperAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 80;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeUpperAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 85;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn1WhenSpeedIsHigherAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 81;

        final int expected = 2;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn1WhenSpeedIsHigherAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 86;

        final int expected = 2;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual, is(equalTo(expected)));
    }
}
