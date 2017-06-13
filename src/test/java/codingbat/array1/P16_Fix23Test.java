package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P16_Fix23Test {

    private P16_Fix23 fixture;

    @Before
    public void setUp() {
        fixture = new P16_Fix23();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 2, 0 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 2, 3, 5 };

        final int[] expected = new int[] { 2, 0, 5 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 1, 2, 1 };

        final int[] expected = new int[] { 1, 2, 1 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameWhenNumsIsSingleElement() {
        final int[] nums = new int[] { 2 };

        final int[] expected = new int[] { 2 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnValidWhenNumsIsDoubleElementAnd2and3() {
        final int[] nums = new int[] { 2, 3 };

        final int[] expected = new int[] { 2, 0 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnValidWhenNumsIsDoubleElementAndNot2and3() {
        final int[] nums = new int[] { 3, 2 };

        final int[] expected = new int[] { 3, 2 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
