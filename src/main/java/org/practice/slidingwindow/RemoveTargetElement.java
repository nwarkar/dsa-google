package org.practice.slidingwindow;

public class RemoveTargetElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int index =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        /*for (int i = index; i <nums.length ; i++) {
            nums[i] =0;
        }
         System.out.println(Arrays.toString(nums));*/
        return index;
    }
}
