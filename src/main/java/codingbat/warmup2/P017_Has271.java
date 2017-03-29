package codingbat.warmup2;

public class P017_Has271 {

    public boolean has271(int[] nums) {

        if (nums == null || nums.length <= 2) {
            return false;
        }

        for (int i = 0; i < (nums.length - 2); i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) && // the "7" check
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) { // the "1" check
                return true;
            }
        }

        return false;
    }
}
