package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P010_Array123Test {

    private P010_Array123 fixture;

    @Before
    public void setup() {
        fixture = new P010_Array123();
    }

    @Test
    public void shouldReturnFalseWhenArrayIsNull() {

        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.array123(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenArrayIsEmpty() {

        int[] nums = {};

        boolean expected = false;

        boolean actual = fixture.array123(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsLessThan3() {

        int[] nums1 = { 1 };
        int[] nums2 = { 1, 2 };

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.array123(nums1);
        boolean actual2 = fixture.array123(nums2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }

    @Test
    public void shouldReturnTrueWhenArrayLengthIs3And123InSequence() {

        int[] nums = { 1, 2, 3 };

        boolean expected = true;

        boolean actual = fixture.array123(nums);

        assertThat(actual, is(equalTo(expected)));

    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIs3And123NotInSequence() {

        int[] nums = { 3, 1, 2 };

        boolean expected = false;

        boolean actual = fixture.array123(nums);

        assertThat(actual, is(equalTo(expected)));

    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIs3And123DoesntExist() {

        int[] nums = { 7, 8, 9 };

        boolean expected = false;

        boolean actual = fixture.array123(nums);

        assertThat(actual, is(equalTo(expected)));

    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsGreaterThan3And123DoesntExist() {

        int[] nums = { 7, 8, 9, 1, 5 };

        boolean expected = false;

        boolean actual = fixture.array123(nums);

        assertThat(actual, is(equalTo(expected)));

    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsGreaterThan3And123NotInSequence() {

        int[] nums = { 7, 8, 3, 1, 2 };

        boolean expected = false;

        boolean actual = fixture.array123(nums);

        assertThat(actual, is(equalTo(expected)));

    }

    @Test
    public void shouldReturnTrueWhenArrayLengthIsGreaterThan3And123InSequence() {

        int[] nums1 = { 7, 8, 3, 1, 2, 3 };
        int[] nums2 = { 1, 2, 3, 4, 5, 6 };
        int[] nums3 = { 1, 2, 1, 2, 3, 4 };
        int[] nums4 = { 1, 2, 1, 2, 3, 1, 2, 3, 4 };

        boolean expected1 = true;
        boolean expected2 = true;
        boolean expected3 = true;
        boolean expected4 = true;

        boolean actual1 = fixture.array123(nums1);
        boolean actual2 = fixture.array123(nums2);
        boolean actual3 = fixture.array123(nums3);
        boolean actual4 = fixture.array123(nums4);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
        assertThat(actual4, is(equalTo(expected4)));
    }
}
