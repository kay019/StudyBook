package study.algorithm.leetCode.Problems.Q2215_FindtheDifferenceofTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q2215_FindtheDifferenceofTwoArrays {

    public static void main(String[] args){

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,3,4};

        findDifference(nums1, nums2);

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        //Approach: Using HashSet
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> lis1 = new ArrayList<>();
        List<Integer> lis2 = new ArrayList<>();

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        //traverse and add to set's
        for(int n:nums1){
            s1.add(n);
        }
        for(int n:nums2){
            s2.add(n);
        }

        //traverse and check
        for(int n:s1){
            if(!s2.contains(n)){
                lis1.add(n);
            }
        }
        for(int n:s2){
            if(!s1.contains(n)){
                lis2.add(n);
            }
        }

        //add to ans
        ans.add(lis1);
        ans.add(lis2);

        return ans;

    }


 }

