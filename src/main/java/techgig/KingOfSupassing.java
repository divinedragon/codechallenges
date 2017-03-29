package techgig;

public class KingOfSupassing {

    public static int[] surpassersKing(final int[] input1) {
        int result[] = new int[input1.length];

        int lastIndex = input1.length;

        for (int i = 0; i < lastIndex - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < lastIndex; j++) {
                if (input1[i] < input1[j]) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}
