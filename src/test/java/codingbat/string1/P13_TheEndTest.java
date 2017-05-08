package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P13_TheEndTest {

    private P13_TheEnd fixture;

    @Before
    public void setUp() {
        fixture = new P13_TheEnd();
    }

    @Test
    public void testcase1() {
        String str = "Hello";
        boolean front = true;

        String expected = "H";

        String actual = fixture.theEnd(str, front);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "Hello";
        boolean front = false;

        String expected = "o";

        String actual = fixture.theEnd(str, front);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "oh";
        boolean front = true;

        String expected = "o";

        String actual = fixture.theEnd(str, front);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsNull() {
        String str = null;
        boolean front = true;

        String expected = "";

        String actual = fixture.theEnd(str, front);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsEmpty() {
        String str = "";
        boolean front = true;

        String expected = "";

        String actual = fixture.theEnd(str, front);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleCharAndFrontIsTrue() {
        String str = "a";
        boolean front = true;

        String expected = "a";

        String actual = fixture.theEnd(str, front);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleCharAndFrontIsFalse() {
        String str = "a";
        boolean front = false;

        String expected = "a";

        String actual = fixture.theEnd(str, front);

        assertThat(actual, is(equalTo(expected)));
    }
}
