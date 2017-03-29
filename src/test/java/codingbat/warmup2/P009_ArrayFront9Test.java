package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P009_ArrayFront9Test {

    private P009_ArrayFront9 fixture;

    @Before
    public void setUp() {
        fixture = new P009_ArrayFront9();
    }

    @Test
    public void shouldReturnFalseWhenArrayIsNull() {

        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.arrayFront9(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenArrayIsEmpty() {

        int[] nums = {};

        boolean expected = false;

        boolean actual = fixture.arrayFront9(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsLessThanEqualTo4AndHasNo9() {

        int[] nums1 = { 1 };
        int[] nums2 = { 1, 2 };
        int[] nums3 = { 1, 2, 3 };
        int[] nums4 = { 1, 2, 3, 4 };

        boolean expected1 = false;
        boolean expected2 = false;
        boolean expected3 = false;
        boolean expected4 = false;

        boolean actual1 = fixture.arrayFront9(nums1);
        boolean actual2 = fixture.arrayFront9(nums2);
        boolean actual3 = fixture.arrayFront9(nums3);
        boolean actual4 = fixture.arrayFront9(nums4);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
        assertThat(actual4, is(equalTo(expected4)));
    }

    @Test
    public void shouldReturnTrueWhenArrayLengthIsLessThanEqualTo4AndA9() {

        int[] nums1 = { 9 };
        int[] nums2 = { 1, 9 };
        int[] nums3 = { 1, 9, 3 };
        int[] nums4 = { 1, 9, 3, 4 };

        boolean expected1 = true;
        boolean expected2 = true;
        boolean expected3 = true;
        boolean expected4 = true;

        boolean actual1 = fixture.arrayFront9(nums1);
        boolean actual2 = fixture.arrayFront9(nums2);
        boolean actual3 = fixture.arrayFront9(nums3);
        boolean actual4 = fixture.arrayFront9(nums4);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
        assertThat(actual4, is(equalTo(expected4)));
    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsGreaterThan5AndNo9() {

        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = { 1, 2, 3, 4, 5, 6 };

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.arrayFront9(nums1);
        boolean actual2 = fixture.arrayFront9(nums2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsGreaterThan5AndHas9AfterPosition4() {

        int[] nums1 = { 1, 2, 3, 4, 9 };
        int[] nums2 = { 1, 2, 3, 4, 9, 6 };

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.arrayFront9(nums1);
        boolean actual2 = fixture.arrayFront9(nums2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }

    @Test
    public void shouldReturnTrueWhenArrayLengthIsGreaterThan5AndHas9BeforePosition4() {

        int[] nums1 = { 9, 2, 3, 4, 5 };
        int[] nums2 = { 1, 9, 3, 4, 5, 6 };
        int[] nums3 = { 1, 2, 9, 4, 5, 6 };
        int[] nums4 = { 1, 2, 3, 9, 5, 6 };
        int[] nums5 = { 9, 2, 3, 4, 5, 9 };
        int[] nums6 = { 1, 2, 9, 4, 5, 9 };
        int[] nums7 = { 1, 2, 3, 9, 5, 9 };

        boolean expected1 = true;
        boolean expected2 = true;
        boolean expected3 = true;
        boolean expected4 = true;
        boolean expected5 = true;
        boolean expected6 = true;
        boolean expected7 = true;

        boolean actual1 = fixture.arrayFront9(nums1);
        boolean actual2 = fixture.arrayFront9(nums2);
        boolean actual3 = fixture.arrayFront9(nums3);
        boolean actual4 = fixture.arrayFront9(nums4);
        boolean actual5 = fixture.arrayFront9(nums5);
        boolean actual6 = fixture.arrayFront9(nums6);
        boolean actual7 = fixture.arrayFront9(nums7);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
        assertThat(actual4, is(equalTo(expected4)));
        assertThat(actual5, is(equalTo(expected5)));
        assertThat(actual6, is(equalTo(expected6)));
        assertThat(actual7, is(equalTo(expected7)));
    }
}
