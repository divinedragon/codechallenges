package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class P17_nTwiceTest {

    private P17_nTwice fixture;

    @Before
    public void setUp() {
        fixture = new P17_nTwice();
    }

    @Test
    public void testcase1() {
        String str = "Hello";
        int n = 2;

        String expected = "Helo";

        String actual = fixture.nTwice(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "Chocolate";
        int n = 3;

        String expected = "Choate";

        String actual = fixture.nTwice(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "Chocolate";
        int n = 1;

        String expected = "Ce";

        String actual = fixture.nTwice(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;
        int n = 1;

        String expected = "";

        String actual = fixture.nTwice(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";
        int n = 1;

        String expected = "";

        String actual = fixture.nTwice(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenStrLengthIsSmallThanN() {
        fixture.nTwice("abc", 5);

        fail("Length smaller than N didn't throw exception");
    }
}
