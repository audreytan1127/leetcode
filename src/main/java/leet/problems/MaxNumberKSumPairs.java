package leet.problems;

import java.util.Arrays;

public class MaxNumberKSumPairs {
    public static int maxOperations(int[]nums, int k){
        //sort nums array from smallest to largest value
        Arrays.sort(nums);
        //initialize count, left pointer and right pointer
        int count = 0, left = 0, right = nums.length - 1;
        //loop thru nums while left is less than right
        while(left<right) {
            //calculate sum of the values at pointers
            int sum = nums[left] + nums[right];
            //if the sum is equal to k
            if (sum == k) {
                //then increment count and left pointer
                ++count;
                ++left;
                //decrement right pointer
                --right;
                //else if sum is smaller than k, increment left pointer to higher value
            } else if (sum < k) {
                ++left;
                //else the sum is larger than k, decrement right pointer to lower value
            } else {
                --right;
            }
        }
        //return count
        return count;
    }
}
