package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P06_RotateLeft3Test {

    private P06_RotateLeft3 fixture;

    @Before
    public void setUp() {
        fixture = new P06_RotateLeft3();
    }

    @Test
    public void testcase1() {
        int[] nums = new int[] { 1, 2, 3 };

        int[] expected = new int[] { 2, 3, 1 };

        int[] actual = fixture.rotateLeft3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[] { 5, 11, 9 };

        int[] expected = new int[] { 11, 9, 5 };

        int[] actual = fixture.rotateLeft3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[] { 7, 0, 0 };

        int[] expected = new int[] { 0, 0, 7 };

        int[] actual = fixture.rotateLeft3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumIsNull() {
        int[] nums = null;

        int[] expected = new int[] {};

        int[] actual = fixture.rotateLeft3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumIsEmpty() {
        int[] nums = new int[] {};

        int[] expected = new int[] {};

        int[] actual = fixture.rotateLeft3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameArrayWhenNumIsSingleLength() {
        int[] nums = new int[] { 1 };

        int[] expected = new int[] { 1 };

        int[] actual = fixture.rotateLeft3(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
