package codingbat.array1;

import java.util.Optional;

public class P14_MakeLast {

    public int[] makeLast(final int[] nums) {
        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length > 0) {

            final int[] result = new int[numsNormalized.length * 2];

            result[result.length - 1] = numsNormalized[numsNormalized.length - 1];

            return result;
        }

        return new int[] {};
    }
}
