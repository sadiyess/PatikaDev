package Java101;

public class StringBuilder {
    /*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.*/


    public static  void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";
        String result = mergeAlternately(word1, word2);
        // System.out.println(result);

    }

    public static String mergeAlternately(String word1, String word2) {


        java.lang.StringBuilder StringBuilder = new java.lang.StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            StringBuilder.append(word1.charAt(i));
            StringBuilder.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            StringBuilder.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            StringBuilder.append(word2.charAt(j));
            j++;
        }

        return StringBuilder.toString();
    }
}
