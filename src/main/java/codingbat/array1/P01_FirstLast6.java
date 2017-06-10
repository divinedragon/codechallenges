package codingbat.array1;

import java.util.Optional;

public class P01_FirstLast6 {

    public boolean firstLast6(final int[] nums) {

        int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        return numsNormalized.length > 0 && (numsNormalized[0] == 6 || numsNormalized[numsNormalized.length - 1] == 6);
    }
}
