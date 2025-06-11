package leet.problems;

public class MaxVowelsInSubstring {
    //method to check if char in string is a vowel
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k){
        //initialize vowel count
        int vowelCount = 0;
        //first loop to initialize window in given string
        for(int i = 0; i < k; ++i){
            //check if char is vowel, increment count if true
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
        }
        //initialize max vowel count with vowelCount
        int maxVowels = vowelCount;
        //second loop to move window along string s
        for(int i = k; i < s.length(); ++i){
            //if char is vowel, increment vowel count
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
            //if char was vowel but not in window anymore, decrement vowelCount
            if(isVowel(s.charAt(i - k))){
                --vowelCount;
            }
            //set maxVowels equal to vowelCount if it is larger
            maxVowels = Math.max(maxVowels, vowelCount);
        }
        //return max number of vowels apparent in window
        return maxVowels;
    }
}
