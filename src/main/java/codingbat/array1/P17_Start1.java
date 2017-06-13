package codingbat.array1;

import java.util.Optional;

public class P17_Start1 {

    public int start1(final int[] a, final int[] b) {
        final int[] aNormalized = Optional.ofNullable(a).orElse(new int[] {});
        final int[] bNormalized = Optional.ofNullable(b).orElse(new int[] {});

        int count = 0;

        if (aNormalized.length > 0 && aNormalized[0] == 1) {
            count++;
        }

        if (bNormalized.length > 0 && bNormalized[0] == 1) {
            count++;
        }

        return count;
    }
}
