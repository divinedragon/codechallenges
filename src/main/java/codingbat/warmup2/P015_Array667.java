package codingbat.warmup2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P015_Array667 {

    public int array667(final int[] nums) {

        if (nums == null || nums.length <= 1) {
            return 0;
        }

        StringBuilder numString = new StringBuilder();

        Arrays.stream(nums).forEach(num -> numString.append(num));

        Pattern pattern = Pattern.compile("6[67]");
        Matcher matcher = pattern.matcher(numString);

        int count = 0;
        int startIndex = 0;

        while (matcher.find(startIndex)) {
            startIndex = matcher.end() - 1;
            count++;
        }

        return count;
    }
}
