package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P18_TwoCharTest {

    private P18_TwoChar fixture;

    @Before
    public void setUp() {
        fixture = new P18_TwoChar();
    }

    @Test
    public void testcase1() {
        String str = "java";
        int index = 0;

        String expected = "ja";

        String actual = fixture.twoChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "java";
        int index = 2;

        String expected = "va";

        String actual = fixture.twoChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "java";
        int index = 3;

        String expected = "ja";

        String actual = fixture.twoChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;
        int index = 0;

        String expected = "";

        String actual = fixture.twoChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";
        int index = 0;

        String expected = "";

        String actual = fixture.twoChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenIndexIsLessThanZero() {
        String str = "abc";
        int index = -1;

        String expected = "";

        String actual = fixture.twoChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsLessThan2() {
        String str = "a";
        int index = 0;

        String expected = "";

        String actual = fixture.twoChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }
}
