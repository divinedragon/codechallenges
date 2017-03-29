package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P001_StringTimesTest {

    private P001_StringTimes fixture;

    @Before
    public void setUp() {
        fixture = new P001_StringTimes();
    }

    @Test
    public void shouldReturnEmptyStringWhenInputStringIsEmpty() {

        String str = "";

        String expected = "";
        int n = 1;

        String actual = fixture.stringTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringCount1WhenInputStringIsNonEmptyAndCountIs1() {

        String str = "Hi";

        String expected = "Hi";
        int n = 1;

        String actual = fixture.stringTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringCountMultipleWhenInputStringIsNonEmptyAndCountIsGreaterThan1() {

        String str = "Hi";

        String expected = "HiHi";
        int n = 2;

        String actual = fixture.stringTimes(str, n);

        assertThat(actual, is(equalTo(expected)));





        str = "Hi";

        expected = "HiHiHi";
        n = 3;

        actual = fixture.stringTimes(str, n);

        assertThat(actual, is(equalTo(expected)));
    }
}
