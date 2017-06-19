package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P25_Unlucky1Test {

    private P25_Unlucky1 fixture;

    @Before
    public void setUp() {
        fixture = new P25_Unlucky1();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 1, 3, 4, 5 };

        final boolean expected = true;

        final boolean actual = fixture.unlucky1(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 2, 1, 3, 4, 5 };

        final boolean expected = true;

        final boolean actual = fixture.unlucky1(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 1, 1, 1 };

        final boolean expected = false;

        final boolean actual = fixture.unlucky1(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.unlucky1(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final boolean expected = false;

        final boolean actual = fixture.unlucky1(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsLengthIsOne() {
        final int[] nums = new int[] { 1 };

        final boolean expected = false;

        final boolean actual = fixture.unlucky1(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumsLengthIsGreaterThan2AndUnluck1AtLastPosition() {

        final int[] nums = new int[] { 1, 2, 3, 1, 3 };

        final boolean expected = true;

        final boolean actual = fixture.unlucky1(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
