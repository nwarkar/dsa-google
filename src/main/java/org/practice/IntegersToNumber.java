package org.practice;

public class IntegersToNumber {
    private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static final String[] THOUSANDS = {"", "Thousand ", "Million ", "Billion "};


    public static void main(String[] args) {
        System.out.println(numberToWords(1234567));
    }

    private static String numberToWords(int num) {
        StringBuilder builder = new StringBuilder();
        if (num == 0) return "Zero";
        int n;
        if(num >= 1000) {
            for (int i = 3; i > 0; i--) {
                n = (int) Math.pow(1000, i);
                if (num >= n) {
                    builder.append(getWord(num / n)).append(THOUSANDS[i]);
                    num %= n;
                }
            }
        }
        builder.append(getWord(num).trim());
        return builder.toString().trim();
    }
    public static String getWord(int num) {
        // 845
        String str ="";
        if (num >= 100) {
            str += belowTwenty[num/100] + " Hundred ";
            num %= 100;
        }
        if (num >= 20) {
            str+= tens[num/10] + " " + belowTwenty[num%10] + " ";
        } else {
            str+=  belowTwenty[num] + " ";
        }
        return str;
    }

   /* private static String numberToWords(int num) {
        StringBuilder stringBuilder = new StringBuilder();
            if (num < 20) {
                stringBuilder.append(belowTwenty[num]);
            } else if (num < 100) {
                stringBuilder.append(tens[num/10]).append(" ").append(belowTwenty[num%10]);
            } else if (num < 1000) {
                stringBuilder.append(numberToWords(num/100)).append(" Hundred ").append(numberToWords(num%100));
            } else if (num < 100000) {
                stringBuilder.append(numberToWords(num/1000)).append(" Thousand ").append(numberToWords(num%1000));
            } else if (num < 1000000000) {
                stringBuilder.append(numberToWords(num/1000000)).append(" Million ").append(numberToWords(num%1000000));
            }
        return stringBuilder.toString();
    }*/
}
