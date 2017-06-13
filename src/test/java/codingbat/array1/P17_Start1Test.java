package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P17_Start1Test {

    private P17_Start1 fixture;

    @Before
    public void setUp() {
        fixture = new P17_Start1();
    }

    @Test
    public void testcase1() {
        final int[] a = new int[] { 1, 2, 3 };
        final int[] b = new int[] { 1, 3 };

        final int expected = 2;

        final int actual = fixture.start1(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] a = new int[] { 7, 2, 3 };
        final int[] b = new int[] { 1 };

        final int expected = 1;

        final int actual = fixture.start1(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] a = new int[] { 1, 2 };
        final int[] b = new int[] {};

        final int expected = 1;

        final int actual = fixture.start1(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase4() {
        final int[] a = new int[] {};
        final int[] b = new int[] { 3 };

        final int expected = 0;

        final int actual = fixture.start1(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

}
