package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P030_EndUpTest {

    private P030_EndUp fixture;

    @Before
    public void setup() {
        fixture = new P030_EndUp();
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {
        String str = "";

        String expected = "";

        String actual = fixture.endUp(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnAllUpperCaseStringWhenStringLengthIsLessThanEqualTo3() {
        String str = "abc";

        String expected = "ABC";

        String actual = fixture.endUp(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnLast3UpperCaseStringWhenStringLengthIsGreaterThan3() {
        String str = "abcd";

        String expected = "aBCD";

        String actual = fixture.endUp(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
