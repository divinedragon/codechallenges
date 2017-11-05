package codingbat.logic1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P05_SortaSumTest {

    private P05_SortaSum fixture;

    @Before
    public void setUp() {
        fixture = new P05_SortaSum();
    }

    @Test
    public void shouldReturnSumIfSumIsLessThan10() {

        final int a = 3;
        final int b = 4;

        final int expected = 7;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn20IfSumIsEqualTo10() {

        final int a = 3;
        final int b = 7;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn20IfSumIsGreaterThan10AndLessThan19() {

        final int a = 9;
        final int b = 4;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn20IfSumIsEqualTo19() {

        final int a = 9;
        final int b = 10;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn20IfSumIsGreaterThan19() {

        final int a = 10;
        final int b = 10;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn20IfSumIsGreaterThan20() {

        final int a = 10;
        final int b = 11;

        final int expected = 21;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual, is(equalTo(expected)));
    }
}
