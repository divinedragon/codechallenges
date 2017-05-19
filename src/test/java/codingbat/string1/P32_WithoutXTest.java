package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P32_WithoutXTest {

    private P32_WithoutX fixture;

    @Before
    public void setUp() {
        fixture = new P32_WithoutX();
    }

    @Test
    public void testcase1() {
        String str = "xHix";

        String expected = "Hi";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "xHi";

        String expected = "Hi";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "Hxix";

        String expected = "Hxi";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharNotX() {
        String str = "a";

        String expected = "a";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharX() {
        String str = "x";

        String expected = "";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharLeftX() {
        String str = "xxAbxcD";

        String expected = "xAbxcD";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharRightX() {
        String str = "AbxcDxx";

        String expected = "AbxcDx";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharLeftRightX() {
        String str = "xxAbxcDxx";

        String expected = "xAbxcDx";

        String actual = fixture.withoutX(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
