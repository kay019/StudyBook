package study.algorithm.leetCode.Q13_RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class Q13_RomanToInt {
    public static void main(String[] args){

        romanToInt("MCMXCIV");

    }

    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            System.out.println("i == " + i + " / m :: " + m.get(s.charAt(i)));
            if( i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))){

                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
            System.out.println("ansm :: " + ans);
        }

        return ans;
    }
}
