package study.algorithm.leetCode.Q412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Q412_FizzBuzz {

    public static void main(String[] args){

        fizzBuzz(12);

    }

    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList();
        for(int i = 1; i <= n ; i++){

            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            } else if(i % 3 == 0){
                list.add("Fizz");
            } else if(i % 5 == 0){
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }

        }

        return list;

    }

}

