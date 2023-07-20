package study.algorithm.leetCode.Q9_PalindromeNumber;

public class Q9_PalindromeNumber {
    public static void main(String[] args){

        int x = -21;

        isPalindrome(x);

    }

    public static boolean isPalindrome(int x) {

        System.out.println("--- x : " + x );

        String word = Integer.toString(x);
        StringBuffer sb = new StringBuffer(word).reverse();

        System.out.println("--- word : " + word );
        System.out.println("--- sb.toString() : " + sb.toString());

        if(word.equals(sb.toString())){
            return true;
        }

        return false;
    }
}
