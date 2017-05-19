package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P29_Without2Test {

    private P29_Without2 fixture;

    @Before
    public void setUp() {
        fixture = new P29_Without2();
    }

    @Test
    public void testcase1() {
        String str = "HelloHe";

        String expected = "lloHe";

        String actual = fixture.without2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "HelloHi";

        String expected = "HelloHi";

        String actual = fixture.without2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "Hi";

        String expected = "";

        String actual = fixture.without2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.without2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.without2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {
        String str = "a";

        String expected = "a";

        String actual = fixture.without2(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
