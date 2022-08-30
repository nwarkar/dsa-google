package org.practice.slidingwindow;

public class ImplementIndexOf {
    public static void main(String[] args) {
        String haystack = "aaaaa", needle = "bba";
        // out =  2
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int mainLen = haystack.length() +1;
        int subLen = needle.length() + 1;
        int[][] window = new int[mainLen][subLen];

        for (int i = 1; i < mainLen; i++) {
            for (int j = 1; j < subLen; j++) {
                if (haystack.charAt(i-1) == needle.charAt(j-1)) {
                    window[i][j] = window[i-1][j-1] +1;
                    if (window[i][j] == subLen-1) {
                        return i - subLen +1;
                    }
                }
            }
        }

       /* for (int i = 0; i < mainLen; i++) {
            for (int j = 0; j < subLen; j++) {
                System.out.print(window[i][j] + " ");
            }
            System.out.println();
        }*/

        return -1;
    }
}
