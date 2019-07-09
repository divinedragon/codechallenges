package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P13_NearTenTest {

    private P13_NearTen fixture;

    @Before
    public void setUp() {
        fixture = new P13_NearTen();
    }

    @Test
    public void shouldReturnTrueWhenNumberIsTenMultiple() {

        final int number = 20;

        final boolean expected = true;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTrueWhenNumberIsTenMultiplePlus1() {

        final int number = 21;

        final boolean expected = true;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTrueWhenNumberIsTenMultiplePlus2() {

        final int number = 22;

        final boolean expected = true;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnFalseWhenNumberIsTenMultiplePlus3OrMore() {

        final int number = 23;

        final boolean expected = false;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTrueWhenNumberIsTenMultipleMinus1() {

        final int number = 19;

        final boolean expected = true;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTrueWhenNumberIsTenMultipleMinus2() {

        final int number = 18;

        final boolean expected = true;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnFalseWhenNumberIsTenMultipleMinus3OrMore() {

        final int number = 17;

        final boolean expected = false;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual, is(expected));
    }
}
