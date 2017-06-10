package codingbat.array1;

import java.util.Optional;

public class P04_CommonEnd {

    public boolean commonEnd(final int[] a, final int[] b) {
        int[] aNormalized = Optional.ofNullable(a).orElse(new int[] {});
        int[] bNormalized = Optional.ofNullable(b).orElse(new int[] {});

        return aNormalized.length > 0 && bNormalized.length > 0
                && (aNormalized[aNormalized.length - 1] == bNormalized[bNormalized.length - 1]
                        || aNormalized[0] == bNormalized[0]);
    }
}
