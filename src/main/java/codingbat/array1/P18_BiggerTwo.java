package codingbat.array1;

import java.util.Arrays;
import java.util.Optional;

public class P18_BiggerTwo {

    public int[] biggerTwo(final int[] a, final int[] b) {
        final int[] aNormalized = Optional.ofNullable(a).orElse(new int[] {});
        final int[] bNormalized = Optional.ofNullable(b).orElse(new int[] {});

        final int sumA = Arrays.stream(aNormalized).sum();
        final int sumB = Arrays.stream(bNormalized).sum();

        if (sumB > sumA) {
            return bNormalized.clone();
        } else {
            return aNormalized.clone();
        }
    }
}
