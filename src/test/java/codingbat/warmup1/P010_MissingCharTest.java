package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P010_MissingCharTest {

    private P010_MissingChar fixture;

    @Before
    public void setUp() {
        fixture = new P010_MissingChar();
    }

    @Test
    public void shouldReturnStringWithMissingCharAtStart() {
        String str = "kitten";
        int index = 0;
        String expected = "itten";

        String actual = fixture.missingChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringWithMissingCharAtEnd() {
        String str = "kitten";
        int index = 5;
        String expected = "kitte";

        String actual = fixture.missingChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringWithMissingCharAtMid() {
        String str = "kitten";
        int index = 1;
        String expected = "ktten";

        String actual = fixture.missingChar(str, index);

        assertThat(actual, is(equalTo(expected)));
    }
}
