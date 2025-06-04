package leet.problems;

public class StringCompression {
    public static int stringCompress(char[] chars){
        //instantiate two pointers
        int i = 0, j = 0;
        //while the i is less than chars length
        while (i<chars.length){
            //instantiate count
            int count = 0;
            //instantiate char store
            char currentChar = chars[i];
            //while i is still less than chars length
            //and currentChar is the value at i of chars array
            while(i<chars.length && chars[i]==currentChar){
                //the count goes up 1
                //the index goes up 1
                count++;
                i++;
            }
            //the current char will be added to chars array if only 1 is present
            chars[j++] = currentChar;
            //for each char that has more than 1, convert to char to be added to array
            for(char c : String.valueOf(count).toCharArray()){
                //iterate and add char to chars array
                chars[i++] = c;
            }
        }
        //return the index that new chars array ends at
        return j;
    }
}
