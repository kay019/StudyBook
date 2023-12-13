package study.algorithm.leetCode.Problems.Q1480_RunningSumof1dArray;

public class Q1480_RunningSumof1dArray {

    public static void main(String[] args){

        int[] num = {1,2,3};
        runningSum(num);

    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int x = 0;
        for(int i = 0; i < nums.length ; i++){
            x += nums[i];
            result[i] = x;
        }

        return result;
    }

}

