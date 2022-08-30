package org.practice;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder longestPrefix = new StringBuilder();
        int index = 0;

        while (true) {
            if (strs[0].length() <= index || strs[0].isEmpty()) {
                return longestPrefix.toString();
            }
            Character ch = strs[0].charAt(index);

            int start = 0;
            int end = strs.length;
            while (start < end) {
                 if (strs[start].startsWith(longestPrefix.toString() + ch)) {
                     start++;
                 } else {
                     return longestPrefix.toString();
                 }
            }
            index++;
            longestPrefix.append(ch);
        }

    }
}
