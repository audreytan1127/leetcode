package leet.problems;

import java.util.ArrayList;
import java.util.Stack;

public class RemovingStarsFromAString {
    public String removeStars(String s){
        //initialize string builder for remaining characters that are not deleted
        StringBuilder ogString = new StringBuilder();
        //iterate thru s
        for(int i = 0; i < s.length(); ++i){
            //if the char is a star
            if (s.charAt(i)=='*'){
                //and if there are chars stored before the star
                if(ogString.length() > 0){
                    //remove the preceding char and star
                    ogString.deleteCharAt(ogString.length() - 1);
                }
            } else {
                //if it is not a star then add char to string
                ogString.append(s.charAt(i));
            }
        }
        //return the string with removed chars and stars
        return ogString.toString();
    }
}
