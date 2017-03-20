package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P003_CountXXTest {

    private P003_CountXX fixture;

    @Before
    public void setup() {
        fixture = new P003_CountXX();
    }

    @Test
    public void shouldReturnZeroWhenStringIsNull() {

        String str = null;

        int expected = 0;

        int actual = fixture.countXX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty() {

        String str = "";

        int expected = 0;

        int actual = fixture.countXX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnZeroWhenStringIsNotEmptyAndNoOccurrence() {

        String str = "abcd";

        int expected = 0;

        int actual = fixture.countXX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnCountOneWhenStringIsNotEmptyAndSingleOccurrence() {

        String str = "axxd";

        int expected = 1;

        int actual = fixture.countXX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnCountOneWhenStringIsNotEmptyAndMultipleOccurrenceNonOverlapping() {

        String str = "abxxcdxx";

        int expected = 2;

        int actual = fixture.countXX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnCountOneWhenStringIsNotEmptyAndMultipleOccurrenceOverlapping() {

        String str = "xxxx";

        int expected = 3;

        int actual = fixture.countXX(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
