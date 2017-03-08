package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P029_LastDigitTest {

    private P029_LastDigit fixture;

    @Before
    public void setup() {
        fixture = new P029_LastDigit();
    }

    @Test
    public void shouldReturnTrueWhenLastDigitsAreSame() {
        int num1 = 17;
        int num2 = 7;

        boolean expected = true;

        boolean actual = fixture.lastDigit(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenLastDigitsAreNotSame() {
        int num1 = 17;
        int num2 = 13;

        boolean expected = false;

        boolean actual = fixture.lastDigit(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }
}
