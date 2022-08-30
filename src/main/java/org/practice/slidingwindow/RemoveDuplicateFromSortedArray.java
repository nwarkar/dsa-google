package org.practice.slidingwindow;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arrs = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates((arrs)));
    }
    public static int removeDuplicates(int[] nums) {
        int index =0;
        nums[index++] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
            }
        }
       /* for (int i = index; i <nums.length ; i++) {
            nums[i] =0;
        }*/
       // System.out.println(Arrays.toString(nums));
        return index;
    }
}
