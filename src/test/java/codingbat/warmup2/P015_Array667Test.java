package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P015_Array667Test {

    private P015_Array667 fixture;

    @Before
    public void setUp() {
        fixture = new P015_Array667();
    }

    @Test
    public void testcase1() {

        int[] nums = { 6, 6, 2 };

        int expectedCount = 1;

        int actualCount = fixture.array667(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void testcase2() {

        int[] nums = { 6, 6, 2, 6 };

        int expectedCount = 1;

        int actualCount = fixture.array667(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void testcase3() {

        int[] nums = { 6, 7, 2, 6 };

        int expectedCount = 1;

        int actualCount = fixture.array667(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void testcase4() {

        int[] nums = { 6, 7, 2, 6, 7 };

        int expectedCount = 2;

        int actualCount = fixture.array667(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void testcase5() {

        int[] nums = { 6, 7, 6, 6, 7 };

        int expectedCount = 3;

        int actualCount = fixture.array667(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturn0WhenArrayIsNull() {

        int[] nums = null;

        int expectedCount = 0;

        int actualCount = fixture.array667(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturn0WhenArrayIsEmpty() {

        int[] nums = {};

        int expectedCount = 0;

        int actualCount = fixture.array667(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturn0WhenArrayIsSingleElement() {

        int[] nums1 = { 1 };
        int[] nums2 = { 6 };
        int[] nums3 = { 7 };

        int expectedCount = 0;

        int actualCount1 = fixture.array667(nums1);
        int actualCount2 = fixture.array667(nums2);
        int actualCount3 = fixture.array667(nums3);

        assertThat(actualCount1, is(equalTo(expectedCount)));
        assertThat(actualCount2, is(equalTo(expectedCount)));
        assertThat(actualCount3, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturn0WhenArrayIsDoubleElementAndNotMatching() {

        int[] nums1 = { 1, 2 };
        int[] nums2 = { 6, 5 };
        int[] nums3 = { 6, 8 };
        int[] nums4 = { 7, 6 };
        int[] nums5 = { 7, 7 };

        int expectedCount = 0;

        int actualCount1 = fixture.array667(nums1);
        int actualCount2 = fixture.array667(nums2);
        int actualCount3 = fixture.array667(nums3);
        int actualCount4 = fixture.array667(nums4);
        int actualCount5 = fixture.array667(nums5);

        assertThat(actualCount1, is(equalTo(expectedCount)));
        assertThat(actualCount2, is(equalTo(expectedCount)));
        assertThat(actualCount3, is(equalTo(expectedCount)));
        assertThat(actualCount4, is(equalTo(expectedCount)));
        assertThat(actualCount5, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturn0WhenArrayIsDoubleElementAndMatching() {

        int[] nums1 = { 6, 6 };
        int[] nums2 = { 6, 7 };

        int expectedCount = 1;

        int actualCount1 = fixture.array667(nums1);
        int actualCount2 = fixture.array667(nums2);

        assertThat(actualCount1, is(equalTo(expectedCount)));
        assertThat(actualCount2, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturn0WhenArrayIsMultiElementAndNotMatching() {

        int[] nums1 = { 6, 5, 4 };
        int[] nums2 = { 6, 5, 7, 6 };
        int[] nums3 = { 6, 8, 7, 6, 8 };

        int expectedCount = 0;

        int actualCount1 = fixture.array667(nums1);
        int actualCount2 = fixture.array667(nums2);
        int actualCount3 = fixture.array667(nums3);

        assertThat(actualCount1, is(equalTo(expectedCount)));
        assertThat(actualCount2, is(equalTo(expectedCount)));
        assertThat(actualCount3, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturn0WhenArrayIsMultiElementAndMatching() {

        int[] nums1 = { 6, 6, 4 };
        int[] nums2 = { 6, 7, 6, 6, 5 };
        int[] nums3 = { 6, 6, 6, 7 };

        int expectedCount1 = 1;
        int expectedCount2 = 2;
        int expectedCount3 = 3;

        int actualCount1 = fixture.array667(nums1);
        int actualCount2 = fixture.array667(nums2);
        int actualCount3 = fixture.array667(nums3);

        assertThat(actualCount1, is(equalTo(expectedCount1)));
        assertThat(actualCount2, is(equalTo(expectedCount2)));
        assertThat(actualCount3, is(equalTo(expectedCount3)));
    }
}
