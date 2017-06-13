package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P11_MakeEndsTest {

    private P11_MakeEnds fixture;

    @Before
    public void setUp() {
        fixture = new P11_MakeEnds();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 3 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 1, 2, 3, 4 };

        final int[] expected = new int[] { 1, 4 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 7, 4, 6, 2 };

        final int[] expected = new int[] { 7, 2 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnValidWhenNumIsSingleElement() {
        final int[] nums = new int[] { 1 };

        final int[] expected = new int[] { 1 , 1};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnValidWhenNumIsDoubleElement() {
        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
