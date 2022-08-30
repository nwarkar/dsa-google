package org.practice;

import java.util.Arrays;
/*
[2,5,5,11]
10
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(calTwoSum(arr, target)));
    }

    private static int[] calTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
