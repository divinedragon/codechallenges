package codingbat.string1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P23_ConCatTest {

    private P23_ConCat fixture;

    @Before
    public void setUp() {
        fixture = new P23_ConCat();
    }

    @Test
    public void testcase1() {
        String a = "abc";
        String b = "cat";

        String expected = "abcat";

        String actual = fixture.conCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        String a = "dog";
        String b = "cat";

        String expected = "dogcat";

        String actual = fixture.conCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        String a = "abc";
        String b = "";

        String expected = "abc";

        String actual = fixture.conCat(a, b);

        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void shouldReturnEmptyStringWhenBothAreNull() {
        String a = null;
        String b = null;

        String expected = "";

        String actual = fixture.conCat(a, b);

        assertThat(actual, is(equalTo(expected))); 
    }
    
    @Test
    public void shouldReturnEmptyStringWhenBothAreEmpty() {
        String a = "";
        String b = "";

        String expected = "";

        String actual = fixture.conCat(a, b);

        assertThat(actual, is(equalTo(expected))); 
    }
    
    @Test
    public void shouldReturnEmptyStringWhenOneIsNullAndOtherIsEmpty() {
        String a1 = "";
        String b1 = null;
        String a2 = null;
        String b2 = "";

        String expected = "";

        String actual1 = fixture.conCat(a1, b1);
        String actual2 = fixture.conCat(a2, b2);

        assertThat(actual1, is(equalTo(expected)));
        assertThat(actual2, is(equalTo(expected)));
    }
}
