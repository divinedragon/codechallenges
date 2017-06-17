package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class P23_MaxTripleTest {

    private P23_MaxTriple fixture;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new P23_MaxTriple();
    }

    @Test
    public void testcase1() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int expected = 3;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final int[] nums = new int[] { 1, 5, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final int[] nums = new int[] { 5, 2, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldThrowExceptionWhenNull() {
        final int[] nums = null;

        thrown.expect(IllegalArgumentException.class);

        fixture.maxTriple(nums);
    }

    @Test
    public void shouldThrowExceptionWhenEmpty() {
        final int[] nums = new int[] {};

        thrown.expect(IllegalArgumentException.class);

        fixture.maxTriple(nums);
    }

    @Test
    public void shouldThrowExceptionWhenEvenLength() {
        final int[] nums = new int[] { 5, 2 };

        thrown.expect(IllegalArgumentException.class);

        fixture.maxTriple(nums);
    }

    @Test
    public void shouldReturnSameWhenSingleElement() {
        final int[] nums = new int[] { 5 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual, is(equalTo(expected)));
    }
}
