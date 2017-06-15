package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class P22_MiddleThreeTest {

    private P22_MiddleThree fixture;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new P22_MiddleThree();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 1, 2, 3, 4, 5 };

        final int[] expected = new int[] { 2, 3, 4 };

        final int[] actual = fixture.midThree(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 8, 6, 7, 5, 3, 0, 9 };

        final int[] expected = new int[] { 7, 5, 3 };

        final int[] actual = fixture.midThree(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 2, 3 };

        final int[] actual = fixture.midThree(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsNullOrEmpty() {
        final int[] nums1 = null;
        final int[] nums2 = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual1 = fixture.midThree(nums1);
        final int[] actual2 = fixture.midThree(nums2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldThrowExceptionWhenNumsHasEvenElement() {
        final int[] nums = new int[] { 1, 2 };

        thrown.expect(IllegalArgumentException.class);

        fixture.midThree(nums);
    }
}
