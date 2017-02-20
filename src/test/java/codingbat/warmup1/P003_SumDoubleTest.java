package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P003_SumDoubleTest {

    private P003_SumDouble fixture;

    @Before
    public void setUp() {
        fixture = new P003_SumDouble();
    }

    @Test
    public void shouldReturnSumWhenFirstIsGreatherThanSecond() {

        int first = 1;
        int second = 2;

        int expected = 3;

        int actual = fixture.sumDouble(first, second);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSumWhenSecondIsGreatherThanFirst() {

        int first = 3;
        int second = 2;

        int expected = 5;

        int actual = fixture.sumDouble(first, second);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnDoubleWhenBothAreSame() {

        int first = 2;
        int second = 2;

        int expected = 8;

        int actual = fixture.sumDouble(first, second);

        assertThat(actual, is(equalTo(expected)));
    }
}
