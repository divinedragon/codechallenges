package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P04_CommonEndTest {

    private P04_CommonEnd fixture;

    @Before
    public void setUp() {
        fixture = new P04_CommonEnd();
    }

    @Test
    public void testcase1() {
        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 7, 3 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 7, 3, 2 };

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 1, 3 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenBothNull() {
        int[] nums1 = null;
        int[] nums2 = null;

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenBothAreEmpty() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {};

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenOneIsNullAndOtherIsEmpty() {
        int[] nums1_1 = null;
        int[] nums2_1 = new int[] {};

        int[] nums1_2 = new int[] {};
        int[] nums2_2 = null;

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }

    @Test
    public void shouldReturnFalseWhenBothAreSingleElementAndSameValue() {
        int[] nums1 = new int[] { 1 };
        int[] nums2 = new int[] { 1 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenBothAreSingleElementAndNotSameValue() {
        int[] nums1 = new int[] { 1 };
        int[] nums2 = new int[] { 2 };

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenEndsAreSameValue() {
        int[] nums1 = new int[] { 1, 1 };
        int[] nums2 = new int[] { 2, 1 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstAreSameValue() {
        int[] nums1 = new int[] { 1, 2 };
        int[] nums2 = new int[] { 1, 1 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstAndLastAreSame() {
        int[] nums1_1 = new int[] { 1, 2 };
        int[] nums2_1 = new int[] { 3, 1 };

        int[] nums1_2 = new int[] { 2, 1 };
        int[] nums2_2 = new int[] { 1, 3 };

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }
}
