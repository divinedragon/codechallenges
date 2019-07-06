package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P10_More20Test {

    private P10_More20 fixture;

    @Before
    public void setUp() {
        fixture = new P10_More20();
    }

    @Test
    public void shoulReturnFalseWhenNIsAMultipleOf20() {

        final int n = 20;

        final boolean expected = false;

        final boolean actual = fixture.more20(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shoulReturnTrueWhenNIsOneGreatherThanMultipleOf20() {

        final int n = 21;

        final boolean expected = true;

        final boolean actual = fixture.more20(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shoulReturnTrueWhenNIsTwoGreatherThanMultipleOf20() {

        final int n = 22;

        final boolean expected = true;

        final boolean actual = fixture.more20(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shoulReturnFalseWhenNIsMoreGreatherThanMultipleOf20() {

        final int n = 23;

        final boolean expected = false;

        final boolean actual = fixture.more20(n);

        assertThat(actual, is(expected));
    }
}
