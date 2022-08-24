package org.practice;

import java.util.Stack;

class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
    public static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '[') {
                stack.push('[');
            } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else  if (c == '{') {
                stack.push('{');
            } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}