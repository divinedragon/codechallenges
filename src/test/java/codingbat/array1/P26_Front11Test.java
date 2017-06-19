package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P26_Front11Test {

    private P26_Front11 fixture;

    @Before
    public void setUp() {
        fixture = new P26_Front11();
    }

    @Test
    public void testcase1() {
        final int[] a = new int[] { 1, 2, 3 };
        final int[] b = new int[] { 7, 9, 8 };

        final int[] expected = new int[] { 1, 7 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] a = new int[] { 1 };
        final int[] b = new int[] { 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] a = new int[] { 1, 7 };
        final int[] b = new int[] {};

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {
        final int[] a = null;
        final int[] b = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.front11(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {
        final int[] a = new int[] {};
        final int[] b = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.front11(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFromBWhenAIsEmptyAndBIsNonEmpty() {
        final int[] a = new int[] {};
        final int[] b = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual, is(equalTo(expected)));
    }
}
