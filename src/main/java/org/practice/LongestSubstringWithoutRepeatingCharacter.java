package org.practice;

import java.util.HashSet;

/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("c"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max =0;
        int start = 0;
        int end = s.length();
        HashSet<Character> seen = new HashSet<>();
        for (int j = 0; j < end; j++) {
            Character ch = s.charAt(j);
            while (seen.contains(ch)) {
                seen.remove(s.charAt(start++));
            }
            seen.add(ch);
            max = Math.max(max, j-start +1);
        }
        return max;
    }

}
