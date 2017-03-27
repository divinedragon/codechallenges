package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P008_ArrayCount9Test {

    private P008_ArrayCount9 fixture;

    @Before
    public void setup() {
        fixture = new P008_ArrayCount9();
    }

    @Test
    public void shouldReturnZeroWhenArrayIsNull() {
        int[] nums = null;

        int expectedCount = 0;

        int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturnZeroWhenArrayIsEmpty() {
        int[] nums = {};

        int expectedCount = 0;

        int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturnZeroWhenArrayHasNo9() {
        int[] nums = { 1, 2, 3, 4, 5 };

        int expectedCount = 0;

        int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturnOneWhenArrayHasOnlyOne9Front() {
        int[] nums = { 9, 2, 3, 4, 5 };

        int expectedCount = 1;

        int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturnOneWhenArrayHasOnlyOne9Mid() {
        int[] nums = { 1, 2, 9, 4, 5 };

        int expectedCount = 1;

        int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturnOneWhenArrayHasOnlyOne9End() {
        int[] nums = { 1, 2, 4, 9 };

        int expectedCount = 1;

        int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturnCorrectCountWhenArrayHasMultiple() {
        int[] nums = { 1, 2, 9, 9, 6, 7, 8, 3, 9, 2 };

        int expectedCount = 3;

        int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }
}
