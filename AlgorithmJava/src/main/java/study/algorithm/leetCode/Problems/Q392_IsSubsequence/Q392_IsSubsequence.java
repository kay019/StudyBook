package study.algorithm.leetCode.Problems.Q392_IsSubsequence;


public class Q392_IsSubsequence {

    public static void main(String[] args){


        isSubsequence("a", "asdfsd");

    }

    public static boolean isSubsequence(String s, String t) {
        boolean chk = false;
        for (int i = 0; i < t.length() - 1; i++){
            String compare = String.valueOf(t.charAt(i));

            for (int j = 0; j < s.length() - 1; j++){
                String word = String.valueOf(s.charAt(j));
                if (word.equals(compare)){
                    chk = true;
                    break;
                }
                if(j == s.length() - 1){
                    if(!chk){
                        return false;
                    }
                }
            }

        }

        return chk;
    }


}

