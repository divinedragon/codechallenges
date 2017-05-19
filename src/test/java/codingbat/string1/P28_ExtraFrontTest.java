package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P28_ExtraFrontTest {

    private P28_ExtraFront fixture;

    @Before
    public void setUp() {
        fixture = new P28_ExtraFront();
    }

    @Test
    public void testcase1() {
        String str = "Hello";

        String expected = "HeHeHe";

        String actual = fixture.extraFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "ab";

        String expected = "ababab";

        String actual = fixture.extraFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "H";

        String expected = "HHH";

        String actual = fixture.extraFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.extraFront(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.extraFront(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
