package codingbat.array1;

import java.util.Arrays;
import java.util.Optional;

public class P12_Has23 {

    public boolean has23(final int[] nums) {
        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        return Arrays.stream(numsNormalized).filter(n -> (n == 2 || n == 3)).count() > 0;
    }
}
