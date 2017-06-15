package codingbat.array1;

import java.util.Optional;

public class P22_MiddleThree {
    public int[] midThree(final int[] nums) {
        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length == 0) {
            return numsNormalized.clone();
        } else if (numsNormalized.length % 2 == 0) {
            throw new IllegalArgumentException();
        }

        int mid = numsNormalized.length / 2;
        int left = mid - 1;
        int right = mid + 1;

        return new int[] { numsNormalized[left], numsNormalized[mid], numsNormalized[right] };
    }
}
