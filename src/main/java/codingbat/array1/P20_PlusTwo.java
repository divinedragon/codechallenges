package codingbat.array1;

import java.util.Optional;

public class P20_PlusTwo {

    public int[] plusTwo(final int[] a, final int[] b) {

        final int[] aNormazlized = Optional.ofNullable(a).orElse(new int[] {});
        final int[] bNormazlized = Optional.ofNullable(b).orElse(new int[] {});

        final int[] merged = new int[aNormazlized.length + bNormazlized.length];

        int count = 0;

        for (int aValue : aNormazlized) {
            merged[count++] = aValue;
        }

        for (int bValue : bNormazlized) {
            merged[count++] = bValue;
        }

        return merged;
    }
}
