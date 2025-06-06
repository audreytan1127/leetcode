package leet.problems;

public class IsSubsequence {
    public static boolean subsequentString(String s, String t){
        //store the length of both strings to call easily
        int sLength = s.length(), tLength = t.length();
        //set the index of both strings at 0
        int sPointer = 0, tPointer = 0;
        //loop thru the strings
        while(sPointer < sLength && tPointer < tLength){
            //if the characters are the same at the pointer
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                //the pointer at s can move up
                ++sPointer;
            }
            //then the pointer for t moves up
            tPointer++;
        }
        //if the sPointer is same value as sLength, then string is subsequent
        return sPointer == sLength;
    }
}
