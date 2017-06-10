package codingbat.array1;

import java.util.Arrays;
import java.util.Optional;

public class P05_Sum3 {

    public int sum3(final int[] nums) {
        int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        return Arrays.stream(numsNormalized).limit(3).sum();
    }
}
