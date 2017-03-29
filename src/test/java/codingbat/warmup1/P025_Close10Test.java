package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P025_Close10Test {

    private P025_Close10 fixture;

    @Before
    public void setUp() {
        fixture = new P025_Close10();
    }

    @Test
    public void shouldReturnNum1WhenNum1IsClose() {
        int A = 8;
        int B = 13;

        int expected = A;

        int actual = fixture.close10(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnNum2WhenNum2IsClose() {
        int A = 13;
        int B = 8;

        int expected = B;

        int actual = fixture.close10(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturn0WhenBothAreEquallyClose() {
        int A = 7;
        int B = 13;

        int expected = 0;

        int actual = fixture.close10(A, B);

        assertThat(actual, is(equalTo(expected)));
    }
}
