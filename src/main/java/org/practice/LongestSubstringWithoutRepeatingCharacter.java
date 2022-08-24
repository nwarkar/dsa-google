package org.practice;

import java.util.HashMap;
import java.util.Map;

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
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        if (s.equals(" ")) return 1;
        int start = 0;
        int end = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxLenght = 0;
        StringBuilder subString = new StringBuilder();
        while (start < end) {
            Character c = s.charAt(start);
            if(!map.containsKey(s.charAt(start))) {
                map.put(c, start);
                subString.append(c);
            } else {
                map = new HashMap<>();
                subString = new StringBuilder();
                map.put(c, start);
                subString.append(c);
            }
            if(maxLenght < subString.length()) {
                maxLenght = subString.length();
            }
            start++;
        }
        return maxLenght == 0? map.size() : maxLenght ;
    }

}
