package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P011_StringMatchTest {

    private P011_StringMatch fixture;

    @Before
    public void setUp() {
        fixture = new P011_StringMatch();
    }

    @Test
    public void testcase1() {

        String A = "xxcaazz";
        String B = "xxbaaz";

        int expectedCount = 3;

        int actualCount = fixture.stringMatch(A, B);

        assertThat(actualCount, is(equalTo(expectedCount)));

    }

    @Test
    public void testcase2() {

        String A = "abc";
        String B = "abc";

        int expectedCount = 2;

        int actualCount = fixture.stringMatch(A, B);

        assertThat(actualCount, is(equalTo(expectedCount)));

    }

    @Test
    public void testcase3() {

        String A = "abc";
        String B = "axc";

        int expectedCount = 0;

        int actualCount = fixture.stringMatch(A, B);

        assertThat(actualCount, is(equalTo(expectedCount)));

    }

    @Test
    public void shouldReturnZeroWhenStringIsNull() {

        String A1 = null;
        String B1 = "abc";

        String A2 = "abc";
        String B2 = null;

        String A3 = null;
        String B3 = null;

        int expectedCount = 0;

        int actualCount1 = fixture.stringMatch(A1, B1);
        int actualCount2 = fixture.stringMatch(A2, B2);
        int actualCount3 = fixture.stringMatch(A3, B3);

        assertThat(actualCount1, is(equalTo(expectedCount)));
        assertThat(actualCount2, is(equalTo(expectedCount)));
        assertThat(actualCount3, is(equalTo(expectedCount)));
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty() {

        String A1 = "";
        String B1 = "abc";

        String A2 = "abc";
        String B2 = "";

        String A3 = "";
        String B3 = "";

        int expectedCount = 0;

        int actualCount1 = fixture.stringMatch(A1, B1);
        int actualCount2 = fixture.stringMatch(A2, B2);
        int actualCount3 = fixture.stringMatch(A3, B3);

        assertThat(actualCount1, is(equalTo(expectedCount)));
        assertThat(actualCount2, is(equalTo(expectedCount)));
        assertThat(actualCount3, is(equalTo(expectedCount)));
    }
}
