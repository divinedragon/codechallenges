package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P005_StringBitsTest {

    public P005_StringBits fixture;

    @Before
    public void setup() {
        fixture = new P005_StringBits();
    }

    @Test
    public void testScenario1() {

        String str = "Hello";

        String expected = "Hlo";

        String actual = fixture.stringBits(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testScenario2() {

        String str = "Hi";

        String expected = "H";

        String actual = fixture.stringBits(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testScenario3() {

        String str = "Heeololeo";

        String expected = "Hello";

        String actual = fixture.stringBits(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBlankStringWhenStringIsEmpty() {

        String str = "";

        String expected = "";

        String actual = fixture.stringBits(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnBlankStringWhenStringIsNull() {

        String str = null;

        String expected = "";

        String actual = fixture.stringBits(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
