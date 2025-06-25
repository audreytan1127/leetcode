package leet.problems;

import java.util.Stack;

public class DecodeString {
    public String decodingString(String s){
        //initialize stack to hold numerical values
        Stack<Integer> count = new Stack<>();
        //initialize stack stringbuilder to hold chars from original string
        Stack<StringBuilder> stringResults = new Stack<>();
        //initialize string builder to create new string from original digits and chars
        StringBuilder newString = new StringBuilder();
        //int type to hold numerical values from original string
        int num = 0;
        //loop thru each char in s converted to char array
        for(char c : s.toCharArray()){
            //if the c is a digit
            if(Character.isDigit(c)){
                //set num to digit while ensuring decimals are not apparent with *10
                //and set to int type by subtracting '0'
                num = num * 10 + (c - '0');
                //else if c is '['
            } else if (c == '['){
                //push num into count stack
                count.push(num);
                //reset num to 0
                num = 0;
                //push the new string into string results stack
                stringResults.push(newString);
                //reset newString to empty string builder
                newString = new StringBuilder();
                //else if c is ']'
            } else if(c == ']'){
                //initialize an int set to the last value in count stack, while also removing value from stack
                int set = count.pop();
                //initialize new string builder temp to newString which holds the chars within brackets
                StringBuilder temp = newString;
                //set newString equal to the stringResults last values while removing values from stack
                newString = stringResults.pop();
                //while the set is iterating down to 0
                while(set-- > 0) {
                    //keep appending the temp to newString
                    newString.append(temp);
                }
                //else append the char in s to newString
            } else {
                newString.append(c);
            }
        }
        //return the newString as string type
        return newString.toString();
    }
}
