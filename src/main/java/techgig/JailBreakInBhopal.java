package techgig;

public class JailBreakInBhopal {

    public static int GetJumpCount(final int jumpLength, final int slipLength, final int[] wallHeights) {
        int jumpCount = 0;

        int effectiveJumpLength = jumpLength - slipLength;

        for (int i = 0; i < wallHeights.length; i++) {
            jumpCount += (int) Math.ceil((wallHeights[i] - slipLength) * 1.0 / effectiveJumpLength);
        }

        return jumpCount;
    }
}
