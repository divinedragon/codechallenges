package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P14_TeenSumTest {

    private P14_TeenSum fixture;

    @Before
    public void setUp() {
        fixture = new P14_TeenSum();
    }

    @Test
    public void shouldReturnSumWhenNoneOfTheNumberIsTeen() {

        final int a = 10;
        final int b = 11;

        final int expected = a + b;

        final int actual = fixture.teenSum(a, b);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturn19WhenEitherOfTheNumberIsTeen() {

        final int a1 = 13;
        final int b1 = 11;

        final int a2 = 20;
        final int b2 = 19;

        final int expected = 19;

        final int actual1 = fixture.teenSum(a1, b1);
        final int actual2 = fixture.teenSum(a2, b2);

        assertThat(actual1, is(expected));
        assertThat(actual2, is(expected));
    }
}
