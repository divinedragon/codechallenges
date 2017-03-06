package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P024_IntMaxTest {

    private P024_IntMax fixture;

    @Before
    public void setup() {
        fixture = new P024_IntMax();
    }

    @Test
    public void shouldReturnMaxAsNum1WhenNum1IsLargestAndNum2IsGreaterThanNum3() {
        int num1 = 10;
        int num2 = 5;
        int num3 = 1;

        int expected = num1;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum1WhenNum1IsLargestAndNum2IsLessThanNum3() {
        int num1 = 10;
        int num2 = 1;
        int num3 = 5;

        int expected = num1;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum1WhenNum1IsLargestAndNum2AndNum3AreEqual() {
        int num1 = 10;
        int num2 = 5;
        int num3 = 5;

        int expected = num1;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum2WhenNum2IsLargestAndNum1IsGreaterThanNum3() {
        int num1 = 5;
        int num2 = 10;
        int num3 = 1;

        int expected = num2;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum2WhenNum2IsLargestAndNum1IsLessThanNum3() {
        int num1 = 1;
        int num2 = 10;
        int num3 = 5;

        int expected = num2;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum2WhenNum2IsLargestAndNum1AndNum3AreEqual() {
        int num1 = 5;
        int num2 = 10;
        int num3 = 5;

        int expected = num2;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum3WhenNum3IsLargestAndNum1IsGreaterThanNum2() {
        int num1 = 5;
        int num2 = 1;
        int num3 = 10;

        int expected = num3;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum3WhenNum3IsLargestAndNum1IsLessThanNum2() {
        int num1 = 5;
        int num2 = 1;
        int num3 = 10;

        int expected = num3;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsNum3WhenNum3IsLargestAndNum1AndNum2AreEqual() {
        int num1 = 5;
        int num2 = 5;
        int num3 = 10;

        int expected = num3;

        int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }
}
