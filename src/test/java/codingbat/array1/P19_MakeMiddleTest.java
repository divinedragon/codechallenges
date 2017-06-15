package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class P19_MakeMiddleTest {

    private P19_MakeMiddle fixture;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new P19_MakeMiddle();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 1, 2, 3, 4 };

        final int[] expected = new int[] { 2, 3 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 7, 1, 2, 3, 4, 9 };

        final int[] expected = new int[] { 2, 3 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldThrowExceptionWhenNumIsOddLength() {
        final int[] nums = new int[] { 1, 2, 3 };

        thrown.expect(IllegalArgumentException.class);

        fixture.makeMiddle(nums);
    }
}
