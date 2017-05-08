package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P07_FirstHalfTest {

    private P07_FirstHalf fixture;

    @Before
    public void setUp() {
        fixture = new P07_FirstHalf();
    }

    @Test
    public void testcase1() {
        String str = "WooHoo";

        String expected = "Woo";

        String actual = fixture.firstHalf(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "HelloThere";

        String expected = "Hello";

        String actual = fixture.firstHalf(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "abcdef";

        String expected = "abc";

        String actual = fixture.firstHalf(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.firstHalf(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.firstHalf(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {
        String str = "a";

        String expected = "a";

        String actual = fixture.firstHalf(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFirstCharWhenStrIsDoubleChar() {
        String str = "ab";

        String expected = "a";

        String actual = fixture.firstHalf(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
