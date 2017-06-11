package codingbat.array1;

import java.util.Optional;

public class P10_MiddleWay {

    public int[] middleWay(final int[] a, final int[] b) {

        int[] aNormalized = Optional.ofNullable(a).orElse(new int[] {});
        int[] bNormalized = Optional.ofNullable(b).orElse(new int[] {});

        int aMid = Integer.MIN_VALUE;
        int bMid = Integer.MIN_VALUE;

        if ((aNormalized.length > 0 && aNormalized.length % 2 == 0)
                || (bNormalized.length > 0 && bNormalized.length % 2 == 0)) {
            throw new IllegalArgumentException();
        }

        if (aNormalized.length > 0 && aNormalized.length % 2 != 0) {
            aMid = aNormalized[aNormalized.length / 2];
        }

        if (bNormalized.length > 0 && bNormalized.length % 2 != 0) {
            bMid = bNormalized[bNormalized.length / 2];
        }

        if (aMid > 0 && bMid > 0) {
            return new int[] { aMid, bMid };
        }

        if (aMid > 0) {
            return new int[] { aMid };
        }

        if (bMid > 0) {
            return new int[] { bMid };
        }

        return new int[] {};
    }
}
