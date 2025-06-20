package leet.problems;

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
}
