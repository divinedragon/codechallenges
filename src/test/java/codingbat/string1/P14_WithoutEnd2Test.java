package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P14_WithoutEnd2Test {

    private P14_WithoutEnd2 fixture;

    @Before
    public void setUp() {
        fixture = new P14_WithoutEnd2();
    }

    @Test
    public void testcase1() {
        String str = "Hello";

        String expected = "ell";

        String actual = fixture.withouEnd2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "abc";

        String expected = "b";

        String actual = fixture.withouEnd2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "ab";

        String expected = "";

        String actual = fixture.withouEnd2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.withouEnd2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.withouEnd2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsSingleChar() {
        String str = "a";

        String expected = "";

        String actual = fixture.withouEnd2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsDoubleChar() {
        String str = "ab";

        String expected = "";

        String actual = fixture.withouEnd2(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
