package codingbat.array1;

import java.util.Optional;

public class P26_Make2 {

    public int[] make2(final int[] a, final int[] b) {

        final int[] aNormalized = Optional.ofNullable(a).orElse(new int[] {});
        final int[] bNormalized = Optional.ofNullable(b).orElse(new int[] {});

        final int[] merged = new int[aNormalized.length + bNormalized.length];

        int count = 0;

        for (int n : aNormalized) {
            merged[count++] = n;
        }

        for (int n : bNormalized) {
            merged[count++] = n;
        }

        if (merged.length <= 2) {
            return merged.clone();
        } else {
            return new int[] { merged[0], merged[1] };
        }
    }
}
