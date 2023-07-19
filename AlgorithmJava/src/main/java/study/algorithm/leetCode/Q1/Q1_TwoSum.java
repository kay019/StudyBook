package study.algorithm.leetCode.Q1;

public class Q1_TwoSum {

    public static void main(String[] args){

        int[] nums = {2,5,5,11};

        twoSum(nums, 10);

    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i <= nums.length -1 ; i++){
            for(int j = i + 1; j <= nums.length - 1; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
