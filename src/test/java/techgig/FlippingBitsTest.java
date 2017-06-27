package techgig;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FlippingBitsTest {

    @Test
    public void testcase1() {
        final String bits = "10110101101";
        final int j = 3;
        final int k = 4;

        final int expected = 6;

        final int actual = FlippingBits.noChangeBits(bits, j, k);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        final String bits = "10110101101";
        final int j = 3;
        final int k = 0;

        final int expected = -1;

        final int actual = FlippingBits.noChangeBits(bits, j, k);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        final String bits = "10110101101";
        final int j = 0;
        final int k = 4;

        final int expected = -1;

        final int actual = FlippingBits.noChangeBits(bits, j, k);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase4() {
        final String bits = "10110101101";
        final int j = 0;
        final int k = 0;

        final int expected = -1;

        final int actual = FlippingBits.noChangeBits(bits, j, k);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase5() {
        final String bits = null;
        final int j = 0;
        final int k = 0;

        final int expected = -1;

        final int actual = FlippingBits.noChangeBits(bits, j, k);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase6() {
        final String bits = "";
        final int j = 0;
        final int k = 0;

        final int expected = -1;

        final int actual = FlippingBits.noChangeBits(bits, j, k);

        assertThat(actual, is(equalTo(expected)));
    }
}
