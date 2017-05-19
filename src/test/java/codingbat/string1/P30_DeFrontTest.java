package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P30_DeFrontTest {

    private P30_DeFront fixture;

    @Before
    public void setUp() {
        fixture = new P30_DeFront();
    }

    @Test
    public void testcase1() {
        String str = "Hello";

        String expected = "llo";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "java";

        String expected = "va";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "away";

        String expected = "aay";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharA() {
        String str = "a";

        String expected = "a";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharNotA() {
        String str = "b";

        String expected = "";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharAB() {
        String str = "ab";

        String expected = "ab";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharANotB() {
        String str = "ax";

        String expected = "a";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharNotAB() {
        String str = "xb";

        String expected = "b";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharNotANotB() {
        String str = "xx";

        String expected = "";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAB() {
        String str = "abx";

        String expected = "abx";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharANotB() {
        String str = "axx";

        String expected = "ax";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharNotAB() {
        String str = "xbx";

        String expected = "bx";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharNotANotB() {
        String str = "xxx";

        String expected = "x";

        String actual = fixture.deFront(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
