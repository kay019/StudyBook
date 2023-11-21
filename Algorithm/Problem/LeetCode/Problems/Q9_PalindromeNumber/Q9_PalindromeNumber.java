package study.algorithm.leetCode.Problems.Q9_PalindromeNumber;

public class Q9_PalindromeNumber {
    public static void main(String[] args){

        int x = -21;

        isPalindrome(x);

    }

    public static boolean isPalindrome(int x) {

        String word = Integer.toString(x);
        StringBuffer sb = new StringBuffer(word).reverse();

        if(word.equals(sb.toString())){
            return true;
        }

        return false;
    }
}
