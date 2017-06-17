package codingbat.array1;

import java.util.Optional;

public class P23_MaxTriple {

    public int maxTriple(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length % 2 == 0) {
            throw new IllegalArgumentException();
        }

        int max = Integer.MIN_VALUE;

        if (numsNormalized.length == 1) {
            max = numsNormalized[0];
        } else {
            int first = numsNormalized[0];
            int middle = numsNormalized[numsNormalized.length / 2];
            int last = numsNormalized[numsNormalized.length - 1];

            max = Math.max(first, Math.max(middle, last));
        }

        return max;
    }
}
