package study.algorithm.leetCode.Q383_RansomNote;

public class Q383_RansomNote {

    public static void main(String[] args) {

        ransomNote("ass", "aass");

    }

    public static boolean ransomNote(String ransomNote, String magazine) {
        StringBuilder builder = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++){
            char a = ransomNote.charAt(i);
            int x = builder.indexOf(String.valueOf(a));
            if(x == -1){
                return false;
            }
            builder.deleteCharAt(x);
        }

        return true;
    }



}

