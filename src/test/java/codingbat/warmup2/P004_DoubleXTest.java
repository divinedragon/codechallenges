package codingbat.warmup2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P004_DoubleXTest {

    private P004_DoubleX fixture;

    @Before
    public void setUp() {
        fixture = new P004_DoubleX();
    }

    @Test
    public void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInFront() {

        String str = "xxbb";

        boolean expected = true;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInEnd() {

        String str = "axx";

        boolean expected = true;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInMiddle() {

        String str = "axxbb";

        boolean expected = true;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNoXExists() {

        String str = "abcdef";

        boolean expected = false;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenXExistsAlone() {

        String str = "axcxefx";

        boolean expected = false;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenFirstXIsAlone() {

        String str = "xcxx";

        boolean expected = false;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenAllX() {

        String str = "xxx";

        boolean expected = true;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenSingleX() {

        String str = "x";

        boolean expected = false;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenTwoX() {

        String str = "xx";

        boolean expected = true;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNull() {

        String str = null;

        boolean expected = false;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenEmpty() {

        String str = "";

        boolean expected = false;

        boolean actual = fixture.doubleX(str);

        assertThat(actual, is(equalTo(expected)));
    }

}
