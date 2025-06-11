package leet.problems;

public class MaxAverageSubarray {
    public static double maxAverage (int[] nums, int k){
        // initialize currentSum to hold sum of window
        int currentSum = 0;
        //first loop to find the sum of the first window
        //start window at first value of array
        //limit window to value k
        //prefix up i to ensure all values in window are in sum calculation
        for(int i = 0; i < k; ++i){
            currentSum += nums[i];
        }
        //initialize maxSum to currentSum
        int maxSum = currentSum;
        //second loop thru entire array with previous window definition
        //set start of the loop at the end limit, k
        //set length of the loop to go thru entire nums array
        //prefix up i to ensure all values in window are calculated
        for(int i = k; i < nums.length; ++i){
            //find sum of values in window while sliding towards end of loop
            currentSum += (nums[i] - nums[i-k]);
            //if currentSum is larger than current maxSum then replace maxSum
            maxSum = Math.max(maxSum, currentSum);
        }
        //return max average to 10^-5 place = add 2 decimals
        return maxSum * 1.00 / k;
    }
}
