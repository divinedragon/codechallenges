package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P02_SameFirstLastTest {

    private P02_SameFirstLast fixture;

    @Before
    public void setUp() {
        fixture = new P02_SameFirstLast();
    }

    @Test
    public void testcase1() {
        int[] nums = new int[] { 1, 2, 3 };

        boolean expected = false;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] nums = new int[] { 1, 2, 3, 1 };

        boolean expected = true;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] nums = new int[] { 1, 2, 1 };

        boolean expected = true;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsNull() {
        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsEmpty() {
        int[] nums = new int[] {};

        boolean expected = false;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumsIsSingleElement() {
        int[] nums = new int[] { 1 };

        boolean expected = true;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
