package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P007_NearHundredTest {

    private P007_NearHundred fixture;

    @Before
    public void setup() {
        fixture = new P007_NearHundred();
    }

    @Test
    public void shouldReturnTrueWhenNear100Lower() {
        boolean expected = true;

        int number = 90;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNear100Upper() {
        boolean expected = true;

        int number = 110;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNear100Mid() {
        boolean expected = true;

        int number = 100;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNear200Lower() {
        boolean expected = true;

        int number = 190;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNear200Upper() {
        boolean expected = true;

        int number = 210;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnTrueWhenNear200Mid() {
        boolean expected = true;

        int number = 200;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void shouldReturnFalseWhenNotNear100Lower() {
        boolean expected = false;

        int number = 89;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNotNear100Upper() {
        boolean expected = false;

        int number = 111;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }
    
    @Test
    public void shouldReturnFalseWhenNotNear200Lower() {
        boolean expected = false;

        int number = 189;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnFalseWhenNotNear200Upper() {
        boolean expected = false;

        int number = 211;

        boolean actual = fixture.nearHundred(number);

        assertThat(actual, is(equalTo(expected)));
    }
}
