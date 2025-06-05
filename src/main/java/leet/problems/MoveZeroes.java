package leet.problems;

import java.util.ArrayList;

public class MoveZeroes {
    public static int[] moveZero(int[] nums){
   // initilize index of the last non-zero pointer in nums at -1 (before array starts at 0)
        int lastNonZero = -1;
        //loop thru nums array
        for (int i = 0; i < nums.length; ++i){
            //if value of nums[i] is not zero
            if(nums[i] != 0) {
                //move last non zero pointer up 1
                lastNonZero++;
                //store the last non zero value in nums
                int store = nums[lastNonZero];
                //the value of non zero cannot be null so set to value at nums[i]
                nums[lastNonZero] = nums[i];
                // replace nums[i] with next non zero value, placing all 0's at the end of nums
                nums[i] = store;
            }
        }
        return nums;
    }
}
