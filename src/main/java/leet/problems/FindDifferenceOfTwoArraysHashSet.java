package leet.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfTwoArraysHashSet {
    public List<List<Integer>> findingDifferenceOfArrays(int[] nums1, int[] nums2){
        //convert the num arrays to hash sets so no duplicates are apparent
        Set<Integer> set1 = convertToSet(nums1);
        Set<Integer> set2 = convertToSet(nums2);
        //initialize the list of lists of integer type
        List<List<Integer>> answer= new ArrayList<>();
        //initialize lists for unique nums in nums1 and nums2
        List<Integer> uniqueToNums1 = new ArrayList<>();
        List<Integer> uniqueToNums2 = new ArrayList<>();
        //for each num in set1
        for(int number : set1){
            //if set2 does not contain the number
            if(!set2.contains(number)){
                //add the number to the uniquetoNums1 list
                uniqueToNums1.add(number);
            }
        }
        //for each num in set2
        for(int number : set2){
            //if set1 does not contain the number
            if(!set1.contains(number)){
                //add number to uniqueToNums2 list
                uniqueToNums2.add(number);
            }
        }
        //add both unique lists to the answer list
        answer.add(uniqueToNums1);
        answer.add(uniqueToNums2);
        //return answer
        return answer;
    }
    //create method to convert arrays to hash sets
    //so that no duplicate numbers will be copied
    private HashSet<Integer> convertToSet(int[] nums){
        //instantiate new hash set to add numbers from nums
        HashSet<Integer> newNums = new HashSet<>();
        //for each number in nums
        for(int num : nums){
            //add the number to the new hash set
            newNums.add(num);
        }
        //return the hash set
        return newNums;
    }
}
