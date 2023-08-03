package study.algorithm.leetCode.Q53_Maximum_Subarray;

import java.util.HashMap;
import java.util.Map;

public class Q53_Maximum_Subarray {
    public static void main(String[] args){
        int[] x = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubArray(x);

    }

    public static int maxSubArray(int[] nums) {
        if(nums[1] >= 1){
            nums[1] = 1;
        }

        return 0;
    }
}
