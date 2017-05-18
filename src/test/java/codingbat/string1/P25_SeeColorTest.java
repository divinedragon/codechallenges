package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P25_SeeColorTest {

    private P25_SeeColor fixture;

    @Before
    public void setUp() {
        fixture = new P25_SeeColor();
    }

    @Test
    public void testcase1() {
        String str = "redxx";

        String expected = "red";

        String actual = fixture.seeColor(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "xxred";

        String expected = "";

        String actual = fixture.seeColor(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "blueTimes";

        String expected = "blue";

        String actual = fixture.seeColor(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.seeColor(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.seeColor(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsLessThan2() {
        String str1 = "a";
        String str2 = "ab";

        String expected = "";

        String actual1 = fixture.seeColor(str1);
        String actual2 = fixture.seeColor(str2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }
}
