package org.practice;

class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(( Integer.valueOf((int) Math.pow(2,31))));
        System.out.println(reverse(-2147483648));
    }
    public static int reverse(int num) {
        long x = num;
        char sign = new StringBuilder(String.valueOf(x)).charAt(0);
        long factor = 1;
        if(sign == '-') {
            factor = -1;
            String number = String.valueOf(x);
            x= Long.parseLong((number.substring(1)));
        }
        long result = 0;
        long last = 0;
        while (x != 0) {
            last = x %10;
            result = (result * 10) + last;
            x = x/10;
        }
        result = result*factor;
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)result;
    }
}
