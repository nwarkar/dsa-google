package org.practice;

import java.util.Stack;
/*
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.



Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
"1234567890"
9
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 */
public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "10200";
        int k= 1;
        System.out.println(removeKdigits(num, k));
    }
    public static String removeKdigits(String num, int k) {
        if (num.isEmpty() || num.length() == k) return "0";

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(num.charAt(i) + "");
            while (!stack.isEmpty() && k > 0  && number < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(number);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result = result.reverse();
        while (result.charAt(0) == '0' &&  result.length() > 1) {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
