package study.algorithm.leetCode.Problems.Q2236_RootEqualsSumofChildren;

public class Q1920_BuildArrayfromPermutation{
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] =  nums[nums[i]];
        }

        return result;
    }

 }

