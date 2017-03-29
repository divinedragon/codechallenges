package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P017_Has271Test {

    private P017_Has271 fixture;

    @Before
    public void setUp() {
        fixture = new P017_Has271();
    }

    @Test
    public void testcase1() {

        int[] nums = { 1, 2, 7, 1 };

        boolean expected = true;

        boolean actual = fixture.has271(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {

        int[] nums = { 1, 2, 8, 1 };

        boolean expected = false;

        boolean actual = fixture.has271(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {

        int[] nums = { 2, 7, 1 };

        boolean expected = true;

        boolean actual = fixture.has271(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase4() {

        int[] nums = { 1, 2, 7, 5 };

        boolean expected = false;

        boolean actual = fixture.has271(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenArrayIsNull() {

        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.has271(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenArrayIsEmpty() {

        int[] nums = {};

        boolean expected = false;

        boolean actual = fixture.has271(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsLessThanEqualTo2() {

        int[] nums1 = { 1 };
        int[] nums2 = { 1, 2 };

        boolean expected = false;

        boolean actual1 = fixture.has271(nums1);
        boolean actual2 = fixture.has271(nums2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }
}
