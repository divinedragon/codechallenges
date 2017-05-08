package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P08_WithoutEndTest {

    private P08_WithoutEnd fixture;

    @Before
    public void setUp() {
        fixture = new P08_WithoutEnd();
    }

    @Test
    public void testcase1() {
        String str = "Hello";

        String expected = "ell";

        String actual = fixture.withoutEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "java";

        String expected = "av";

        String actual = fixture.withoutEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "coding";

        String expected = "odin";

        String actual = fixture.withoutEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.withoutEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.withoutEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleChar() {
        String str = "a";

        String expected = "";

        String actual = fixture.withoutEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleChar() {
        String str = "ab";

        String expected = "";

        String actual = fixture.withoutEnd(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
