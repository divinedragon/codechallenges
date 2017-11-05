package codingbat.logic1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P03_SquirrelPlayTest {

    private P03_SquirrelPlay fixture;

    @Before
    public void setUp() {
        fixture = new P03_SquirrelPlay();
    }

    @Test
    public void shouldReturnFalseWhenTempIsLessThanLowerLimitAndIsNotSummer() {

        final int temp = 59;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenTempIsLessThanLowerLimitAndIsSummer() {

        final int temp = 59;
        final boolean isSummer = true;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenTempIsInRangeAndIsNotSummer() {

        final int temp = 60;
        final boolean isSummer = false;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenTempIsInRangeAndIsSummer() {

        final int temp = 60;
        final boolean isSummer = true;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenTempEqualToUpperLimitAndIsNotSummer() {

        final int temp = 90;
        final boolean isSummer = false;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenTempEqualToUpperLimitAndIsSummer() {

        final int temp = 100;
        final boolean isSummer = true;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenTempGreaterThanUpperLimitAndIsNotSummer() {

        final int temp = 95;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenTempGreaterThanUpperLimitAndIsSummer() {

        final int temp = 101;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual, is(equalTo(expected)));
    }
}
