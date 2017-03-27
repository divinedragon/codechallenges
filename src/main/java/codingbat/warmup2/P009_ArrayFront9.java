package codingbat.warmup2;

public class P009_ArrayFront9 {

    public boolean arrayFront9(final int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        int loopCounter = (nums.length <= 4) ? nums.length : 4;

        for (int i = 0; i < loopCounter; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }
}
