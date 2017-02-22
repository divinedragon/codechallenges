package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P009_NotStringTest {

    private P009_NotString fixture;

    @Before
    public void setup() {
        fixture = new P009_NotString();
    }

    @Test
    public void shouldReturnStringWithNotPrefixWhenStringDoesntStartWithNot() {
        String expected = "not candy";

        String str = "candy";

        String actual = fixture.notString(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringAsItIsWhenStringStartWithNot() {
        String expected = "not bad";

        String str = "not bad";

        String actual = fixture.notString(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
