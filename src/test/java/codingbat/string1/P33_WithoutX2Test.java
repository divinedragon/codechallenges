package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P33_WithoutX2Test {

    private P33_WithoutX2 fixture;

    @Before
    public void setUp() {
        fixture = new P33_WithoutX2();
    }

    @Test
    public void testcase1() {
        String str = "xHi";

        String expected = "Hi";

        String actual = fixture.withoutX2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "Hxi";

        String expected = "Hi";

        String actual = fixture.withoutX2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "Hi";

        String expected = "Hi";

        String actual = fixture.withoutX2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.withoutX2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.withoutX2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharAndNoX() {
        String str = "a";

        String expected = "a";

        String actual = fixture.withoutX2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharAndX() {
        String str = "x";

        String expected = "";

        String actual = fixture.withoutX2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAndNoX() {
        String str1 = "ab";
        String str2 = "abc";
        String str3 = "abcd";

        String expected1 = "ab";
        String expected2 = "abc";
        String expected3 = "abcd";

        String actual1 = fixture.withoutX2(str1);
        String actual2 = fixture.withoutX2(str2);
        String actual3 = fixture.withoutX2(str3);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAndSingleX() {
        String str1 = "xb";
        String str2 = "xbc";
        String str3 = "xbcd";
        String str4 = "ax";
        String str5 = "axc";
        String str6 = "axcd";

        String expected1 = "b";
        String expected2 = "bc";
        String expected3 = "bcd";
        String expected4 = "a";
        String expected5 = "ac";
        String expected6 = "acd";

        String actual1 = fixture.withoutX2(str1);
        String actual2 = fixture.withoutX2(str2);
        String actual3 = fixture.withoutX2(str3);
        String actual4 = fixture.withoutX2(str4);
        String actual5 = fixture.withoutX2(str5);
        String actual6 = fixture.withoutX2(str6);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
        assertThat(actual4, is(equalTo(expected4)));
        assertThat(actual5, is(equalTo(expected5)));
        assertThat(actual6, is(equalTo(expected6)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAndBothX() {
        String str1 = "xx";
        String str2 = "xxc";
        String str3 = "xxcd";

        String expected1 = "";
        String expected2 = "c";
        String expected3 = "cd";

        String actual1 = fixture.withoutX2(str1);
        String actual2 = fixture.withoutX2(str2);
        String actual3 = fixture.withoutX2(str3);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
    }
}
