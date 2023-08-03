package study.algorithm.leetCode.Q217_Contains_Duplicate;

public class Q217_Contains_Duplicate {
    public static void main(String[] args){
        int[] x = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubArray(x);

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
