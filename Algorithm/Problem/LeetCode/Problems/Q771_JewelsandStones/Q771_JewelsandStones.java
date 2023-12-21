package study.algorithm.leetCode.Problems.Q2236_RootEqualsSumofChildren;

public class Q2236_RootEqualsSumofChildren {

    public int numJewelsInStones(String jewels, String stones) {

        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        int result = 0;

        for(int i = 0; i < jewel.length; i++ ){
            char x = jewel[i];
            for(int j = 0; j < stone.length; j++){
                char y = stone[j];
                if(x == y){
                    result ++;
                }
            }
        }

        return result;

    }


    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) if(jewels.indexOf(stones.charAt(i)) != -1) count++;
        return count;
    }

 }

