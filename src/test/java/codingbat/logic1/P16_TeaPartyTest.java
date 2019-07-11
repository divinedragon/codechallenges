package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P16_TeaPartyTest {

    private P16_TeaParty fixture;

    @Before
    public void setUp() {
        fixture = new P16_TeaParty();
    }

    @Test
    public void teaPartyShouldReturnTwoWhenPartyIsGreat() {

        final int tea1 = 20;
        final int tea2 = 6;
        final int candy1 = 6;
        final int candy2 = 20;

        final int expected = 2;

        final int actual1 = fixture.teaParty(tea1, candy1);
        final int actual2 = fixture.teaParty(tea2, candy2);

        assertThat(actual1, is(expected));
        assertThat(actual2, is(expected));
    }

    @Test
    public void teaPartyShouldReturnOneWhenPartyIsGood() {

        final int tea1 = 6;
        final int tea2 = 8;
        final int candy1 = 8;
        final int candy2 = 6;

        final int expected = 1;

        final int actual1 = fixture.teaParty(tea1, candy1);
        final int actual2 = fixture.teaParty(tea2, candy2);

        assertThat(actual1, is(expected));
        assertThat(actual2, is(expected));
    }

    @Test
    public void teaPartyShouldReturnZeroWhenPartyIsBad() {

        final int tea1 = 3;
        final int tea2 = 8;
        final int candy1 = 8;
        final int candy2 = 3;

        final int expected = 0;

        final int actual1 = fixture.teaParty(tea1, candy1);
        final int actual2 = fixture.teaParty(tea2, candy2);

        assertThat(actual1, is(expected));
        assertThat(actual2, is(expected));
    }
}
