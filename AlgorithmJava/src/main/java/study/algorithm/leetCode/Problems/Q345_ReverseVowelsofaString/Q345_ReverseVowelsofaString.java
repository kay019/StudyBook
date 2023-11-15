package study.algorithm.leetCode.Problems.Q345_ReverseVowelsofaString;


public class Q345_ReverseVowelsofaString {

    public static void main(String[] args){

        reverseVowels("hello");

    }

    public static String reverseVowels(String s) {

        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end){

            while (start < end && !isVowel(word[start])){
                start++;
            }

            while(start < end && !isVowel(word[end])){
                end--;
            }

            if(start < end){
                swap(word, start, end);
                start++;
                end--;
            }


        }

        return new String(word);
    }

    private static char[] swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;

        return word;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}

