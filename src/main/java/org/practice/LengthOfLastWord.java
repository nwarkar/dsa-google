package org.practice;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s= " Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) return 0;
       s =s.trim();
       String[] arrs = s.split(" ");
       return arrs[arrs.length-1].length();
    }
}
