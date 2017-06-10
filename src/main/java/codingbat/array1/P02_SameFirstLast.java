package codingbat.array1;

import java.util.Optional;

public class P02_SameFirstLast {

    public boolean sameFirstLast(final int[] nums) {
        int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        return numsNormalized.length > 0 && numsNormalized[0] == numsNormalized[numsNormalized.length - 1];
    }
}
