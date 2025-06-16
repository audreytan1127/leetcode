package leet.problems;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gains){
        //initialize current altitude pointer
        int currentAlt = 0;
        //initialize max altitude pointer
        int maxAlt = 0;
        //for each altitude in gains array
        for (int alt : gains){
            //the current alt is the sum of previous alts with current alt
            currentAlt += alt;
            //set max alt value to variable
            maxAlt = Math.max(maxAlt, currentAlt);
        }
        //return the max altitude
        return maxAlt;
    }
}
