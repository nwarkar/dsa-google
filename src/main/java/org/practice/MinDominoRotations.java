package org.practice;

public class MinDominoRotations {

    public static void main(String[] args) {
        int[] tops = {2,1,2,4,2,2};
        int[] bottoms= {5,2,6,2,3,2};
        System.out.println(minDominoRotations(tops, bottoms));
    }
    public static int minDominoRotations(int[] A, int[] B) {
        int numNumRations = Math.min(getMinRotaions(A[0], A, B),getMinRotaions(B[0], A, B));
        numNumRations = Math.min(numNumRations, getMinRotaions(A[0], B, A));
        numNumRations = Math.min(numNumRations, getMinRotaions(B[0], B, A));
        return numNumRations == Integer.MAX_VALUE ? -1 : numNumRations;
    }

    private static int getMinRotaions(int target, int[] A, int[] B) {
        int minRotaions = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != target && B[i] != target) {
                return Integer.MAX_VALUE;
            } else if(A[i] != target) {
                minRotaions++;
            }
        }
        return minRotaions;
    }
}
