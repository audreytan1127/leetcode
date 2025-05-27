package leet.problems;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newString = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        for (int i = 0; i < word1Length || i < word2Length; ++i) {
            if (i < word1Length) {
                newString.append(word1.charAt(i));
            }
            if (i < word2Length) {
                newString.append(word2.charAt(i));
            }
        }
        return newString.toString();
    }
}
