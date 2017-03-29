package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P013_AltPairsTest {

    private P013_AltPairs fixture;

    @Before
    public void setUp() {
        fixture = new P013_AltPairs();
    }

    @Test
    public void testcase1() {

        String str = "kitten";

        String expected = "kien";

        String actual = fixture.altPairs(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {

        String str = "Chocolate";

        String expected = "Chole";

        String actual = fixture.altPairs(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {

        String str = "CodingHorror";

        String expected = "Congrr";

        String actual = fixture.altPairs(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {

        String str = null;

        String expected = "";

        String actual = fixture.altPairs(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        String str = "";

        String expected = "";

        String actual = fixture.altPairs(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsLessThanEqual2() {

        String str1 = "a";
        String str2 = "ab";

        String expected1 = "a";
        String expected2 = "ab";

        String actual1 = fixture.altPairs(str1);
        String actual2 = fixture.altPairs(str2);

        assertThat(actual1, is(equalTo(expected1)));
        assertThat(actual2, is(equalTo(expected2)));
    }
}
