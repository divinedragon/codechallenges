package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P16_EndsLyTest {

    private P16_EndsLy fixture;

    @Before
    public void setUp() {
        fixture = new P16_EndsLy();
    }

    @Test
    public void testcase1() {
        String str = "oddly";

        boolean expected = true;

        boolean actual = fixture.endsLy(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "y";

        boolean expected = false;

        boolean actual = fixture.endsLy(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "oddy";

        boolean expected = false;

        boolean actual = fixture.endsLy(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStrIsNull() {
        String str = null;

        boolean expected = false;

        boolean actual = fixture.endsLy(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStrIsEmpty() {
        String str = "";

        boolean expected = false;

        boolean actual = fixture.endsLy(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
