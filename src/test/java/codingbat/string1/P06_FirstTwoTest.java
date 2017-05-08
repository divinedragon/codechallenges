package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P06_FirstTwoTest {

    private P06_FirstTwo fixture;

    @Before
    public void setUp() {
        fixture = new P06_FirstTwo();
    }

    @Test
    public void testcase1() {
        String str = "Hello";

        String expected = "He";

        String actual = fixture.firstTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "abcdefg";

        String expected = "ab";

        String actual = fixture.firstTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "ab";

        String expected = "ab";

        String actual = fixture.firstTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.firstTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.firstTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringWhenStrLengthIsEqualTo1() {
        String str = "a";

        String expected = "a";

        String actual = fixture.firstTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
