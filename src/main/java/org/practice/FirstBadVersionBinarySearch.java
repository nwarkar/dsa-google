package org.practice;

// 9.55
public class FirstBadVersionBinarySearch {
    public static void main(String[] args) {
        int n= 2;
        System.out.println(firstBadVersion(n));
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        Integer searchIndex= binarySearch(start, end);
        return searchIndex;
    }

    private static Integer binarySearch(int start, int end) {
        if (start >= end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (isBadVersion(mid) && !isBadVersion(mid-1)) {
            return mid;
        } else if (isBadVersion(mid)) {
            return binarySearch(start, mid);
        } else {
            return binarySearch(mid+1, end);
        }
    }

    private static boolean isBadVersion(int mid) {
        return mid >= 1;
    }

}
