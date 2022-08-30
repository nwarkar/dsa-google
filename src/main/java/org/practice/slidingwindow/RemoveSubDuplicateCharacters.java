package org.practice.slidingwindow;

import java.util.Stack;

public class RemoveSubDuplicateCharacters {
    public static void main(String[] args) {
        String str = "acaaabbbbadddde";
        // acae
        System.out.println(removeSubDuplicateChar(str));
    }

    private static String removeSubDuplicateChar(String str) {
        Stack<Character> stack = new Stack<>();
        int start = 0;
        int end = str.length();
        while (start < end) {
            Character ch = str.charAt(start);
            if (!stack.isEmpty() && stack.peek() == ch) {
                 while (stack.peek() == str.charAt(start)) {
                    start++;
                }
                stack.pop();
            } else {
                stack.push(ch);
                start++;
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}
