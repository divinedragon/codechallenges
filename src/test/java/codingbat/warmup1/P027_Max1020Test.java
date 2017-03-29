package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P027_Max1020Test {

    private P027_Max1020 fixture;

    @Before
    public void setUp() {
        fixture = new P027_Max1020();
    }

    @Test
    public void shouldReturnMaxAs0WhenAIsLessThan10AndBIsLessThan10() {
        int A = 9;
        int B = 9;

        int expected = 0;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsEqualTo10() {
        int A = 9;
        int B = 10;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsGreaterThan10() {
        int A = 9;
        int B = 19;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsEqualTo20() {
        int A = 9;
        int B = 20;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsGreaterThan20() {
        int A = 9;
        int B = 21;

        int expected = 0;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo10AndBIsLessThan10() {
        int A = 10;
        int B = 9;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsEqualTo10() {
        int A = 10;
        int B = 10;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsGreaterThan10() {
        int A = 10;
        int B = 19;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsEqualTo20() {
        int A = 10;
        int B = 20;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo10AndBIsGreaterThan20() {
        int A = 10;
        int B = 21;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsLessThan10() {
        int A = 19;
        int B = 9;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsEqualTo10() {
        int A = 19;
        int B = 10;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan10AndBIsGreaterThan10() {
        int A = 19;
        int B = 19;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan10AndBIsEqualTo20() {
        int A = 19;
        int B = 20;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsGreaterThan20() {
        int A = 19;
        int B = 21;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsLessThan10() {
        int A = 20;
        int B = 9;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsEqualTo10() {
        int A = 20;
        int B = 10;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo20AndBIsGreaterThan10() {
        int A = 20;
        int B = 19;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo20AndBIsEqualTo20() {
        int A = 20;
        int B = 20;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsGreaterThan20() {
        int A = 20;
        int B = 21;

        int expected = A;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAs0WhenAIsGreaterThan20AndBIsLessThan10() {
        int A = 21;
        int B = 9;

        int expected = 0;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsEqualTo10() {
        int A = 21;
        int B = 10;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsGreaterThan10() {
        int A = 21;
        int B = 19;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsEqualTo20() {
        int A = 21;
        int B = 20;

        int expected = B;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void shouldReturnMaxAs0WhenAIsGreaterThan20AndBIsGreaterThan20() {
        int A = 21;
        int B = 21;

        int expected = 0;

        int actual = fixture.max1020(A, B);

        assertThat(actual, is(equalTo(expected)));
    }
}
