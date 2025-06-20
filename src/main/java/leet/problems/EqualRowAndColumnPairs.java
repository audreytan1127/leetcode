package leet.problems;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid){
        //variable to store the length of the grid
        int gridLength = grid.length;
        //initialize new array of arrays to hold column values
        int[][] columns = new int[gridLength][gridLength];
        //for loop to iterate thru row values
        for(int i = 0; i < gridLength; ++i){
            //second for loop to add values to columns array of arrays
            for(int j = 0; j < gridLength; ++j){
                columns[j][i] = grid[i][j];
            }
        }
        //initialize count for equal row and column pairs
        int equalPairs = 0;
            //for each row in the grid
            for (var row : grid) {
                //and for each column of the columns
                for (var column : columns) {
                    //initialize count for the equal values in row and column
                    int count = 1;
                    //for loop to compare the row and column values
                    for(int i = 0; i < gridLength; ++i) {
                    //if the two values in the row and column are not the same
                    if (row[i] != column[i]){
                        //set the count to 0 to not increment the equal pair count
                        count = 0;
                        //break the loop
                        break;
                    }
                }
                    //add each equal row/column pairs to the equalPairs count
                    equalPairs += count;
            }
        }
            //return the count of equal pairs
        return equalPairs;
    }

    public int optimizedHashMapEqualPairs(int[][] grid){
        //initialize variables for equalPairs, index, and row counter
        int equalPairs = 0;
        int index = 0;
        int row = 0;
        //while the index is within the grid length
        while(index<= grid.length -1){
            //create a new hash map for column values
            HashMap<Integer, Integer> columns = new HashMap<>();
            //for loop to add values from grid row to columns
            for(int i = 0; i < grid.length; i++){
                //put value from grid at each row at index into columns map
                columns.put(i, grid[row][i]);
            }
            //for loop to initialize pointer in row
            for(int j = 0; j < grid.length; j++){
                //initialize pointer that resets to 0 if values from row/column are not equal
                int pointer = 1;
                //nested for loop to initialize pointer in column and compare values
                for(int k = 0; k < grid.length; k++){
                    //if the values are not equal reset pointer to 0
                    if(columns.get(k) != grid[k][j]){
                        pointer = 0;
                        //and break loop
                        break;
                    }
                }
                //if the row/column values are equal increment equalPair with pointer
                equalPairs += pointer;
            }
            //increment up the row when done comparing
            row++;
            //increment up the index going thru column
            index++;
        }
        //return the number of equalPairs
        return equalPairs;
    }
}
