package study.algorithm.leetCode.Problems.Q345_ReverseVowelsofaString;


public class Q345_ReverseVowelsofaString {

    public static void main(String[] args){

        int[] i = {1,0,3,12, 0};
        moveZeroes(i);

    }

    public static void moveZeroes(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int left = nums[i - 1];
            int right = nums[i];
            if(left == 0){
                int tmp = left;
                nums[i - 1] = nums[i];
                nums[i] = right;
            }

            System.out.println("i ===>" + nums[i]);
        }

    }


}

