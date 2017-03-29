package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P031_EveryNthTest {

    private P031_EveryNth fixture;

    @Before
    public void setUp() {
        fixture = new P031_EveryNth();
    }

    @Test
    public void shouldReturnFirstCharWhenStringLengthIsLessThanN() {
        String str = "ab";

        int n = 3;

        String expected = "a";

        String actual = fixture.everyNth(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSingleCharWhenStringLengthIsGreaterThanNAndSingleHit() {
        String str = "abc";

        int n = 2;

        String expected = "ac";

        String actual = fixture.everyNth(str, n);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSingleCharWhenStringLengthIsGreaterThanNAndMultipleHit() {
        String str = "abcdefg";

        int n = 2;

        String expected = "aceg";

        String actual = fixture.everyNth(str, n);

        assertThat(actual, is(equalTo(expected)));
    }
}
