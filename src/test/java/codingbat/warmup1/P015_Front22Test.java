package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P015_Front22Test {

    private P015_Front22 fixture;

    @Before
    public void setup() {
        fixture = new P015_Front22();
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsGreaterThan2() {
        String str = "cat";
        String expected = "cacatca";
        String actual = fixture.front22(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsEqualTo2() {
        String str = "ca";
        String expected = "cacaca";
        String actual = fixture.front22(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsLessThan2() {
        String str = "c";
        String expected = "ccc";
        String actual = fixture.front22(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsEmpty() {
        String str = "";
        String expected = "";
        String actual = fixture.front22(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
