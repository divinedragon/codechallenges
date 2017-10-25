package codingbat.logic1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P01_CigarPartyTest {

    private P01_CigarParty fixture;

    @Before
    public void setUp() {
        fixture = new P01_CigarParty();
    }

    @Test
    public void shouldReturnFalseWhenWeekendAndCigarsLessThan40() {
        final boolean isWeekend = true;
        final int cigars = 39;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenWeekendAndCigarsGreaterThanOrEqualTo40() {
        final boolean isWeekend = true;
        final int cigars1 = 40;
        final int cigars2 = 80;

        final boolean expected = true;

        final boolean actual1 = fixture.cigarParty(cigars1, isWeekend);
        final boolean actual2 = fixture.cigarParty(cigars2, isWeekend);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNotAWeekendAndCigarsLessThan40() {
        final boolean isWeekend = false;
        final int cigars = 39;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNotAWeekendAndCigarsEqualTo40() {
        final boolean isWeekend = false;
        final int cigars = 40;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNotAWeekendAndCigarsEqualTo60() {
        final boolean isWeekend = false;
        final int cigars = 60;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNotAWeekendAndCigarsGreaterThan40AndLessThan60() {
        final boolean isWeekend = false;
        final int cigars = 50;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNotAWeekendAndCigarsGreaterThan60() {
        final boolean isWeekend = false;
        final int cigars = 61;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual, is(equalTo(expected)));
    }
}
