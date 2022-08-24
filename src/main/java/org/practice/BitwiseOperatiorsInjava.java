package org.practice;

import java.util.*;

/*
Both the numbers num1 and num2 exist in the array nums.
The sum of the number of set bits in num1 OR num2 and num1 AND num2 is greater than or equal to k, 
where OR is the bitwise OR operation and AND is the bitwise AND operation.
[1,2,3,1,536870911]
3

[1,536870911]
30

[134217727, 7, 268435455, 3, 536870911, 1]
30
 */
public class BitwiseOperatiorsInjava {
    public static void main(String[] args) {
        int []ints = {134217727, 7, 268435455, 3, 536870911, 1};
        System.out.println(countExcellentPairs(ints, 30));
    }
    public static long countExcellentPairs(int[] nums, int k) {
        long pairs = 0;
        int num1=0;
        int num2 =0;
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            elements.add(nums[i]);
        }
        Map<String, Integer > uniqueMap = new HashMap<>();
        Map<Integer, Integer > firstElement = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                num1 = nums[i] & nums[j];
                num2 = nums[i] | nums[j];
                boolean isElementPresent = elements.contains(num1) && elements.contains(num2);
                String key = nums[i] + String.valueOf(nums[j]);
                if (!uniqueMap.containsKey(key) && isElementPresent && (num1 + num2) >= k) {
                    if (nums[i] == nums[j]) {
                        if (firstElement.containsKey(nums[i])) {
                            //   System.out.println("num1= " + num1 + " " + "num2= " + num2 );
                            //System.out.println("i[" + i + "]=" + nums[i] + "  " + "j[" + j + "]=" + nums[j]);
                            pairs++;
                            uniqueMap.put(key, 1);
                            firstElement.put(nums[i], i);
                        }
                    } else {
                        //   System.out.println("num1= " + num1 + " " + "num2= " + num2 );
                        // System.out.println("i[" + i + "]=" + nums[i] + "  " + "j[" + j + "]=" + nums[j]);
                        pairs++;
                        uniqueMap.put(key, 1);
                        firstElement.put(nums[i], i);
                    }
                }
            }
        }
        return pairs;
    }

}
