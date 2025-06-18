package leet.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {
    //as long as the letter exists in the string and the string is the same length it is considered close
    //example abc and bca are close = transformed string
    //example acbba and bcaab are close = representations changed
    //example acc and a are NOT close because not transformed and representations did not change
    public boolean twoStringsClose(String str1, String str2){
        //if the length of str2 is not the same as str1 return false
        if(str1.length() != str2.length()){
        return false;
        }
        //initialize the int[] frequency array to the length of the alphabet
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        //for char in word to char array, starting at a in the alphabet, count thru word and increment if found
        for (int i = 0; i < str1.length(); ++i){
            freq1[str1.charAt(i)-'a']++;
        }
        for(int i = 0; i < str2.length(); ++i){
            freq2[str2.charAt(i)-'a']++;
        }
        //loop thru freq arrays
        for(int i = 0; i < 26; ++i){
            //if there is a value in freq1 not in freq2, or vice versa, return false
            if((freq1[i] > 0 && freq2[i]==0) || freq2[i] > 0 && freq1[i]==0){
                return false;
            }
        }
        //sort arrays
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        //loop thru sorted arrays and if there is not a match in freq at i, return false
        for(int i = 0; i < 26; ++i){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        //if the freq arrays pass validations, return true
        return true;
    }
}

