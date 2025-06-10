package leet.problems;

public class ContainerWithMostWater {
    public static int findingAreaInArrayNotOptimal (int[] height){
        //not the most optimal time
        //initialize int to store the max area
        int storeArea = 0;
        //set arrayLength into variable
        int arrayLength = height.length;
        //first loop for the first pointer = left wall of glass
        for (int i = 0; i < arrayLength; i++){
            //second loop for second pointer = right wall of glass
            for (int j = i + 1; j < arrayLength; j++){
                //finding area between minimum height of walls and width between walls
                int findArea = Math.min(height[i], height[j]) * (j - i);
                // the max area value found will be set in storeArea
                storeArea = Math.max(findArea, storeArea);
                }
            }
        // return the max area of the array
        return storeArea;
        }

        public static int optimalFindingAreaInArray(int[] height){
        //initialize left and right pointers
            int left = 0, right = height.length - 1;
            //store the max area of array in variable
            int maxArea = 0;
            //while the left is less than right
            while(left<right) {
                //find area with height and width
                int arrayArea = Math.min(height[left], height[right]) * (right - left);
                //compare calculated array areas and store the largest area
                maxArea = Math.max(arrayArea, maxArea);
                //if the left wall is smaller than the right wall, move left wall up
                if (height[left]<height[right]){
                    left++;
                }//else move right wall down
                right--;
            }
            return maxArea;
        }
    }

