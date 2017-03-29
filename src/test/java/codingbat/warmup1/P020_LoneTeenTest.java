package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P020_LoneTeenTest {

    private P020_LoneTeen fixture;

    @Before
    public void setUp() {
        fixture = new P020_LoneTeen();
    }

    @Test
    public void shouldReturnFalseWhenNum1IsLessThan13AndNum2IsLessThan13() {
        int num1 = 12;
        int num2 = 12;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsEqualTo13AndNum2IsLessThan13() {
        int num1 = 13;
        int num2 = 12;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRangeAndNum2IsLessThan13() {
        int num1 = 15;
        int num2 = 12;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInEqualTo19AndNum2IsLessThan13() {
        int num1 = 19;
        int num2 = 12;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsGreaterThan19AndNum2IsLessThan13() {
        int num1 = 20;
        int num2 = 12;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsLessThan13AndNum2IsEqualTo13() {
        int num1 = 12;
        int num2 = 13;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsEqualTo13AndNum2IsEqualTo13() {
        int num1 = 13;
        int num2 = 13;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInRangeAndNum2IsEqualTo13() {
        int num1 = 15;
        int num2 = 13;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInEqualTo19AndNum2IsEqualTo13() {
        int num1 = 19;
        int num2 = 13;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsGreaterThan19AndNum2IsEqualTo13() {
        int num1 = 20;
        int num2 = 13;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsLessThan13AndNum2IsInRange() {
        int num1 = 12;
        int num2 = 15;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsEqualTo13AndNum2IsInRange() {
        int num1 = 13;
        int num2 = 15;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInRangeAndNum2IsInRange() {
        int num1 = 15;
        int num2 = 15;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInEqualTo19AndNum2IsInRange() {
        int num1 = 19;
        int num2 = 15;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsGreaterThan19AndNum2IsInRange() {
        int num1 = 20;
        int num2 = 15;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsLessThan13AndNum2IsEqualTo19() {
        int num1 = 12;
        int num2 = 19;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsEqualTo13AndNum2IsEqualTo19() {
        int num1 = 13;
        int num2 = 19;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInRangeAndNum2IsEqualTo19() {
        int num1 = 15;
        int num2 = 19;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInEqualTo19AndNum2IsEqualTo19() {
        int num1 = 19;
        int num2 = 19;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsGreaterThan19AndNum2IsEqualTo19() {
        int num1 = 20;
        int num2 = 19;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsLessThan13AndNum2IsGreaterThan19() {
        int num1 = 12;
        int num2 = 20;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsEqualTo13AndNum2IsGreaterThan19() {
        int num1 = 13;
        int num2 = 20;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRangeAndNum2IsGreaterThan19() {
        int num1 = 15;
        int num2 = 20;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInEqualTo19AndNum2IsGreaterThan19() {
        int num1 = 19;
        int num2 = 20;

        boolean expected = true;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsGreaterThan19AndNum2IsGreaterThan19() {
        int num1 = 20;
        int num2 = 20;

        boolean expected = false;

        boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }
}
