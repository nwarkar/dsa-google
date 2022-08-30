package org.practice;
/*
"mississippi"
"issip"
 */
public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        // out =  2
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        int index =0;
        if (needle.isEmpty()) return 0;
        if (haystack.length() <=1) return 0;
        int start = 0;
        int end = haystack.length();
        int matchCounter =0;
        while (start < end ) {
            if(haystack.charAt(start) == needle.charAt(index++)) {
                matchCounter++;
            } else {
                matchCounter = 0;
                index = 0;
                start--;
            }
            start++;
            if (matchCounter == needle.length()) {
                return start-matchCounter;
            }
        }
        return -1;
    }
}
