package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P006_Makes10Test {

    private P006_Makes10 fixture;

    @Before
    public void setup() {
        fixture = new P006_Makes10();
    }

    @Test
    public void shouldReturnTrueWhenFirstNumberIs10() {
        boolean shouldMake10 = true;

        int a = 10;
        int b = 20;

        boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10, is(equalTo(shouldMake10)));
    }

    @Test
    public void shouldReturnTrueWhenSecondNumberIs10() {
        boolean shouldMake10 = true;

        int a = 20;
        int b = 10;

        boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10, is(equalTo(shouldMake10)));
    }

    @Test
    public void shouldReturnTrueWhenSumIs10() {
        boolean shouldMake10 = true;

        int a = 7;
        int b = 3;

        boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10, is(equalTo(shouldMake10)));
    }

    @Test
    public void shouldReturnFalseWhenOtherwise() {
        boolean shouldMake10 = false;

        int a = 11;
        int b = 9;

        boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10, is(equalTo(shouldMake10)));
    }
}
