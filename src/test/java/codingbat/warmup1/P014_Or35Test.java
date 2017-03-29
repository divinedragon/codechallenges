package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P014_Or35Test {

    private P014_Or35 fixture;

    @Before
    public void setUp() {
        fixture = new P014_Or35();
    }

    @Test
    public void shouldReturnTrueWhenMultipleOf3() {
        boolean expected = true;

        int number = 6;

        boolean actual = fixture.or35(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenMultipleOf5() {
        boolean expected = true;

        int number = 10;

        boolean actual = fixture.or35(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenMultipleOf3And5() {
        boolean expected = true;

        int number = 15;

        boolean actual = fixture.or35(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNoMultiple() {
        boolean expected = false;

        int number = 7;

        boolean actual = fixture.or35(number);

        assertThat(actual, is(equalTo(expected)));
    }
}
