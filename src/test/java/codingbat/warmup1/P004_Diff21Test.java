package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P004_Diff21Test {

    private P004_Diff21 fixture;

    @Before
    public void setup() {
        fixture = new P004_Diff21();
    }

    @Test
    public void shouldReturnDiffIfNumberIsGreaterThan21() {
        int number = 22;
        int expected = 2;

        int actual = fixture.diff21(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnDiffIfNumberIsEqualTo21() {
        int number = 21;
        int expected = 0;

        int actual = fixture.diff21(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnDiffIfNumberIsLessTo19() {
        int number = 19;
        int expected = 2;

        int actual = fixture.diff21(number);

        assertThat(actual, is(equalTo(expected)));
    }
}
