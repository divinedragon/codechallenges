package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P26_FrontAgainTest {

    private P26_FrontAgain fixture;

    @Before
    public void setUp() {
        fixture = new P26_FrontAgain();
    }

    @Test
    public void testcase1() {
        String str = "edited";

        boolean expected = true;

        boolean actual = fixture.frontAgain(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "edit";

        boolean expected = false;

        boolean actual = fixture.frontAgain(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "ed";

        boolean expected = true;

        boolean actual = fixture.frontAgain(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStringIsNull() {
        String str = null;

        boolean expected = false;

        boolean actual = fixture.frontAgain(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStringIsEmpty() {
        String str = null;

        boolean expected = false;

        boolean actual = fixture.frontAgain(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStringIsSingleChar() {
        String str = "a";

        boolean expected = false;

        boolean actual = fixture.frontAgain(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
