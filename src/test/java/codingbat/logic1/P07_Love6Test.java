package codingbat.logic1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P07_Love6Test {

    private P07_Love6 fixture;

    @Before
    public void setUp() {
        fixture = new P07_Love6();
    }

    @Test
    public void shouldReturnTrueWhenAIs6() {

        final int a = 6;
        final int b = 0;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenBIs6() {

        final int a = 0;
        final int b = 6;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueNoValueIs6AndSumIs6() {

        final int a = 4;
        final int b = 2;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueNoValueIs6AndSumIsNot6AndDifferenceIs6() {

        final int a = 10;
        final int b = 4;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseNoValueIs6AndSumIsNot6AndDifferenceIsNot6() {

        final int a = 2;
        final int b = 3;

        final boolean expected = false;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual, is(equalTo(expected)));
    }
}
