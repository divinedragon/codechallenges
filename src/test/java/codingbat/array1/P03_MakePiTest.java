package codingbat.array1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P03_MakePiTest {

    private P03_MakePi fixture;

    @Before
    public void setUp() {
        fixture = new P03_MakePi();
    }

    @Test
    public void testcase1() {
        int[] expected = new int[] { 3, 1, 4 };

        int[] actual = fixture.makePi();

        assertThat(actual, is(equalTo(expected)));
    }
}
