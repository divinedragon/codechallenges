package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P026_In3050Test {

    private P026_In3050 fixture;

    @Before
    public void setUp() {
        fixture = new P026_In3050();
    }

    @Test
    public void shouldReturnFalseWhenNum1IsNotInRange3040LowerAndNum2IsNotInRange3040Lower() {

        int num1 = 29;
        int num2 = 29;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInRange3040LowerAndNum2IsNotInRange3040Lower() {

        int num1 = 30;
        int num2 = 29;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRange3040LowerAndNum2IsInRange3040Lower() {

        int num1 = 30;
        int num2 = 30;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRange3040LowerAndNum2IsInRange3040Mid() {

        int num1 = 30;
        int num2 = 35;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRange3040LowerAndNum2IsInRange3040Upper() {

        int num1 = 30;
        int num2 = 40;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInRange3040LowerAndNum2IsNotInRange3040Upper() {

        int num1 = 30;
        int num2 = 41;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum2IsInRange3040LowerAndNum1IsNotInRange3040Lower() {

        int num1 = 29;
        int num2 = 30;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsInRange3040LowerAndNum1IsInRange3040Lower() {

        int num1 = 30;
        int num2 = 30;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsInRange3040LowerAndNum1IsInRange3040Mid() {

        int num1 = 30;
        int num2 = 35;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsInRange3040LowerAndNum1IsInRange3040Upper() {

        int num1 = 40;
        int num2 = 30;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum2IsInRange3040LowerAndNum2IsNotInRange3040Upper() {

        int num1 = 41;
        int num2 = 30;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRange4050LowerAndNum2IsInRange4050Lower() {

        int num1 = 40;
        int num2 = 40;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum1IsInRange4050LowerAndNum2IsInRange4050Mid() {

        int num1 = 40;
        int num2 = 45;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFWhenNum1IsInRange4050LowerAndNum2IsInRange4050Upper() {

        int num1 = 40;
        int num2 = 50;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum1IsInRange4050LowerAndNum2IsNotInRange4050Upper() {

        int num1 = 40;
        int num2 = 51;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsInRange4050LowerAndNum1IsInRange4050Lower() {

        int num1 = 40;
        int num2 = 40;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsInRange4050LowerAndNum1IsInRange4050Mid() {

        int num1 = 40;
        int num2 = 45;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNum2IsInRange4050LowerAndNum1IsInRange4050Upper() {

        int num1 = 50;
        int num2 = 40;

        boolean expected = true;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum2IsInRange4050LowerAndNum2IsNotInRange4050Upper() {

        int num1 = 51;
        int num2 = 40;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNum2IsNotInRange4050LowerAndNum2IsNotInRange4050Upper() {

        int num1 = 51;
        int num2 = 51;

        boolean expected = false;

        boolean actual = fixture.in3050(num1, num2);

        assertThat(actual, is(equalTo(expected)));
    }
}
