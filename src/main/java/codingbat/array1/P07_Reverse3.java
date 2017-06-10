package codingbat.array1;

import java.util.Optional;

public class P07_Reverse3 {

    public int[] reverse3(final int[] nums) {
        int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        int[] reversed = new int[numsNormalized.length];

        for (int i = 0; i < numsNormalized.length; i++) {
            reversed[i] = numsNormalized[numsNormalized.length - 1 - i];
        }

        return reversed;
    }
}
