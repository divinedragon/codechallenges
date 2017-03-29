package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P028_StringETest {

    private P028_StringE fixture;

    @Before
    public void setUp() {
        fixture = new P028_StringE();
    }

    @Test
    public void shouldReturnFalseWhenStringIsEmpty() {

        String str = "";

        boolean expected = false;

        boolean actual = fixture.stringE(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotEmptyAndHasZeroE() {

        String str = "a";

        boolean expected = false;

        boolean actual = fixture.stringE(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenStringIsNotEmptyAndHasOneE() {

        String str = "ae";

        boolean expected = true;

        boolean actual = fixture.stringE(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenStringIsNotEmptyAndHasTwoE() {

        String str = "aee";

        boolean expected = true;

        boolean actual = fixture.stringE(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenStringIsNotEmptyAndHasThreeE() {

        String str = "aebece";

        boolean expected = true;

        boolean actual = fixture.stringE(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotEmptyAndHasFourE() {

        String str = "aebecede";

        boolean expected = false;

        boolean actual = fixture.stringE(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
