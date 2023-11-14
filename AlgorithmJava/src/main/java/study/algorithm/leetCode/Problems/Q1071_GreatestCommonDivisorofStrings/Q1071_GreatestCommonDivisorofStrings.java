package study.algorithm.leetCode.Problems.Q1071_GreatestCommonDivisorofStrings;

public class Q1071_GreatestCommonDivisorofStrings {

    public static void main(String[] args){
        gcdOfStrings("ABC", "ABCV");

    }

    public static String gcdOfStrings(String str1, String str2) {
        String res = "";
        for(int i = 0; i < Math.max(str1.length(), str2.length()); i++){
            if(i < str1.length() && i < str2.length()){
                String x = String.valueOf(str1.charAt(i));
                String y  = String.valueOf(str2.charAt(i));
                if(x.equals(y)){
                    if(!res.contains(x)){
                        res += x;
                    }
                }
            }
        }
        return res;
    }

 }

