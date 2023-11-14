package study.algorithm.leetCode.Problems.Q217_ContainsDuplicate;

import java.util.Arrays;

public class Q217_ContainsDuplicate {
    public static void main(String[] args){
        int[] x = {-2,1,-3,4,-1,2,1,-5,4};

        containsDuplicate(x);

    }

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i -1]){
                return true;
            }
        }
        return false;
    }
}
