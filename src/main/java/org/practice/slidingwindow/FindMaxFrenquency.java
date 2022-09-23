package org.practice.slidingwindow;

import java.util.Arrays;

/*
The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.

Example 1:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.
Example 2:

Input: nums = [1,4,8,13], k = 5
Output: 2
Explanation: There are multiple optimal solutions:
- Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
- Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
- Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
Example 3:

Input: nums = [3,9,6], k = 2
Output: 1


Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
1 <= k <= 105
 */
public class FindMaxFrenquency {
    public static void main(String[] args) {
        int[] nums = {1,4,8,13};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        //Step-1: Sorting->
        Arrays.sort(nums);
        //Step-2: Two-Pointers->
        int start = 0, end = 0;
        long totalSum = 0;
        int ans = 1;
        //Iterating over the array:
        while (end < nums.length) {
            totalSum += nums[end];
            //The value of "totalSum+k" should be ">=" "windowSize*nums[end]"
            //then only the window is possible else decrease the "totalSum"
            //till the value "totalSum+k" is ">=" "windowSize*nums[end]"
            while (!((totalSum + k) >= ((end - start + 1) * nums[end]))) {
                totalSum -= nums[start];
                start++;
            }
            ans = Math.max(ans, (end - start + 1));
            end++;
        }
        return ans;
    }
}
