package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P24_FrontPieceTest {

    private P24_FrontPiece fixture;

    @Before
    public void setUp() {
        fixture = new P24_FrontPiece();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
