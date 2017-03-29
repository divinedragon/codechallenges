package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P012_Front3Test {

    private P012_Front3 fixture;

    @Before
    public void setUp() {
        fixture = new P012_Front3();
    }

    @Test
    public void shouldReturnCorrectStringWhenStringLengthIsLessThan3() {
        String expected = "aaa";
        String str = "a";
        String actual = fixture.front3(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnCorrectStringWhenStringLengthIsGreaterThan3() {
        String expected = "ChoChoCho";
        String str = "Chocolate";
        String actual = fixture.front3(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnCorrectStringWhenStringLengthIsEqualTo3() {
        String expected = "JavJavJav";
        String str = "Jav";
        String actual = fixture.front3(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnCorrectStringWhenStringIsBlank() {
        String expected = "";
        String str = "";
        String actual = fixture.front3(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
