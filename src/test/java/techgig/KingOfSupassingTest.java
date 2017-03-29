package techgig;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.notNull;

import org.junit.Before;
import org.junit.Test;

public class KingOfSupassingTest {

    @Before
    public void setUp() {
        KingOfSupassing fixture = new KingOfSupassing();

        assertThat(fixture, is(notNullValue()));
    }

    @Test
    public void testcase1() {
        int[] input = { 7, 2, 7, 5, 3, 0, 8, 1 };
        int[] expected = { 1, 4, 1, 1, 1, 2, 0, 0 };

        int[] actual = KingOfSupassing.surpassersKing(input);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        int[] input = { 2, 7, 5, 5, 2, 7, 0, 8, 1 };
        int[] expected = { 5, 1, 2, 2, 2, 1, 2, 0, 0 };

        int[] actual = KingOfSupassing.surpassersKing(input);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        int[] input = {};
        int[] expected = {};

        int[] actual = KingOfSupassing.surpassersKing(input);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase4() {
        int[] input = { 1 };
        int[] expected = { 0 };

        int[] actual = KingOfSupassing.surpassersKing(input);

        assertThat(actual, is(equalTo(expected)));
    }
}
