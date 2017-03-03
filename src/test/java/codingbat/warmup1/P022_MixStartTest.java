package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P022_MixStartTest {

    private P022_MixStart fixture;

    @Before
    public void setup() {
        fixture = new P022_MixStart();
    }

    @Test
    public void shouldReturnFalseWhenStringLengthIsLessThan3() {

        String str = "ab";

        boolean expected = false;

        boolean actual = fixture.mixStart(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStringLengthIsGreaterThanOrEqualTo3AndDoesntContainsIXAt2ndAnd3rdPosition() {

        String str = "abcd";

        boolean expected = false;

        boolean actual = fixture.mixStart(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenStringLengthIsGreaterThanOrEqualTo3AndContainsIXAt2ndAnd3rdPosition() {

        String str = "aixd";

        boolean expected = true;

        boolean actual = fixture.mixStart(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
