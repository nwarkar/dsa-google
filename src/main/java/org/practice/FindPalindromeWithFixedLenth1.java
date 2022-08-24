package org.practice;

import java.util.Arrays;

/*
    Input: queries = [1,2,3,4,5,90], intLength = 3
        Output: [101,111,121,131,141,999]
        Explanation:
        The first few palindromes of length 3 are:
        101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, ...
        The 90th palindrome of length 3 is 999.

        [2,201429812,8,520498110,492711727,339882032,462074369,9,7,6]
1
 */
class FindPalindromeWithFixedLenth1 {
    public static void main(String[] args) {
        int []queries = {1,2,3,4,5,90};
        int intLength = 3;
        long []result = kthPalindrome(queries, intLength);
        System.out.println(Arrays.toString(result));
    }
    public static long[] kthPalindrome(int[] queries, int intLength) {
        long result[] = new long[queries.length];

        long palindromeCount = 0;
        long maxCount = findNumberOfPalindromesRequired(queries);
        long startingNumber = getStartingPoint(intLength);
        int resultIndex =0;
        while (palindromeCount < maxCount) {
            startingNumber++;
            if(isPalindrome(startingNumber)) {
                if(isIndexPresent(queries, palindromeCount+1)) {
                    result[resultIndex++] = startingNumber;
                }
                palindromeCount++;
            }
            if (resultIndex == queries.length) {
                break;
            }
        }
     return result;
    }
    private static boolean isIndexPresent(int[] queries, long palindromeCount) {
        for (int i = 0; i < queries.length; i++) {
            if (palindromeCount == queries[i]) {
                return true;
            }
        }
        return false;
    }

    private static int getStartingPoint(int intLength) {
        int start=1;
        for (int i = 1; i < intLength; i++) {
            start = start*10;
        }
        return start;
    }

    private static boolean isPalindrome(long number) {
        long orginalNumber = number;
        long reverseNumber = 0;
        long rem  =0 ;
       while (number >0) {
           rem = number %10;
           reverseNumber = (reverseNumber * 10) + rem;
           number = number/10;
       }
       return orginalNumber == reverseNumber;
    }
    private static int findNumberOfPalindromesRequired(int arr[]) {
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}