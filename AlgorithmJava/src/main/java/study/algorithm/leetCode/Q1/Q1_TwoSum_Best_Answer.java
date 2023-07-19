package study.algorithm.leetCode.Q1;

public class Q1_TwoSum_Best_Answer {

    public static void main(String[] args){

        int[] nums = {2,5,5,11};

        twoSum(nums, 10);

    }

    public static int[] twoSum(int[] nums, int target) {
        int x=1;
        while(true)
        {
            for(int i=0;i<nums.length-x;i++)
            {
                if(nums[i]+nums[i+x]==target)
                { System.gc();
                    return new int[]{i,i+x};
                }

            }
            x++;
        }
    }
}
