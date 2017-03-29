package techgig;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JailBreakInBhopalTest {

    @Test
    public void testcase1() {
        int jumpLength = 10;
        int slipLength = 1;

        int[] wallHeights = { 10 };

        int expectedJumpCount = 1;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase2() {
        int jumpLength = 5;
        int slipLength = 1;

        int[] wallHeights = { 9, 10 };

        int expectedJumpCount = 5;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase3() {
        int jumpLength = 5;
        int slipLength = 1;

        int[] wallHeights = { 8 };

        int expectedJumpCount = 2;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase4() {
        int jumpLength = 5;
        int slipLength = 1;

        int[] wallHeights = { 9 };

        int expectedJumpCount = 2;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase5() {
        int jumpLength = 5;
        int slipLength = 1;

        int[] wallHeights = { 10 };

        int expectedJumpCount = 3;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase6() {
        int jumpLength = 5;
        int slipLength = 1;

        int[] wallHeights = { 12 };

        int expectedJumpCount = 3;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase7() {
        int jumpLength = 5;
        int slipLength = 1;

        int[] wallHeights = { 13 };

        int expectedJumpCount = 3;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase8() {
        int jumpLength = 5;
        int slipLength = 1;

        int[] wallHeights = { 14 };

        int expectedJumpCount = 4;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

    @Test
    public void testcase9() {
        int jumpLength = 7;
        int slipLength = 2;

        int[] wallHeights = { 31 };

        int expectedJumpCount = 6;

        int actualJumpCount = JailBreakInBhopal.GetJumpCount(jumpLength, slipLength, wallHeights);

        assertThat(actualJumpCount, is(equalTo(expectedJumpCount)));
    }

}
