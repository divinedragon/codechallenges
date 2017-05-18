package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P27_MinCatTest {

    private P27_MinCat fixture;

    @Before
    public void setUp() {
        fixture = new P27_MinCat();
    }

    @Test
    public void testcase1() {
        String a = "Hello";
        String b = "Hi";

        String expected = "loHi";

        String actual = fixture.minCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String a = "Hello";
        String b = "java";

        String expected = "ellojava";

        String actual = fixture.minCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String a = "java";
        String b = "Hello";

        String expected = "javaello";

        String actual = fixture.minCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {
        String a = null;
        String b = null;

        String expected = "";

        String actual = fixture.minCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {
        String a = "";
        String b = "";

        String expected = "";

        String actual = fixture.minCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyWhenOneIsNullAndOtherIsNotNull() {
        String a1 = null;
        String b1 = "";
        String a2 = "";
        String b2 = null;
        String a3 = null;
        String b3 = "a";
        String a4 = "a";
        String b4 = null;

        String expected = "";

        String actual1 = fixture.minCat(a1, b1);
        String actual2 = fixture.minCat(a2, b2);
        String actual3 = fixture.minCat(a3, b3);
        String actual4 = fixture.minCat(a4, b4);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
        assertThat(actual3, is(equalTo(expected)));
        assertThat(actual4, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnConcatWhenBothAreSameLength() {
        String a = "a";
        String b = "b";

        String expected = "ab";

        String actual1 = fixture.minCat(a, b);

        assertThat(actual1, is(equalTo(expected)));
    }
}
