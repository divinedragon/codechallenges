package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P20_PlusTwoTest {

    private P20_PlusTwo fixture;

    @Before
    public void setUp() {
        fixture = new P20_PlusTwo();
    }

    @Test
    public void testcase1() {
        final int[] a = new int[] { 1, 2 };
        final int[] b = new int[] { 3, 4 };

        final int[] expected = new int[] { 1, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] a = new int[] { 4, 4 };
        final int[] b = new int[] { 2, 2 };

        final int[] expected = new int[] { 4, 4, 2, 2 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] a = new int[] { 9, 2 };
        final int[] b = new int[] { 3, 4 };

        final int[] expected = new int[] { 9, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

}
