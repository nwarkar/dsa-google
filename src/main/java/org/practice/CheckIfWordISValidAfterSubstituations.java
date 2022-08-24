package org.practice;

import java.util.Stack;

public class CheckIfWordISValidAfterSubstituations {
    public static void main(String[] args) {
        System.out.println(isValid("abcabcababcc"));
    }
 //"cababc"
    public static boolean isValid(String s) {
        if (s == null || s.isEmpty() ) {
            return false;
        }
        Stack<Character> stack =  new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if (c == 'a' || c == 'b') {
                stack.push(c);
            } else {
                if (stack.size() == 0 || stack.size() ==1) {
                    return false;
                }
                char top1 = stack.pop();
                char top2 = stack.pop();
                if (top1 != 'b' || top2 != 'a') return false;
            }
        }
        return stack.isEmpty();
    }

}

