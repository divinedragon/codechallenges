package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P26_Make2Test {

    private P26_Make2 fixture;

    @Before
    public void setUp() {
        fixture = new P26_Make2();
    }

    @Test
    public void testcase1() {
        final int[] a = new int[] { 4, 5 };
        final int[] b = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 4, 5 };

        final int[] actual = fixture.make2(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] a = new int[] { 4 };
        final int[] b = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 4, 1 };

        final int[] actual = fixture.make2(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] a = new int[] {};
        final int[] b = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.make2(a, b);

        assertThat(actual, is(equalTo(expected)));
    }
}
