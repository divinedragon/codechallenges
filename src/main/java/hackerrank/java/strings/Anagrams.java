package hackerrank.java.strings;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "margana"));
        System.out.println(isAnagram("anagramm", "marganaa"));
    }

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char A[] = a.toLowerCase().toCharArray();
        char B[] = b.toLowerCase().toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {

            if (A[i] != B[i]) {
                return false;
            }
        }

        return true;
    }
}
