package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P002_FrontTimesTest {

    private P002_FrontTimes fixture;

    @Before
    public void setup() {
        fixture = new P002_FrontTimes();
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {

        String str = null;
        int n = 5;

        String expected = "";

        String actual = fixture.frontTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        String str = "";
        int n = 5;

        String expected = "";

        String actual = fixture.frontTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFrontStringWhenStringIsNotEmptyAndHasLengthLessThan3() {

        String str = "a";
        int n = 3;

        String expected = "aaa";

        String actual = fixture.frontTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFrontStringWhenStringIsNotEmptyAndHasLengthGreaterThan3() {

        String str = "abcd";
        int n = 2;

        String expected = "abcabc";

        String actual = fixture.frontTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFrontStringWhenStringIsNotEmptyAndNumberIsZero() {

        String str = "abcd";
        int n = 0;

        String expected = "";

        String actual = fixture.frontTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }
}
