package org.practice;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    private static int firstMissingPositive(int[] arr) {
        if (arr == null || arr.length  ==0) return 0;
        int min=0;
        Arrays.sort(arr);
        int index =0;
        while (index < arr.length) {
            if (arr[index] >min) {
                min = arr[index];
                break;
            }
            index++;
        }
        if (min > 1) return 1;
        //0 1 2
        while (index +1 < arr.length) {
            if (arr[index] + 1 != arr[index + 1]) {
                return arr[index] + 1;
            }
            index++;
        }
        return arr[index] + 1;
    }
}
