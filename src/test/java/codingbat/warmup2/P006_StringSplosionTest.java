package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P006_StringSplosionTest {

    private P006_StringSplosion fixture;

    @Before
    public void setUp() {
        fixture = new P006_StringSplosion();
    }

    @Test
    public void scenario1() {
        String str = "Code";

        String expected = "CCoCodCode";

        String actual = fixture.stringSplosion(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void scenario2() {
        String str = "abc";

        String expected = "aababc";

        String actual = fixture.stringSplosion(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void scenario3() {
        String str = "ab";

        String expected = "aab";

        String actual = fixture.stringSplosion(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.stringSplosion(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.stringSplosion(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
