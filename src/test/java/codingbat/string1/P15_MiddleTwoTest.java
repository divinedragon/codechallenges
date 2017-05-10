package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class P15_MiddleTwoTest {

    private P15_MiddleTwo fixture;

    @Before
    public void setUp() {
        fixture = new P15_MiddleTwo();
    }

    @Test
    public void testcase1() {
        String str = "string";

        String expected = "ri";

        String actual = fixture.middleTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String str = "code";

        String expected = "od";

        String actual = fixture.middleTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String str = "Practice";

        String expected = "ct";

        String actual = fixture.middleTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {
        String str = null;

        String expected = "";

        String actual = fixture.middleTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.middleTwo(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldReturnEmptyWhenStrIsOddLength() {

        fixture.middleTwo("a");
        fail("Odd length string didn't throw exception");
    }

}
