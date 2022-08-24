package org.practice;

class CheckForStrictlyIncreasing {
    public static void main(String[] args) {
        String s = "hello world 5 x 5";
        System.out.println(areNumbersAscending(s) );
    }
    public static boolean areNumbersAscending(String s) {
        if(s== null || s.isEmpty()) {
            return false;
        }
        String tokens[] = s.split(" ");
        int index =0;
        int previousNumber =0;
        while (index< tokens.length) {
            String token = tokens[index];
            if(Character.isDigit(token.charAt(0))) {
                int number = Integer.parseInt(token);
                if(number <= previousNumber) {
                    return false;
                }
                previousNumber = number;
            }
            index++;
        }
        return true;
    }
}