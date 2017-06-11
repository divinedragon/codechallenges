package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P09_Sum2Test {

    private P09_Sum2 fixture;

    @Before
    public void setUp() {
        fixture = new P09_Sum2();
    }

    @Test
    public void testcase1() {
        int[] nums = new int[] { 1, 2, 3 };

        int expected = 3;

        int actual = fixture.sum2(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[] { 1, 1 };

        int expected = 2;

        int actual = fixture.sum2(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[] { 1, 1, 1, 1 };

        int expected = 2;

        int actual = fixture.sum2(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnZeroWhenNumIsNull() {
        int[] nums = null;

        int expected = 0;

        int actual = fixture.sum2(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnZeroWhenNumIsEmpty() {
        int[] nums = new int[] {};

        int expected = 0;

        int actual = fixture.sum2(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSumWhenNumIsSingleElement() {
        int[] nums = new int[] { 1 };

        int expected = 1;

        int actual = fixture.sum2(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSumWhenNumIsMultipleElement() {
        int[] nums = new int[] { 1, 2 };

        int expected = 3;

        int actual = fixture.sum2(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
