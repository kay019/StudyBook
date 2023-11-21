package study.algorithm.leetCode.Problems.Q605_CanPlaceFlowers;

import java.util.ArrayList;
import java.util.List;

import static study.algorithm.leetCode.Problems.Q1431_KidsWiththeGreatestNumberofCandies.Q1431_KidsWiththeGreatestNumberofCandies.kidsWithCandies;

public class Q605_CanPlaceFlowers {

    public static void main(String[] args){
        int[] i = {1,2,3};
        kidsWithCandies(i, 1);

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty.
            if (flowerbed[i] == 0) {
                // Check if the left and right plots are empty.
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both plots are empty, we can plant a flower here.
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }

}

