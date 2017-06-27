package techgig;

import java.util.Optional;

public class FlippingBits {

    public static int noChangeBits(final String input1, final int input2, final int input3) {

        final String bitsNormalized = Optional.ofNullable(input1).orElse("");

        if (bitsNormalized.isEmpty() || input2 < 1 || input3 < 1) {
            return -1;
        }

        int bitCount = (int) bitsNormalized.chars().filter(c -> c == '1').count();
        final int lowerBound = Math.min(input2, input3) - 1;
        final int upperBound = Math.max(input2, input3) - 1;

        for (int i = lowerBound; i < upperBound; i++) {
            if (bitsNormalized.charAt(i) == '1') {
                bitCount--;
            }
        }

        return bitCount;
    }
}
