package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P019_HasTeenTest {

    private P019_HasTeen fixture;

    @Before
    public void setUp() {
        fixture = new P019_HasTeen();
    }

    @Test
    public void shouldReturnFalseWhenNum1IsLessThan13AndNum2AndNum3AreNotInRange() {
        int num1 = 12;
        int num2 = 12;
        int num3 = 12;

        boolean expected = false;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsEqualTo13AndNum2AndNum3AreNotInRange() {
        int num1 = 13;
        int num2 = 12;
        int num3 = 12;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsGreaterThan13AndLessThan19AndNum2AndNum3AreNotInRange() {
        int num1 = 15;
        int num2 = 12;
        int num3 = 12;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsEqualTo19AndNum2AndNum3AreNotInRange() {
        int num1 = 19;
        int num2 = 12;
        int num3 = 12;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsGreaterThan19AndNum2AndNum3AreNotInRange() {
        int num1 = 20;
        int num2 = 12;
        int num3 = 12;

        boolean expected = false;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum2IsLessThan13AndNum1AndNum3AreNotInRange() {
        int num1 = 20;
        int num2 = 12;
        int num3 = 20;

        boolean expected = false;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsEqualTo13AndNum1AndNum3AreNotInRange() {
        int num1 = 20;
        int num2 = 13;
        int num3 = 20;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsGreaterThan13AndLessThan19AndNum1AndNum3AreNotInRange() {
        int num1 = 20;
        int num2 = 15;
        int num3 = 20;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsEqualTo19AndNum1AndNum3AreNotInRange() {
        int num1 = 20;
        int num2 = 19;
        int num3 = 20;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum2IsGreaterThan19AndNum1AndNum3AreNotInRange() {
        int num1 = 20;
        int num2 = 20;
        int num3 = 20;

        boolean expected = false;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum3IsLessThan13AndNum1AndNum2AreNotInRange() {
        int num1 = 20;
        int num2 = 20;
        int num3 = 12;

        boolean expected = false;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum3IsEqualTo13AndNum1AndNum2AreNotInRange() {
        int num1 = 20;
        int num2 = 20;
        int num3 = 13;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum3IsGreaterThan13AndLessThan19AndNum1AndNum2AreNotInRange() {
        int num1 = 20;
        int num2 = 20;
        int num3 = 15;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum3IsEqualTo19AndNum1AndNum2AreNotInRange() {
        int num1 = 20;
        int num2 = 20;
        int num3 = 19;

        boolean expected = true;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum3IsGreaterThan19AndNum1AndNum2AreNotInRange() {
        int num1 = 20;
        int num2 = 20;
        int num3 = 20;

        boolean expected = false;

        boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual, is(equalTo(expected)));
    }
}
