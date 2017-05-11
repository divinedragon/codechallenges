package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P21_AtFirstTest {

    private P21_AtFirst fixture;

    @Before
    public void setUp() {
        fixture = new P21_AtFirst();
    }

    @Test
    public void testcase1() {
        String str = "hello";

        String expected = "he";

        String actual = fixture.atFirst(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "hi";

        String expected = "hi";

        String actual = fixture.atFirst(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "h";

        String expected = "h@";

        String actual = fixture.atFirst(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "@@";

        String actual = fixture.atFirst(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "@@";

        String actual = fixture.atFirst(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
