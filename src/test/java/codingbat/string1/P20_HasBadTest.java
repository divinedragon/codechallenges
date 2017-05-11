package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P20_HasBadTest {

    private P20_HasBad fixture;

    @Before
    public void setUp() {
        fixture = new P20_HasBad();
    }

    @Test
    public void testcase1() {
        String str = "badxx";

        boolean expected = true;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "xbadxx";

        boolean expected = true;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "xxbadxx";

        boolean expected = false;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStrIsNull() {
        String str = null;

        boolean expected = false;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStrIsEmpty() {
        String str = "";

        boolean expected = false;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStrLengthIsLess3() {
        String str = "ab";

        boolean expected = false;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStrLengthIsEqualTo3AndNotBad() {
        String str = "abc";

        boolean expected = false;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenStrLengthIsEqualTo3AndIsBad() {
        String str = "bad";

        boolean expected = true;

        boolean actual = fixture.hasBad(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
