package leet.problems;

public class ReverseWordsInAString {
    public String reverseWords(String s){
        StringBuilder reverseS = new StringBuilder();
        String[] wordsOfS = s.split(" ");
        for(int i = wordsOfS.length-1; i>=0; i--){
            reverseS.append(wordsOfS[i] + " ");

        }
        return reverseS.toString().trim().replaceAll(" +", " ");
        }
    }

    public String reverseWordsBetterRuntime(String s) {
    String[] stringSep = s.trim().split("\\s+");
    String reversedString = "";
    int i = 0, j=stringSep.length -1;
    while (i<j){
        String store = stringSep[i];
        stringSep[i]= stringSep[j];
        stringSep[j]= store;
        i++;
        j--;
    }
return String.join(" ",stringSep);

}
