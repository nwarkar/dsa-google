package org.practice;

import java.util.Arrays;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
public class OnePlus {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length -1] != 9) {
            digits[digits.length -1] = digits[digits.length -1] + 1;
        } else  {
            int[] results;
            int size;
            if (digits[0] < 9) {
                results = new int[digits.length];
                size = results.length;
            } else {
                results = new int[digits.length + 1];
                size = results.length -1;
            }
            int end = size;
            int actualNumber=0;
            int factor = 1;
            while (end > 0) {
                actualNumber = digits[end-1] * factor + actualNumber;
                end--;
                factor = factor * 10;
            }
            actualNumber++;
            end = size;
            while ( actualNumber > 0) {
                results[end] = actualNumber % 10;
                actualNumber = actualNumber /10;
                end--;
            }
            return results;
        }
        return digits;
    }
}
