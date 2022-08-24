package org.practice;

// 9.55
public class BinarySearch {
    public static void main(String[] args) {
        int[] arrays = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(search(arrays, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        Integer searchIndex= binarySearch(nums, target, start, end);
        return searchIndex;
    }
    private static Integer binarySearch(int[] nums, int target, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, start, mid);
        } else {
            return binarySearch(nums, target,  mid+ 1, end);
        }
    }
}
