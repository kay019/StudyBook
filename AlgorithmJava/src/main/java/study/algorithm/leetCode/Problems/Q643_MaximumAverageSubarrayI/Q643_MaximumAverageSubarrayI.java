package study.algorithm.leetCode.Problems.Q643_MaximumAverageSubarrayI;


public class Q643_MaximumAverageSubarrayI {

    public static void main(String[] args){

        int[] i = {};
        int k = 0;

        findMaxAverage(i , k);

    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i ++)
            sum += nums[i];
        int maxSum = sum;
        for(int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;
    }


}

