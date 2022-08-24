package org.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwice {

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abcdd"));
    }
    public static char repeatedCharacter(String s) {
        char c = 0;
        int start = 0;
        int end = s.length();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        while (start < end) {
               c = s.charAt(start);
               if(!characterIntegerMap.containsKey(c)) {
                   characterIntegerMap.put(c, 1);
               } else {
                   return c;
               }
            start++;
        }
        return c;
    }
}
