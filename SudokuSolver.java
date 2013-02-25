import java.util.*;

public class SudokuSolver {
    private SudokuBoard board;

    
    /**
     * 
     */
    public SudokuSolver() {

    }

    /**
     * Initializes a SudokuSolver, including the SudokuBoard
     */
    public SudokuSolver(int[][] array) {
	
	// Test if Array is 9x9


	board = new SudokuBoard(array); 


    }

    /**
     * Attempts to solve the Sudoku Puzzle and returns True if successful, and False if not. 
     * Starts the loop that begins processing and solving the board. 
     * 
     *
     * @return the boolean value representing if the puzzle was successfully solved
     */
    public boolean solve() {


    }


    /**
     * Brute Force Method of Solving
     */
    public boolean selectNumber(int row, int col) {


    }


    /**
     * Tests the functionality of SudokuSolver
     */
    public static void main(String [] args) {


    }

}
