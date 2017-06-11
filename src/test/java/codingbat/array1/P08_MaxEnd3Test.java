package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P08_MaxEnd3Test {

    private P08_MaxEnd3 fixture;

    @Before
    public void setUp() {
        fixture = new P08_MaxEnd3();
    }

    @Test
    public void testcase1() {
        int[] nums = new int[] { 1, 2, 3 };

        int[] expected = new int[] { 3, 3, 3 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[] { 11, 5, 9 };

        int[] expected = new int[] { 11, 11, 11 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[] { 2, 11, 3 };

        int[] expected = new int[] { 3, 3, 3 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumIsNull() {
        int[] nums = null;

        int[] expected = new int[] {};

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumIsEmpty() {
        int[] nums = new int[] {};

        int[] expected = new int[] {};

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumIsSingleElement() {
        int[] nums = new int[] { 1 };

        int[] expected = new int[] { 1 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
