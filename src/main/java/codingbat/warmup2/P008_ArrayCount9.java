package codingbat.warmup2;

import java.util.Arrays;

public class P008_ArrayCount9 {

    public int arrayCount9(final int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        return (int) Arrays.stream(nums).filter(num -> num == 9).count();
    }
}
