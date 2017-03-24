package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P007_Last2Test {

    private P007_Last2 fixture;

    @Before
    public void setup() {
        fixture = new P007_Last2();
    }

    @Test
    public void scenario1() {
        String str = "hixxhi";

        int expected = 1;

        int actual = fixture.last2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void scenario2() {
        String str = "xaxxaxaxx";

        int expected = 1;

        int actual = fixture.last2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void scenario3() {
        String str = "axxxaaxx";

        int expected = 2;

        int actual = fixture.last2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn0WhenStringIsNull() {
        String str = null;

        int expected = 0;

        int actual = fixture.last2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn0WhenStringIsEmpty() {
        String str = "";

        int expected = 0;

        int actual = fixture.last2(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn0WhenStringIsSingleString() {
        String str = "x";

        int expected = 0;

        int actual = fixture.last2(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
