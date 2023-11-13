package study.algorithm.leetCode.Q1342_NumberofStepstoReduceaNumbertoZero;

public class Q1342_NumberofStepstoReduceaNumbertoZero {

    public static void main(String[] args){

        numberOfSteps(12);

    }

    public static int numberOfSteps(int num) {
        int step = 0;
        while (num != 0){
            num = num % 2 == 0? num /2 : num - 1;
            step++;
        }

        return step;
    }

}

