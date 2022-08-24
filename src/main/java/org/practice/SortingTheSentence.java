package org.practice;

class SortingTheSentence {

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        if(s == null || s.isEmpty()) return "";

        String tokens[] = s.split(" ");
        String result[] = new String[tokens.length];
        String temp = "";
        int index =0;
        for (int i = 0; i <tokens.length ; i++) {
            temp = tokens[i];
            index = temp.charAt(temp.length()-1) - 49;
            result[index] = temp.substring(0,temp.length()-1);
        }
        temp = "";
        for (int i = 0; i < result.length; i++) {
            temp += result[i] + " ";
        }
        temp.trim();
        return temp;
    }
}