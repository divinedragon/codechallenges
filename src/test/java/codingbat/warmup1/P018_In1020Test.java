package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P018_In1020Test {

    private P018_In1020 fixture;

    @Before
    public void setUp() {
        fixture = new P018_In1020();
    }

    @Test
    public void shouldReturnFalseWhenNum1IsLessThan10AndNum2IsLessThan10() {
        int num1 = 5;
        int num2 = 5;

        boolean expected = false;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsLessThan10AndNum2IsInRange() {
        int num1 = 5;
        int num2 = 10;

        boolean expected = true;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsLessThan10AndNum2IsGreaterThan20() {
        int num1 = 5;
        int num2 = 21;

        boolean expected = false;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRangeAndNum2IsLessThan10() {
        int num1 = 10;
        int num2 = 5;

        boolean expected = true;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRangeAndNum2IsInRange() {
        int num1 = 15;
        int num2 = 15;

        boolean expected = true;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRangeAndNum2IsGreaterThan20() {
        int num1 = 20;
        int num2 = 21;

        boolean expected = true;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsGreaterThan20AndNum2IsLessThan10() {
        int num1 = 21;
        int num2 = 5;

        boolean expected = false;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsGreaterThan20AndNum2IsInRange() {
        int num1 = 15;
        int num2 = 20;

        boolean expected = true;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsGreaterThan20AndNum2IsGreaterThan20() {
        int num1 = 21;
        int num2 = 21;

        boolean expected = false;

        boolean actual = fixture.in1020(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }
}
