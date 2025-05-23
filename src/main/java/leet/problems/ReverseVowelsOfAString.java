package leet.problems;

import java.util.ArrayList;

public class ReverseVowelsOfAString {
//Function to check if a character is a vowel or not

    public Boolean isVowel(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'|| c=='a' || c=='e'|| c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }


    public String reverseVowels(String s) {
        char[] stringToChar = s.toCharArray();
    int left = 0, right = s.length() -1;
    while (left<right){

        while (left<right && !isVowel(stringToChar[left])){
            left++;
        }
        while(left<right && !isVowel(stringToChar[right])){
            right--;
        }
        char store = stringToChar[left];
        stringToChar[left] = stringToChar[right];
        stringToChar[right] = store;
        left++;
        right--;
    }
    return new String(stringToChar);
    }

}
