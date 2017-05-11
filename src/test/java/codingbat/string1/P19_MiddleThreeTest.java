package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P19_MiddleThreeTest {

    private P19_MiddleThree fixture;

    @Before
    public void setUp() {
        fixture = new P19_MiddleThree();
    }

    @Test
    public void testcase1() {
        String str = "Candy";

        String expected = "and";

        String actual = fixture.middleThree(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "and";

        String expected = "and";

        String actual = fixture.middleThree(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "solving";

        String expected = "lvi";

        String actual = fixture.middleThree(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.middleThree(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.middleThree(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEvenLength() {
        String str = "ab";

        String expected = "";

        String actual = fixture.middleThree(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
