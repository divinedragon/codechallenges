package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P013_BackAroundTest {

    private P013_BackAround fixture;

    @Before
    public void test() {
        fixture = new P013_BackAround();
    }

    @Test
    public void shouldBackAroundWhenMultiCharString() {
        String str = "cat";
        String expected = "tcatt";
        String actual = fixture.backAround(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldBackAroundWhenSingleCharString() {
        String str = "a";
        String expected = "aaa";
        String actual = fixture.backAround(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldBackAroundWhenEmptyString() {
        String str = "";
        String expected = "";
        String actual = fixture.backAround(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
