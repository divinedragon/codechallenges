package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P09_SpecialElevenTest {

    private P09_SpecialEleven fixture;

    @Before
    public void setUp() {
        fixture = new P09_SpecialEleven();
    }

    @Test
    public void shouldReturnTrueWhenNumberIsAMultipleOf11() {

        final int n = 22;

        final boolean expected = true;

        final boolean actual = fixture.specialEleven(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTrueWhenNumberIs1MoreThanMultipleOf11() {

        final int n = 23;

        final boolean expected = true;

        final boolean actual = fixture.specialEleven(n);

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTrueWhenNumberIsNotASpecialNumber() {

        final int n = 24;

        final boolean expected = false;

        final boolean actual = fixture.specialEleven(n);

        assertThat(actual, is(expected));
    }
}
