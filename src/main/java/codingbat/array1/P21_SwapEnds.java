package codingbat.array1;

import java.util.Optional;

public class P21_SwapEnds {
    public int[] swapEnds(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        final int[] result = numsNormalized.clone();

        if (result.length >= 2) {
            int temp = result[0];
            result[0] = result[result.length - 1];
            result[result.length - 1] = temp;
        }

        return result;

    }
}
