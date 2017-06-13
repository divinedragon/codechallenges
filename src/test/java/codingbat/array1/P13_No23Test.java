package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P13_No23Test {

    private P13_No23 fixture;

    @Before
    public void setUp() {
        fixture = new P13_No23();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 4, 5 };

        boolean expected = true;

        boolean actual = fixture.no23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 4, 2 };

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 3, 5 };

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsNull() {
        final int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumsIsSingleElementAndDoesntHave2Or3() {
        final int[] nums = new int[] { 4 };

        boolean expected = true;

        boolean actual = fixture.no23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsSingleElementAndHas2Or3() {
        final int[] nums1 = new int[] { 2 };
        final int[] nums2 = new int[] { 3 };

        boolean expected = false;

        boolean actual1 = fixture.no23(nums1);
        boolean actual2 = fixture.no23(nums2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }
}
