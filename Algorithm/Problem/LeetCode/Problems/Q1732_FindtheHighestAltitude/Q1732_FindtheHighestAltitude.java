package study.algorithm.leetCode.Problems.Q1732_FindtheHighestAltitude;


public class Q1732_FindtheHighestAltitude {

    public static void main(String[] args){

        int[] i = {};
        int k = 0;

        largestAltitude(i);

    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for(int i = 0; i < gain.length; i++){
            current += gain[i]; {
                max = Math.max(max, current);
            }
        }

        return max;
    }

}

