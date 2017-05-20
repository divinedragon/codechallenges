package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P31_StartWordTest {

    private P31_StartWord fixture;

    @Before
    public void setUp() {
        fixture = new P31_StartWord();
    }

    @Test
    public void testcase1() {
        String str = "hippo";
        String word = "hi";

        String expected = "hi";

        String actual = fixture.startWord(str, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "hippo";
        String word = "xip";

        String expected = "hip";

        String actual = fixture.startWord(str, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "hippo";
        String word = "i";

        String expected = "h";

        String actual = fixture.startWord(str, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {
        String str = null;
        String word = null;

        String expected = "";

        String actual = fixture.startWord(str, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {
        String str = "";
        String word = "";

        String expected = "";

        String actual = fixture.startWord(str, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenOneIsNullAndOtherIsEmpty() {
        String str1 = null;
        String word1 = "";
        String str2 = "";
        String word2 = null;

        String expected = "";

        String actual1 = fixture.startWord(str1, word1);
        String actual2 = fixture.startWord(str2, word2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsGreaterThanEqualTo1AndWordIsEmpty() {
        String str1 = "h";
        String word1 = "";
        String str2 = "hh";
        String word2 = "";

        String expected = "";

        String actual1 = fixture.startWord(str1, word1);
        String actual2 = fixture.startWord(str2, word2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsLessThanWordLength() {
        String str = "h";
        String word = "ix";

        String expected = "";

        String actual1 = fixture.startWord(str, word);

        assertThat(actual1, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsEqualToWordLength() {
        String str = "h";
        String word = "i";

        String expected = "h";

        String actual1 = fixture.startWord(str, word);

        assertThat(actual1, is(equalTo(expected)));
    }
}
