package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P15_Double23Test {

    private P15_Double23 fixture;

    @Before
    public void setUp() {
        fixture = new P15_Double23();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 2, 2 };

        final boolean expected = true;

        final boolean actual = fixture.double23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 3, 3 };

        final boolean expected = true;

        final boolean actual = fixture.double23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 2, 3 };

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsSingleElementAndNot2Or3() {
        final int[] nums = new int[] { 5 };

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
