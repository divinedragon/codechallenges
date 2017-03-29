package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P016_NoTriplesTest {

    private P016_NoTriples fixture;

    @Before
    public void setUp() {
        fixture = new P016_NoTriples();
    }

    @Test
    public void testcase1() {
        int[] nums = { 1, 1, 2, 2, 1 };

        boolean expected = true;

        boolean actual = fixture.noTriples(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums = { 1, 1, 2, 2, 2, 1 };

        boolean expected = false;

        boolean actual = fixture.noTriples(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums = { 1, 1, 1, 2, 2, 2, 1 };

        boolean expected = false;

        boolean actual = fixture.noTriples(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumIsNull() {
        int[] nums = null;

        boolean expected = true;

        boolean actual = fixture.noTriples(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumIsEmpty() {
        int[] nums = {};

        boolean expected = true;

        boolean actual = fixture.noTriples(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumsHasLessThan3Elements() {
        int[] nums = { 1, 1 };

        boolean expected = true;

        boolean actual = fixture.noTriples(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumsHas3Elements() {
        int[] nums = { 1, 1, 1 };

        boolean expected = false;

        boolean actual = fixture.noTriples(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
