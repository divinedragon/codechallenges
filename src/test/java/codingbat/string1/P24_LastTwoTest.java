package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P24_LastTwoTest {

    private P24_LastTwo fixture;

    @Before
    public void setUp() {
        fixture = new P24_LastTwo();
    }

    @Test
    public void testcase1() {
        String str = "coding";

        String expected = "codign";

        String actual = fixture.lastTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "cat";

        String expected = "cta";

        String actual = fixture.lastTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "ab";

        String expected = "ba";

        String actual = fixture.lastTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.lastTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.lastTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {
        String str = "a";

        String expected = "a";

        String actual = fixture.lastTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
