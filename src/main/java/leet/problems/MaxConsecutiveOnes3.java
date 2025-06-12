package leet.problems;

public class MaxConsecutiveOnes3 {
        public int consecutiveOnes(int[] nums, int k){
          //initialize left and right pointer to no element in array = -1
            int leftPointer = 0;
            //initialize count for max number of ones in a row
            int oneCount = 0;
            //initialize count for 0's
            int zeroCount = 0;
      // loop thru as long as the rightPointer is not more than length of nums
            for(int rightPointer = 0; rightPointer < nums.length; ++rightPointer){
                //if the value of right pointer is 0
                if (nums[rightPointer] == 0) {
                    //the number of zeroes that can be flipped goes up
                        zeroCount++;
                }
                //move the right pointer up
                rightPointer++;
                //if there are no more zeroes to be flipped, the left pointer needs to move
                while (zeroCount > k) {
                    //if the left pointer is on a zero
                    if(nums[leftPointer] == 0){
                        //the number of zeroes that can be flipped to one goes down
                        zeroCount--;
                    }
                    //move the left pointer up if the condition that left pointer is on a zero is true
                    leftPointer++;
                }
                //find the max number of ones by finding length of window
               oneCount = Math.max(oneCount, rightPointer - leftPointer + 1);
            }
            //return the max number of ones in a row
            return oneCount;
        }
}
