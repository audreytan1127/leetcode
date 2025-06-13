package leet.problems;

public class LongestSubarrayOfOnesDeleteOneElement {
    public int maxOnesSubarray(int[] nums){
        //initialize left and right pointer
        int left = 0, right = 0;
        //intialize count for zeroes
        int countZeroes = 0;
        //initialize count for max number of ones in array
        int maxOnes = 0;
        //initialize length of nums
        int numLength = nums.length;
        //loop thru array with right along nums length
        for(right =0; right < numLength; ++right){
            //if value of nums at right index is 0
            if(nums[right]==0){
                //increment countZeroes
                countZeroes++;
            }
            //while countZeroes is more than 1
            while(countZeroes > 1){
                //if value of nums at left index is 0
                if(nums[left]==0){
                    //then decrement countZeroes
                    countZeroes--;
                }
                left++;
            }
            //find max value of ones in a row in array
            //replace maxOnes value with number between right and left
            //plus one for any removed zero
            //minus the number of zeroes in array that cannot be deleted
            maxOnes = Math.max(maxOnes, right-left+1-countZeroes);
        }
        //return value of maxOnes but if maxOnes length is the same as the starting nums array
        //then return numsLength minus 1 to remove element
        //and if maxOnes is not the same as numsLength then return maxOnes
        return (maxOnes == numLength) ? maxOnes - 1 : maxOnes;
    }
}

