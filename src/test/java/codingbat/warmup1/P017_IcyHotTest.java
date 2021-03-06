package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P017_IcyHotTest {

    private P017_IcyHot fixture;

    @Before
    public void setUp() {
        fixture = new P017_IcyHot();
    }

    @Test
    public void shouldReturnTrueWhenFirstIsLessThanZeroAndSecondIsGreaterThan100() {
        int temp1 = -1;
        int temp2 = 101;

        boolean expected = true;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsLessThanZeroAndSecondIsLessThan100() {
        int temp1 = -1;
        int temp2 = 99;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsLessThanZeroAndSecondIsEqualTo100() {
        int temp1 = -1;
        int temp2 = 100;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsEqualToZeroAndSecondIsGreaterThan100() {
        int temp1 = 0;
        int temp2 = 101;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsEqualToZeroAndSecondIsLessThan100() {
        int temp1 = 0;
        int temp2 = 99;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsEqualToZeroAndSecondIsEqualTo100() {
        int temp1 = 0;
        int temp2 = 100;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsGreaterThanZeroAndSecondIsLessThan100() {
        int temp1 = 0;
        int temp2 = 99;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsGreaterThanZeroAndSecondIsEqualTo100() {
        int temp1 = 0;
        int temp2 = 100;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstIsGreaterThanZeroAndSecondIsGreaterThan100() {
        int temp1 = 1;
        int temp2 = 101;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenSecondIsLessThan0AndFirstIsGreaterThan100() {
        int temp1 = 101;
        int temp2 = -1;

        boolean expected = true;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsLessThan0AndFirstIsEqualTo100() {
        int temp1 = 100;
        int temp2 = -1;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsLessThan0AndFirstIsLessThan100() {
        int temp1 = 99;
        int temp2 = -1;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsEqualTo0AndFirstIsGreaterThan100() {
        int temp1 = 101;
        int temp2 = 0;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsEqualTo0AndFirstIsEqualTo100() {
        int temp1 = 100;
        int temp2 = 0;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsEqualTo0AndFirstIsLessThan100() {
        int temp1 = 99;
        int temp2 = 0;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsGreaterThan0AndFirstIsGreaterThan100() {
        int temp1 = 101;
        int temp2 = 1;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsGreaterThan0AndFirstIsEqualTo100() {
        int temp1 = 100;
        int temp2 = 1;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSecondIsGreaterThan0AndFirstIsLessThan100() {
        int temp1 = 99;
        int temp2 = 1;

        boolean expected = false;

        boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual, is(equalTo(expected)));
    }
}
