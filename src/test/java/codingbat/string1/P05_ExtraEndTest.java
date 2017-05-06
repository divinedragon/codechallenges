package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P05_ExtraEndTest {

    private P05_ExtraEnd fixture;

    @Before
    public void setUp() {
        fixture = new P05_ExtraEnd();
    }

    @Test
    public void testcase1() {
        String str = "Hello";

        String expected = "lololo";

        String actual = fixture.extraEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "ab";

        String expected = "ababab";

        String actual = fixture.extraEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "Hi";

        String expected = "HiHiHi";

        String actual = fixture.extraEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.extraEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.extraEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringWhenStrLengthIsEqualTo1() {
        String str = "a";

        String expected = "aaa";

        String actual = fixture.extraEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
