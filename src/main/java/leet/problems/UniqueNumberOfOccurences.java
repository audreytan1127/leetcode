package leet.problems;

import java.util.*;

public class UniqueNumberOfOccurences {
    public boolean uniqueAmountOfOccurrences (int[] nums){
        //initialize hash map to add count of numbers
        Map<Integer, Integer> occurrences = new HashMap<>();
        //for each number in nums
        for(int number : nums){
            //use hashmap method merge to instantiate count of a number at 1
            //and Integer function of sum to increment if more than 1 is found
            occurrences.merge(number, 1, Integer::sum);
        }
        //initialize uniqueOccurrences hash set to make sure only unique numbers from occurrences map are present
        Set<Integer> uniqueOccurrences = new HashSet<>(occurrences.values());
        //return true if the size of occurrences and uniqueOccurrences are equal to each other
        return uniqueOccurrences.size() == occurrences.size();
    }

    public boolean optimizedUniqueOccurrences(int[] nums){
        //sort the nums array to order values for count
        Arrays.sort(nums);
        //create new array to count occurrences of each number
        int[] occurrences = new int[nums.length];
        //initialize index at 0
        int index = 0;
        //loop and initialize occurrence count at 1
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            //while neighboring index is within the length of nums
            //and the index value is equal to its neighboring value
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                //increment count
                count++;
                //increment index
                i++;
            }
            //still within loop, add the count to the occurrences array at incrementing index
            occurrences[index++] = count;
        }
        //sort the occurrences array
        Arrays.sort(occurrences);
        //loop thru occurrences array
        for(int j = 1; j < occurrences.length; j++){
            //if the value of the current index is equal to its previous neighbor
            if(occurrences[j] == occurrences[j-1]){
                //return false
                return false;
            }
        }
        //if all neighbors in array are not equal, return true
        return true;
    }
}
