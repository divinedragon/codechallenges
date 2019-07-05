package codingbat.logic1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P08_Int1To10Test {

    private P08_Int1To10 fixture;

    @Before
    public void setUp() {
        fixture = new P08_Int1To10();
    }

    @Test
    public void shouldReturnFalseWhenNumberIs0WithoutOutsideMode() {

        final int n = 0;
        final boolean outsideMode = false;

        final boolean expected = false;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs1WithoutOutsideMode() {

        final int n = 1;
        final boolean outsideMode = false;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs5WithoutOutsideMode() {

        final int n = 5;
        final boolean outsideMode = false;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs10WithoutOutsideMode() {

        final int n = 10;
        final boolean outsideMode = false;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs11WithoutOutsideMode() {

        final int n = 11;
        final boolean outsideMode = false;

        final boolean expected = false;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs0WithOutsideMode() {

        final int n = 0;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs1WithOutsideMode() {

        final int n = 1;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNumberIs5WithOutsideMode() {

        final int n = 5;
        final boolean outsideMode = true;

        final boolean expected = false;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs10WithOutsideMode() {

        final int n = 10;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs11WithOutsideMode() {

        final int n = 11;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(n, outsideMode);

        assertThat(actual, is(equalTo(expected)));
    }
}
