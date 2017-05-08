package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P11_Left2Test {

    private P11_Left2 fixture;

    @Before
    public void setUp() {
        fixture = new P11_Left2();
    }

    @Test
    public void testcase1() {
        String str = "Hi";

        String expected = "Hi";

        String actual = fixture.left2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "java";

        String expected = "vaja";

        String actual = fixture.left2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "Hello";

        String expected = "lloHe";

        String actual = fixture.left2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.left2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.left2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {
        String str = "a";

        String expected = "a";

        String actual = fixture.left2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStrIsDoubleChar() {
        String str = "ab";

        String expected = "ab";

        String actual = fixture.left2(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
