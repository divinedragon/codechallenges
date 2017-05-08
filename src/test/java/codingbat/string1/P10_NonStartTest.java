package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P10_NonStartTest {

    private P10_NonStart fixture;

    @Before
    public void setUp() {
        fixture = new P10_NonStart();
    }

    @Test
    public void testcase1() {
        String strA = "Hello";
        String strB = "There";

        String expected = "ellohere";

        String actual = fixture.nonStart(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String strA = "java";
        String strB = "code";

        String expected = "avaode";

        String actual = fixture.nonStart(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String strA = "shotl";
        String strB = "java";

        String expected = "hotlava";

        String actual = fixture.nonStart(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {
        String strA = null;
        String strB = null;

        String expected = "";

        String actual = fixture.nonStart(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {
        String strA = "";
        String strB = "";

        String expected = "";

        String actual = fixture.nonStart(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenOneIsEmptyAndOtherIsNull() {
        String strA;
        String strB;
        String expected = "";
        String actual;

        strA = null;
        strB = "";
        actual = fixture.nonStart(strA, strB);
        assertThat(actual, is(equalTo(expected)));

        strA = "";
        strB = null;
        actual = fixture.nonStart(strA, strB);
        assertThat(actual, is(equalTo(expected)));
    }

}
