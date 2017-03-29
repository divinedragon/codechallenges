package codingbat.warmup2;

public class P016_NoTriples {

    public boolean noTriples(final int[] nums) {

        if (nums == null || nums.length < 3) {
            return true;
        }

        int lastNum = nums[0];

        int numCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == lastNum) {
                numCount++;
            } else {
                lastNum = nums[i];
                numCount = 1;
                continue;

            }

            if (numCount == 3) {
                return false;
            }
        }

        return true;
    }
}
