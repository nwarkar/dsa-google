package org.practice;

import java.util.ArrayList;
import java.util.List;

public class EvaluateStringExpression {
    public static void main(String[] args) {
        String str = "1+2-3+45-56";
        long result = calculateMathExpression(str);
        System.out.println(result);
    }
    private static long calculateMathExpression(String str) {
        if (str == null || str.isEmpty()) return -1;
        long result =0;
        List<String> elements = new ArrayList<>();
        String value ="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '+' || str.charAt(i) == '-') {
                if(!value.isEmpty()) {
                    elements.add(value);
                    value = "";
                }
                elements.add(String.valueOf(str.charAt(i)));
            } else {
                value += str.charAt(i);
            }
        }
        if (!value.isEmpty()) {
            elements.add(value);
        }
        for (int i = 0; i < elements.size(); i++) {
                if("+".equals(elements.get(i))) {
                       result+= Integer.parseInt(elements.get(++i));
                } else if("-".equals(elements.get(i))) {
                    result-= Integer.parseInt(elements.get(++i));
                } else {
                    result = Integer.parseInt(elements.get(i));
                }
        }
        return result;
    }


}