package leet.problems;

import java.util.ArrayList;
import java.util.List;

public class KidWithMostCandy {
    public List<Boolean> kidWithCandies(int[] candies, int extraCandies) {
            int maxCandies = 0;
            List<Boolean> results = new ArrayList<>(candies.length);
           for (int candy : candies){
              maxCandies = Math.max(candy, maxCandies);
               }
           for(int candy : candies){
               if (candy + extraCandies >= maxCandies){
                   results.add(true);
               } else {
                   results.add(false);
               }
            }
            return results;
    }

}
