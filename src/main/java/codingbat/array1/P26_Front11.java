package codingbat.array1;

import java.util.Optional;

public class P26_Front11 {

    public int[] front11(final int[] a, final int[] b) {

        final int[] aNormalized = Optional.ofNullable(a).orElse(new int[] {});
        final int[] bNormalized = Optional.ofNullable(b).orElse(new int[] {});

        if (aNormalized.length > 0 && bNormalized.length > 0) {
            return new int[] { aNormalized[0], bNormalized[0] };
        } else if (aNormalized.length > 0) {
            return new int[] { aNormalized[0] };
        } else if (bNormalized.length > 0) {
            return new int[] { bNormalized[0] };
        } else {
            return new int[] {};
        }
    }
}
