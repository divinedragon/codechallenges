package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P09_ComboStringTest {

    private P09_ComboString fixture;

    @Before
    public void setUp() {
        fixture = new P09_ComboString();
    }

    @Test
    public void testcase1() {
        String strA = "Hello";
        String strB = "hi";

        String expected = "hiHellohi";

        String actual = fixture.comboString(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String strA = "hi";
        String strB = "Hello";

        String expected = "hiHellohi";

        String actual = fixture.comboString(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String strA = "aaa";
        String strB = "b";

        String expected = "baaab";

        String actual = fixture.comboString(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreNull() {
        String strA = null;
        String strB = null;

        String expected = "";

        String actual = fixture.comboString(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreEmpty() {
        String strA = "";
        String strB = "";

        String expected = "";

        String actual = fixture.comboString(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenBothOneIsEmptyAndOtherIsNull() {

        String strA;
        String strB;
        String expected = "";
        String actual;

        strA = "";
        strB = null;

        actual = fixture.comboString(strA, strB);
        assertThat(actual, is(equalTo(expected)));

        strA = null;
        strB = "";

        actual = fixture.comboString(strA, strB);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase4() {
        String strA = "a";
        String strB = "b";

        String expected = "aba";

        String actual = fixture.comboString(strA, strB);

        assertThat(actual, is(equalTo(expected)));
    }
}
