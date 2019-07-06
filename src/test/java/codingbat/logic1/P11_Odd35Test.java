package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P11_Odd35Test {

    private P11_Odd35 fixture;

    @Before
    public void setUp() {
        fixture = new P11_Odd35();
    }

    @Test
    public void shouldReturnTrueWhenNIsDivisibleBy3ButNotDivisibleBy5() {

        final int n = 3;

        final boolean expected = true;

        final boolean actual = fixture.old35(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTrueWhenNIsNotDivisibleBy3ButDivisibleBy5() {

        final int n = 5;

        final boolean expected = true;

        final boolean actual = fixture.old35(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnFalseWhenNIsDivisibleBy3AndDivisibleBy5() {

        final int n = 15;

        final boolean expected = false;

        final boolean actual = fixture.old35(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnFalseWhenNIsNotDivisibleBy3AndNotDivisibleBy5() {

        final int n = 7;

        final boolean expected = false;

        final boolean actual = fixture.old35(n);

        assertThat(actual, is(expected));
    }
}
