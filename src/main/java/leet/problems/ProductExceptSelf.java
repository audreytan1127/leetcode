package leet.problems;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productWithoutSelf(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i<result.length; i++){
            result[i]= 1;
        }
        int leftPointer = 1;
        for(int i = 0; i<array.length;i++){
            result[i] *= leftPointer;
            leftPointer *= array[i];
        }
        int rightPointer = 1;
        for(int i = array.length -1; i>=0; i--){
            result[i] *= rightPointer;
            rightPointer *= array[i];
        }
        return result;
    }

    public static int[] initialSolution(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer,1);
        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length; j++){
                if (i != j){
                    answer[i] *= nums[j];
                }
            }
        }
        return answer;
    }
}
