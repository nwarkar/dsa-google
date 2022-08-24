package org.practice;

import java.util.ArrayList;
import java.util.List;
/*
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true
 */
class FuzzBuzz {
    public static void main(String[] args) {
        FuzzBuzz fuzzBuzz = new FuzzBuzz();
        List<String> answer = fuzzBuzz.fizzBuzz(15);
        System.out.println(answer);
    }
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5==0) {
                answer.add("FizzBuzz");
            } else if(i % 3  == 0 ) {
                answer.add("Fizz");
            } else if(i % 5  == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}