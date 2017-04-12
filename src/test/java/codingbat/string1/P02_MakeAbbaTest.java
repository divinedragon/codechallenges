package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P02_MakeAbbaTest {

    private P02_MakeAbba fixture;

    @Before
    public void setUp() {
        fixture = new P02_MakeAbba();
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreNull() {

        String a = null;
        String b = null;

        String expected = "";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreEmpty() {

        String a = "";
        String b = "";

        String expected = "";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBBWhenAIsNullAndBIsNotNull() {

        String a = null;
        String b = "B";

        String expected = "BB";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBBWhenAIsEmptyAndBIsNotNull() {

        String a = "";
        String b = "B";

        String expected = "BB";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnAAWhenAIsNotNullAndBIsNull() {

        String a = "A";
        String b = null;

        String expected = "AA";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNull() {

        String a = "A";
        String b = "";

        String expected = "AA";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullUpper() {

        String a = "A";
        String b = "B";

        String expected = "ABBA";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullLower() {

        String a = "a";
        String b = "b";

        String expected = "abba";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullMixed() {

        String a = "A";
        String b = "b";

        String expected = "AbbA";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullMultiChar() {

        String a = "Abc";
        String b = "Xyz";

        String expected = "AbcXyzXyzAbc";

        String actual = fixture.makeAbba(a, b);

        assertThat(actual, is(equalTo(expected)));
    }
}
