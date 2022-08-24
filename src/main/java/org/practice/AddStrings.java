package org.practice;

import java.math.BigInteger;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";

        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        return new BigInteger(num1).add(new BigInteger(num2)).toString();
    }
}
