package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P023_StartOzTest {

    private P023_StartOz fixture;

    @Before
    public void setup() {
        fixture = new P023_StartOz();
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        String str = "";

        String expected = "";

        String actual = fixture.startOz(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStringIsSingleChar() {

        String str = "a";

        String expected = "a";

        String actual = fixture.startOz(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsMultiCharAndDoesntStartWithOZ() {

        String str = "ab";

        String expected = "";

        String actual = fixture.startOz(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringOWhenStringIsMultiCharAndStartWithOAndNoZAtSecondPlace() {

        String str = "obvious";

        String expected = "o";

        String actual = fixture.startOz(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringOWhenStringIsMultiCharAndDoesntStartWithOAndZAtSecondPlace() {

        String str = "aztec";

        String expected = "z";

        String actual = fixture.startOz(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnStringOWhenStringIsMultiCharAndStartWithOZ() {

        String str = "oznic";

        String expected = "oz";

        String actual = fixture.startOz(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
