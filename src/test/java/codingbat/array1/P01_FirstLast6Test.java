package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P01_FirstLast6Test {

    private P01_FirstLast6 fixture;

    @Before
    public void setUp() {
        fixture = new P01_FirstLast6();
    }

    @Test
    public void testcase1() {
        int[] nums = new int[] { 1, 2, 6 };

        boolean expected = true;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[] { 6, 1, 2, 3 };

        boolean expected = true;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[] { 13, 6, 1, 2, 3 };

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumIsNull() {
        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumIsEmpty() {
        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumHasSingleElement6() {
        int[] nums = new int[] { 6 };

        boolean expected = true;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumHasSingleElementNon6() {
        int[] nums = new int[] { 1 };

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
