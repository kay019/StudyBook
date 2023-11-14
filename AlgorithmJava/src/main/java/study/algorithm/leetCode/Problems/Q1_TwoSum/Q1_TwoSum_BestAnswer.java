package study.algorithm.leetCode.Problems.Q1_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Q1_TwoSum_BestAnswer {

    //Burte Force
    public static int[] twoSum_fast_time(int[] nums, int target) {
        int x=1;
        while(true)
        {
            for(int i=0;i<nums.length-x;i++)
            {
                if(nums[i]+nums[i+x]==target)
                {
                    return new int[]{i,i+x};
                }

            }
            x++;
        }
    }

    //Brute Force Algorithm
    public static int[] brut_force(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }

    //Two-pass Hash Table
    public static int[] two_pass_hash_table(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }

    //One-pass Hash Table
    public static int[] one_pass_hash_table(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }


    public static void main(String[] args){

        int[] nums = {2,5,5,11};
        int target = 10;

        twoSum_fast_time(nums, target);
        brut_force(nums, target);
        two_pass_hash_table(nums, target);
        one_pass_hash_table(nums, target);

    }


}
