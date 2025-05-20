package leet.problems;

public class RunningSumOneDArray {

public static int[] runningSumArray (int[] nums){
    int[] newNums;
    newNums = new int[nums.length];
    int sum = 0;
    for (int i = 0; i<nums.length; i++){
        sum += nums[i];
        newNums [i]= sum;
    }
    return newNums;
}
}
