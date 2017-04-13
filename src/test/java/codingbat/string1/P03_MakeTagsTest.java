package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P03_MakeTagsTest {

    private P03_MakeTags fixture;

    @Before
    public void setUp() {
        fixture = new P03_MakeTags();
    }

    @Test
    public void testcase1() {
        String tag = "i";
        String word = "Yay";

        String expected = "<i>Yay</i>";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String tag = "i";
        String word = "Hello";

        String expected = "<i>Hello</i>";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String tag = "cite";
        String word = "Yay";

        String expected = "<cite>Yay</cite>";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {
        String tag = null;
        String word = null;

        String expected = "";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {
        String tag = null;
        String word = null;

        String expected = "";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenTagIsNullAndWordIsNotNull() {
        String tag = null;
        String word = "Hi";

        String expected = "";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenTagIsEmptyAndWordIsNotNull() {
        String tag = "";
        String word = "Hi";

        String expected = "";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenTagIsNotEmptyAndWordIsNull() {
        String tag = "i";
        String word = null;

        String expected = "<i></i>";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenTagIsNotEmptyAndWordIsEmpty() {
        String tag = "i";
        String word = "";

        String expected = "<i></i>";

        String actual = fixture.makeTags(tag, word);

        assertThat(actual, is(equalTo(expected)));
    }
}
