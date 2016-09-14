package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EqualStacks {

    static {
        String input = "5 3 4\n3 2 1 1 1\n4 3 2\n1 1 4 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for (int h1_i = 0; h1_i < n1; h1_i++) {
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for (int h2_i = 0; h2_i < n2; h2_i++) {
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for (int h3_i = 0; h3_i < n3; h3_i++) {
            h3[h3_i] = in.nextInt();
        }
        in.close();

        int[] reverseH1 = reverse(h1);
        int[] reverseH2 = reverse(h2);
        int[] reverseH3 = reverse(h3);

        // System.out.println(Arrays.toString(h1) + " -> " + Arrays.toString(reverseH1));
        // System.out.println(Arrays.toString(h2) + " -> " + Arrays.toString(reverseH2));
        // System.out.println(Arrays.toString(h3) + " -> " + Arrays.toString(reverseH3));

        int[] sum1 = new int[h1.length];
        int[] sum2 = new int[h2.length];
        int[] sum3 = new int[h3.length];

        for (int i = 0; i < reverseH1.length; i++) {
            sum1[i] += (i != 0) ? sum1[i - 1] + reverseH1[i] : reverseH1[0];
        }

        for (int i = 0; i < reverseH2.length; i++) {
            sum2[i] += (i != 0) ? sum2[i - 1] + reverseH2[i] : reverseH2[0];
        }

        for (int i = 0; i < reverseH3.length; i++) {
            sum3[i] += (i != 0) ? sum3[i - 1] + reverseH3[i] : reverseH3[0];
        }

        // System.out.println(Arrays.toString(reverseH1) + " -> " + Arrays.toString(sum1));
        // System.out.println(Arrays.toString(reverseH2) + " -> " + Arrays.toString(sum2));
        // System.out.println(Arrays.toString(reverseH3) + " -> " + Arrays.toString(sum3));

        int[] intersectSum = intersection(sum1, intersection(sum2, sum3));

        int maxHeight = 0;

        for (int i = 0; i < intersectSum.length; i++) {
            if (intersectSum[i] > maxHeight) {
                maxHeight = intersectSum[i];
            }
        }

        System.out.println(maxHeight);

    }

    public static int[] intersection(int[] a, int[] b) {
        List<Integer> intersect = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                intersect.add(a[i]);
                i++;
                j++;
            }
        }

        Collections.sort(intersect);

        int[] returnIntersect = new int[intersect.size()];

        for (int k = 0; k < returnIntersect.length; k++) {
            returnIntersect[k] = intersect.get(k);
        }

        return returnIntersect;
    }

    public static int[] reverse(int[] a) {

        int[] reverse = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            reverse[a.length - 1 - i] = a[i];
        }

        return reverse;
    }
}
