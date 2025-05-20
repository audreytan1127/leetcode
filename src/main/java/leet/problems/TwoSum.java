package leet.problems;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];
        for (int i = 0; i<nums.length; i++){

            for (int k = 0; k<nums.length; k++){
                if(i + k == target && i != k){
                    sums[0] = i;
                    sums[1] = k;
                }
            }
        }
        return sums;
    }
}
