package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P016_StartHiTest {

    private P016_StartHi fixture;

    @Before
    public void setUp() {
        fixture = new P016_StartHi();
    }

    @Test
    public void shouldReturnTrueWhenStartsWithHi() {
        String str = "hi there";
        boolean expected = true;
        boolean actual = fixture.startHi(str);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenDoesntStartsWithHi() {
        String str = "hello";
        boolean expected = false;
        boolean actual = fixture.startHi(str);

        assertThat(actual, is(equalTo(expected)));
    }
}
