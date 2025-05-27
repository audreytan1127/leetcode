package leet.problems;

public class GCDOfStrings {
    public String gcdOfStrings (String string1, String string2){
        if(!(string1+string2).equals(string2+string1)){
            return "";
        }
        int length = gcd(string1.length(), string2.length());
        return string1.substring(0, length);
    }

    public int gcd (int a, int b){
        return b==0 ? a : gcd (b, a%b);
    }
}
