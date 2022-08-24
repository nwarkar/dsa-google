package org.practice;

class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
        int originalNumber = x;
        if(x< 0) return false;
        int reverseNumber = 0;
        int rem = 0;
        while (x> 0) {
            rem = x%10;
            reverseNumber = reverseNumber * 10 + rem;
            x = x/10;
        }
        if (reverseNumber == originalNumber) {
            return true;
        }
        return false;
    }
}