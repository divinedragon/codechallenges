package codingbat.array1;

import java.util.Optional;

public class P11_MakeEnds {

    public int[] makeEnds(final int[] nums) {
        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length == 0) {
            return new int[] {};
        } else if (numsNormalized.length == 1) {
            return new int[] { numsNormalized[0], numsNormalized[0] };
        } else if (numsNormalized.length == 2) {
            return numsNormalized.clone();
        } else {
            return new int[] { numsNormalized[0], numsNormalized[numsNormalized.length - 1] };
        }
    }

}
