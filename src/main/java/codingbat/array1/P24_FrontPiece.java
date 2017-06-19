package codingbat.array1;

import java.util.Optional;

public class P24_FrontPiece {

    public int[] frontPiece(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length <= 2) {
            return numsNormalized.clone();
        } else {
            return new int[] { numsNormalized[0], numsNormalized[1] };
        }
    }
}
