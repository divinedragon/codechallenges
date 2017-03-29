package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P012_StringXTest {

    private P012_StringX fixture;

    @Before
    public void setUp() {
        fixture = new P012_StringX();
    }

    @Test
    public void testcase1() {
        String str = "xxHxix";

        String expected = "xHix";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "abxxxcd";

        String expected = "abcd";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "xabxxxcdx";

        String expected = "xabcdx";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenInputStringIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenInputStringIsEmpty() {
        String str = null;

        String expected = "";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenInputStringLenghtIsLessThan3() {
        String str1 = "a";
        String str2 = "x";

        String str3 = "aa";
        String str4 = "ax";
        String str5 = "xa";
        String str6 = "xx";

        String expected1 = "a";
        String expected2 = "x";

        String expected3 = "aa";
        String expected4 = "ax";
        String expected5 = "xa";
        String expected6 = "xx";

        String actual1 = fixture.stringX(str1);
        String actual2 = fixture.stringX(str2);
        String actual3 = fixture.stringX(str3);
        String actual4 = fixture.stringX(str4);
        String actual5 = fixture.stringX(str5);
        String actual6 = fixture.stringX(str6);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
        assertThat(actual4, is(equalTo(expected4)));
        assertThat(actual5, is(equalTo(expected5)));
        assertThat(actual6, is(equalTo(expected6)));
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3NoX() {
        String str = "abcdefgh";

        String expected = "abcdefgh";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInMid() {
        String str = "abcxxxfgh";

        String expected = "abcfgh";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInStart() {
        String str = "xabcfgh";

        String expected = "xabcfgh";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInEnd() {
        String str = "abcfghx";

        String expected = "abcfghx";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInAll() {
        String str = "xxxxxxxxxxxxx";

        String expected = "xx";

        String actual = fixture.stringX(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
