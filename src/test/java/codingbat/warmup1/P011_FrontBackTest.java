package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P011_FrontBackTest {

    private P011_FrontBack fixture;

    @Before
    public void setup() {
        fixture = new P011_FrontBack();
    }

    @Test
    public void shouldReturnEmptyWhenStringIsEmpty() {
        String str = "";
        String expected = "";

        String actual = fixture.frontBack(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStringIsSingleChar() {
        String str = "a";
        String expected = "a";

        String actual = fixture.frontBack(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFrontBackStringWhenStringMultiChar() {
        String str = "code";
        String expected = "eodc";

        String actual = fixture.frontBack(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
