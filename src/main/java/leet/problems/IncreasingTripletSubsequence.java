package leet.problems;

public class IncreasingTripletSubsequence {
    public static boolean tripletFinder (int[] nums) {
        //if nums length is less than 3 or eqyal to null return false
        if (nums.length<3 || nums == null){
            return false;
        }
        //initialize min and mid values to Math.max
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        //for each num in nums
        for(int num : nums){
            //if the number is less than min
            if (num<min){
                //set min equal to num
                min = num;
                //if next num is greater than min
            } if (num>min){
                //set mid equal to num
                mid = Math.min(num, mid);
                //if succeeding num is larger than mid
            } if(num>mid){
                //a triplet was found and return true
                return true;
            }
        }
        //triplet was not found
        return false;

    }
    public static boolean betterRuntimeTripletFinder(int[]nums){
        //initialize infinity for min and mid
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        //for each num of nums
        for(int num : nums){
            //if num is less than or equal to min
            if(num <= min){
                //set min to num
                min = num;
            }
            //else if num is less than or equal to mid
            else if (num <= mid){
                //then set num to mid
                mid = num;
            }
            //else return true
            else{
                return true;
            }
        }
        return false;
    }
}
