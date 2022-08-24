package org.practice;

/*
Input: s = "cabaabac"
Output: 0
Explanation: An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "".
 */
public class MinimumLengthOfString {
    public static void main(String[] args) {
        System.out.println(minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbacccabbabccaccbacaaccacacccaccbbbacaabbccbbcbcbcacacccccccbcbbabccaacaabacbbaccccbabbcbccccaccacaccbcbbcbcccabaaaabbbbbbbbbbbbbbb"));
    }

    public static int minimumLength(String s) {
        if (s.isEmpty()) return 0;
        int start = 0;
        int end = s.length() - 1;

        while (start < end && s.charAt(start) == s.charAt(end)) {
            char ch = s.charAt(start);
            while (start <= end && s.charAt(start) == ch) {
                start++;
            }
            while (end >= start && s.charAt(end) == ch) {
                end--;
            }
        }
        return start > end ? 0 : end - start + 1;
    }
}
