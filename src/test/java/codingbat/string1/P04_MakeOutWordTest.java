package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P04_MakeOutWordTest {

    private P04_MakeOutWord fixture;

    @Before
    public void setUp() {
        this.fixture = new P04_MakeOutWord();
    }

    @Test
    public void testcase1() {
        String out = "<<>>";
        String word = "Yay";

        String expected = "<<Yay>>";

        String actual = fixture.makeOutWord(out, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String out = "<<>>";
        String word = "WooHoo";

        String expected = "<<WooHoo>>";

        String actual = fixture.makeOutWord(out, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String out = "[[]]";
        String word = "word";

        String expected = "[[word]]";

        String actual = fixture.makeOutWord(out, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenWordIsNull() {
        String out = "[[]]";
        String word = null;

        String expected = "";

        String actual = fixture.makeOutWord(out, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenWordIsEmpty() {
        String out = "[[]]";
        String word = "";

        String expected = "";

        String actual = fixture.makeOutWord(out, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenOutIsNull() {
        String out = null;
        String word = "Yay";

        String expected = "Yay";

        String actual = fixture.makeOutWord(out, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenOutIsEmpty() {
        String out = "";
        String word = "Yay";

        String expected = "Yay";

        String actual = fixture.makeOutWord(out, word);

        assertThat(actual, is(equalTo(expected)));
    }
}
