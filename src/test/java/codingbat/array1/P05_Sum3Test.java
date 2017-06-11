package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P05_Sum3Test {

    private P05_Sum3 fixture;

    @Before
    public void setUp() {
        fixture = new P05_Sum3();
    }

    @Test
    public void testcase1() {
        int[] nums = new int[] { 1, 2, 3 };

        int expected = 6;

        int actual = fixture.sum3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[] { 5, 11, 2 };

        int expected = 18;

        int actual = fixture.sum3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[] { 7, 0, 0 };

        int expected = 7;

        int actual = fixture.sum3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnZeroWhenNumIsNullOrEmpty() {
        int[] nums1 = null;
        int[] nums2 = new int[] {};

        int expected = 0;

        int actual1 = fixture.sum3(nums1);
        int actual2 = fixture.sum3(nums2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSumWhenNumLengthIsLessThanEqualTo3() {
        int[] nums1 = new int[] { 1 };
        int[] nums2 = new int[] { 1, 0 };
        int[] nums3 = new int[] { 1, 0, 0 };

        int expected = 1;

        int actual1 = fixture.sum3(nums1);
        int actual2 = fixture.sum3(nums2);
        int actual3 = fixture.sum3(nums3);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
        assertThat(actual3, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSumWhenNumLengthIsGreaterThan3() {
        int[] nums = new int[] { 1, 0, 0, 2 };

        int expected = 1;
        int actual = fixture.sum3(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
