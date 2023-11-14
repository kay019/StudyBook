package study.algorithm.leetCode.Problems.Q1672_RichestCustomerWealth;

import java.util.ArrayList;
import java.util.List;

public class Q1672_RichestCustomerWealth {

    public static void main(String[] args){

        int[][] num = {{1,2,3},{1,2,3}};
        maximumWealth(num);

    }

    public static int maximumWealth(int[][] accounts) {
        int win = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            win = Math.max(sum, win);
        }
        return win;
    }

}

