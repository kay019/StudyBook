package study.algorithm.leetCode.Problems.Q1768_MergeStringsAlternately;

public class Q1768_MergeStringsAlternately {

    public static void main(String[] args){
        mergeAlternately("1", "2");

    }

    public static String mergeAlternately(String word1, String word2) {
        int x = Math.max(word1.length(), word2.length());
        String result = "";
        for(int i = 0 ; i < x; i++){
            if(i < word1.length()){
                result += String.valueOf(word1.charAt(i));
            }
            if(i < word2.length()){
                result += String.valueOf(word2.charAt(i));
            }

        }

        return result;
    }

 }

