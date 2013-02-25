
/**
 *
 **/

public class SudokuBoard() {

    /**
     * The integer values for each position of the Board. The array must be of size 9x9, and the integer values
     * must be between 0-9, with 0 representing an unselected or blank value.
     */
    private int [][] matrix;
   
    /**
     * Represents the selected values for each value in each block. The 3x3 blocks are numbered left to right,
     * and top to bottom, starting from the top left block, which is #0. The numbers 0-8, represent the values 
     * 1-9 on the actual board. So if there is already a '6' in the top right block, then blockArray[2][5] will
     * be True.  
     */ 
    private boolean [][] blockArray;

    /**
     * The first index is the row (0-8), the second index is the value (0-8 representing 1-9). So if there 
     *is a '7' in row '1', then rowArray[1][6] evaluates to True
     */
    private boolean [][] rowArray;
     
    /**
     * The first index is the column (0-8), the second index is the value (0-8 representing 1-9). So if there 
     * is a '7' in column '1', then colArray[1][6] evaluates to True
     */
    private boolean [][] colArray;

    
    /**
     * Initialize's a blank board with all 0's.
     */
    public SudokuBoard() {

    }

    /**
     * Initializes the SudokuBoard to the values from the 9x9 array
     */
    public SudokuBoard(int[][] array) {

	// Test if the array is 9x9


    }


    /**
     * Checks if the current board is valid
     */
    public boolean isBoardValid()  {

    }

    /**
     * Checks if the board is valid given this new entry value
     */
    public boolean isBoardValid(int row, int col, int value) {


    }
   
    /**
     * Returns whether or not the current board is solved, meaning it is both valid
     * and completed.
     */
    public boolean isBoardSolved() {


    }

     
}
