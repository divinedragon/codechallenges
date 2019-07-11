package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P17_FizzStringTest {

    private P17_FizzString fixture;

    @Before
    public void setUp() {
        fixture = new P17_FizzString();
    }

    @Test
    public void fizzStringShouldReturnFizzBuzzWhenStringStartsWithFAndEndsWithB() {

        final String str = "fib";

        final String expected = "FizzBuzz";

        final String actual = fixture.fizzString(str);

        assertThat(actual, is(expected));
    }

    @Test
    public void fizzStringShouldReturnFizzWhenStringStartsWithFAndDoesNotEndWithB() {

        final String str = "fig";

        final String expected = "Fizz";

        final String actual = fixture.fizzString(str);

        assertThat(actual, is(expected));
    }

    @Test
    public void fizzStringShouldReturnBuzzWhenStringDoesNotStartWithFButEndsWithB() {

        final String str = "dib";

        final String expected = "Buzz";

        final String actual = fixture.fizzString(str);

        assertThat(actual, is(expected));
    }

    @Test
    public void fizzStringShouldReturnStringWhenStringDoesNotStartWithFButDoesNotEndWithB() {

        final String str1 = "efbg";
        final String str2 = "";

        final String expected1 = str1;
        final String expected2 = str2;

        final String actual1 = fixture.fizzString(str1);
        final String actual2 = fixture.fizzString(str2);

        assertThat(actual1, is(expected1));
        assertThat(actual2, is(expected2));
    }
}
