package leet.problems;

public class FindPivotIndex {
    public int findingPivot(int[] nums){
        //initialize leftSum at 0
        int leftSum = 0;
        //initialize totalSum at 0
        int totalSum = 0;
        //for each num in nums
        for(int num : nums){
            //add each value to totalSum
            totalSum += num;
        }
        //for loop to find right sum
        for(int i = 0; i <nums.length; i++){
            //rightSum is equal to totalSum
            //subtracting leftSum and current index value
            int rightSum = totalSum - leftSum - nums[i];
            //if leftSum and rightSum are equal
            if(leftSum == rightSum){
                //return the current index
                return i;
            }
            //if the either side values are not equal, continue adding values to left sum
            leftSum += nums[i];
        }
        //if neither side is equal at any index, return -1
        return -1;
    }
}
