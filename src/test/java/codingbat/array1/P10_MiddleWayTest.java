package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class P10_MiddleWayTest {

    private P10_MiddleWay fixture;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new P10_MiddleWay();
    }

    @Test
    public void testcase1() {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 4, 5, 6 };

        int[] expected = new int[] { 2, 5 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] a = new int[] { 7, 7, 7 };
        int[] b = new int[] { 3, 8, 0 };

        int[] expected = new int[] { 7, 8 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] a = new int[] { 5, 2, 9 };
        int[] b = new int[] { 1, 4, 5 };

        int[] expected = new int[] { 2, 4 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {
        int[] a = null;
        int[] b = null;

        int[] expected = new int[] {};

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {
        int[] a = new int[] {};
        int[] b = new int[] {};

        int[] expected = new int[] {};

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenOneIsEmptyAndOtherIsNull() {
        int[] a1 = null;
        int[] b1 = new int[] {};

        int[] a2 = new int[] {};
        int[] b2 = null;

        int[] expected = new int[] {};

        int[] actual1 = fixture.middleWay(a1, b1);
        int[] actual2 = fixture.middleWay(a2, b2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldThrowExceptionWhenBothAreInvalidLengths1() {
        int[] a = new int[] { 2, 4 };
        int[] b = new int[] { 1, 2, 3, 4 };

        thrown.expect(IllegalArgumentException.class);

        fixture.middleWay(a, b);
    }

    @Test
    public void shouldThrowExceptionWhenBothAreInvalidLengths2() {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] b = new int[] { 2, 4 };

        thrown.expect(IllegalArgumentException.class);

        fixture.middleWay(a, b);
    }

    @Test
    public void shouldThrowExceptionWhenOneIsValidAndOtherIsInvalidLength1() {
        int[] a = new int[] { 1 };
        int[] b = new int[] { 2, 4 };

        thrown.expect(IllegalArgumentException.class);

        fixture.middleWay(a, b);
    }

    @Test
    public void shouldThrowExceptionWhenOneIsValidAndOtherIsInvalidLength2() {
        int[] a = new int[] { 2, 4 };
        int[] b = new int[] { 1 };

        thrown.expect(IllegalArgumentException.class);

        fixture.middleWay(a, b);
    }

    @Test
    public void shouldReturnValidArrayWhenBothAreValidAndSingleLength() {
        int[] a = new int[] { 1 };
        int[] b = new int[] { 2 };

        int[] expected = new int[] { 1, 2 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnValidArrayWhenBothAreValidAndMultipleLength() {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 1, 2, 3, 4, 5 };

        int[] expected = new int[] { 2, 3 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnValidArrayWhenOneIsEmptyAndOtherIsValidLength() {
        int[] a1 = new int[] { 1 };
        int[] b1 = new int[] {};

        int[] a2 = new int[] {};
        int[] b2 = new int[] { 1, 2, 3 };

        int[] expected1 = new int[] { 1 };
        int[] expected2 = new int[] { 2 };

        int[] actual1 = fixture.middleWay(a1, b1);
        int[] actual2 = fixture.middleWay(a2, b2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }
}
