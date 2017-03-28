package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P014_StringYakTest {
    private P014_StringYak fixture;

    @Before
    public void setup() {
        fixture = new P014_StringYak();
    }

    @Test
    public void testcase1() {

        String str = "yakpak";

        String expected = "pak";

        String actual = fixture.stringYak(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {

        String str = "pakyak";

        String expected = "pak";

        String actual = fixture.stringYak(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {

        String str = "yak123ya";

        String expected = "123ya";

        String actual = fixture.stringYak(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {

        String str = null;

        String expected = "";

        String actual = fixture.stringYak(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        String str = "";

        String expected = "";

        String actual = fixture.stringYak(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsLessThan3() {

        String str1 = "y";
        String str2 = "ya";

        String expected1 = "y";
        String expected2 = "ya";

        String actual1 = fixture.stringYak(str1);
        String actual2 = fixture.stringYak(str2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsGreaterThan3AndNoReplacement() {

        String str1 = "abc";
        String str2 = "abcdefgh";

        String expected1 = "abc";
        String expected2 = "abcdefgh";

        String actual1 = fixture.stringYak(str1);
        String actual2 = fixture.stringYak(str2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }

    @Test
    public void shouldReturnModifiedStringWhenStringLengthIsGreaterThan3AndReplacement() {

        String str1 = "yakabc";
        String str2 = "abcdyakefgh";
        String str3 = "abcdefghyak";
        String str4 = "yakyakyak";
        String str5 = "yakybkyck";

        String expected1 = "abc";
        String expected2 = "abcdefgh";
        String expected3 = "abcdefgh";
        String expected4 = "";
        String expected5 = "";

        String actual1 = fixture.stringYak(str1);
        String actual2 = fixture.stringYak(str2);
        String actual3 = fixture.stringYak(str3);
        String actual4 = fixture.stringYak(str4);
        String actual5 = fixture.stringYak(str5);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
        assertThat(actual3, is(equalTo(expected3)));
        assertThat(actual4, is(equalTo(expected4)));
        assertThat(actual5, is(equalTo(expected5)));
    }
}
