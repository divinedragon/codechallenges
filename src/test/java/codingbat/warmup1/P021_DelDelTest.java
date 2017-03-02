package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P021_DelDelTest {

    private P021_DelDel fixture;

    @Before
    public void setup() {
        fixture = new P021_DelDel();
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsLessThan4() {

        String str = "a";

        String expected = "a";

        String actual = fixture.delDel(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsGreatherThanEqualTo4AndDoesntContainDel() {

        String str = "abcd";

        String expected = "abcd";

        String actual = fixture.delDel(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnUpdatedStringWhenStringLengthIsGreatherThanEqualTo4AndContainDel() {

        String str = "adel";

        String expected = "a";

        String actual = fixture.delDel(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
