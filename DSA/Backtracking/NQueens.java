package DSA.Backtracking;

public class NQueens {

    public static void printArr(char board[][]) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------");
    }

    public static boolean isSafe(char board[][], int row, int col) {

            // up
            for(int i = row-1; i >= 0; i--) {
                if(board[i][col] == 'Q')
                    return false;
            }
            // Diagonal Right
            for(int i = row-1, j = col+1; i >=0 && j < board.length; i--, j++) {
                if(board[i][j] == 'Q')
                    return false;
            }
            // Diagonal Left
            for(int i = row-1, j = col-1; i>=0 && j>=0; i-- , j--) {
                if(board[i][j] == 'Q')
                    return false;
            }

            return true;
    }
    public static void findQueens(char board[][], int row) {
        if(row == board.length) {
            printArr(board);
            return;
        }
        for(int i = 0; i < board.length; i++) {
            if(isSafe(board, row, i)) {
                board[row][i] = 'Q';
                findQueens(board, row+1);
                board[row][i] = 'x';
            }
        }
    }
    public static void main(String[] args) {
        int size = 4;
        char board[][] = new char[size][size];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) 
                board[i][j] = 'x';
        }
        findQueens(board, 0);
    }
}
