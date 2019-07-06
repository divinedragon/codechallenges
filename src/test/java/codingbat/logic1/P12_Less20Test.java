package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P12_Less20Test {

    private P12_Less20 fixture;

    @Before
    public void setUp() {
        fixture = new P12_Less20();
    }

    @Test
    public void shoulReturnFalseWhenNIsAMultipleOf20() {

        final int n = 20;

        final boolean expected = false;

        final boolean actual = fixture.less20(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shoulReturnTrueWhenNIsOneLessThanMultipleOf20() {

        final int n = 19;

        final boolean expected = true;

        final boolean actual = fixture.less20(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shoulReturnTrueWhenNIsTwoLessThanMultipleOf20() {

        final int n = 18;

        final boolean expected = true;

        final boolean actual = fixture.less20(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shoulReturnFalseWhenNIsMoreLessThanMultipleOf20() {

        final int n = 17;

        final boolean expected = false;

        final boolean actual = fixture.less20(n);

        assertThat(actual, is(expected));
    }

}
