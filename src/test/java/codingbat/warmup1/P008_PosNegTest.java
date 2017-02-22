package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P008_PosNegTest {

    private P008_PosNeg fixture;

    @Before
    public void setup() {
        fixture = new P008_PosNeg();
    }

    @Test
    public void shouldReturnTrueWhenNegativeFlagUnsetAndFirstIsNegative() {
        boolean expected = true;

        int a = -1;
        int b = 1;
        boolean negativeFlag = false;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNegativeFlagUnsetAndSecondIsNegative() {
        boolean expected = true;

        int a = 1;
        int b = -1;
        boolean negativeFlag = false;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagUnsetAndBothAreNegative() {
        boolean expected = false;

        int a = -1;
        int b = -1;
        boolean negativeFlag = false;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagUnsetAndBothArePositive() {
        boolean expected = false;

        int a = 1;
        int b = 1;
        boolean negativeFlag = false;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagIsSetAndFirstIsNegative() {
        boolean expected = false;

        int a = -1;
        int b = 1;
        boolean negativeFlag = true;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagIsSetAndSecondIsNegative() {
        boolean expected = false;

        int a = 1;
        int b = -1;
        boolean negativeFlag = true;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagIsSetAndBothArePositive() {
        boolean expected = false;

        int a = 1;
        int b = 1;
        boolean negativeFlag = true;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNegativeFlagIsSetAndBothAreNegative() {
        boolean expected = true;

        int a = -1;
        int b = -1;
        boolean negativeFlag = true;

        boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual, is(equalTo(expected)));
    }
}
