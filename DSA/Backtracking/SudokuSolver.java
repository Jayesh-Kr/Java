package DSA.Backtracking;

public class SudokuSolver {


    public static void printBoard(int board[][]) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean isSafe(int board[][], int row, int col, int digit) {
        // check row
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == digit)
                return false;
        }

        // check col
        for(int i =0; i < board.length; i++) {
            if(board[i][col] == digit)
                return false;
        }

        // check 3x3 grid
        int g_row = (row/3)*3;
        // int g_row = (row - (row%3));
        int g_col = (col/3)*3;
        // int g_col = (col - (col%3));

        for(int i = g_row; i < g_row+3; i++) {
            for(int j = g_col; j < g_col+3; j++) {
                if(board[i][j] == digit)
                    return false;
            }
        }

        return true;
    }
    public static boolean sudokuSolver(int board[][], int row, int col) {
        if(row == board.length) {
            return true;
        }

        int nextRow = row , nextCol = col + 1;
        if(nextCol == board.length) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(board[row][col] != 0) {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for(int i = 1; i <=9; i++) {
            if(isSafe(board,row,col,i)) {
                board[row][col] = i;
                if(sudokuSolver(board, nextRow, nextCol))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int sudokuBoard[][] = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        sudokuSolver(sudokuBoard,0,0);
        printBoard(sudokuBoard);
    }
}
