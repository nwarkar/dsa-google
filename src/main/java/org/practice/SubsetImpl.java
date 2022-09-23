package org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetImpl {
    public static void main(String[] args) {
        int [] nums = {3,2,1};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null) return results;
        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        findAllSubSets(0, results,subset, nums);
        return results;
    }
    private static void findAllSubSets(int index, List<List<Integer>> results, List<Integer> subset, int[] nums) {
        results.add(new ArrayList<>(subset));
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            System.out.println(subset);
            findAllSubSets(i+1, results,subset, nums);
            subset.remove(subset.size()-1 );
        }
    }
}
