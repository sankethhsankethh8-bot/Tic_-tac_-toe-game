public class TIC_TAC_TOE_UC5 {

    static char[][] board = {
        {'X', '-', '-'},
        {'-', 'O', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;  // example
        int col = 1;  // example

        if (isValidMove(row, col)) {
            System.out.println("Move accepted");
        } else {
            System.out.println("Invalid move");
        }
    }

    // Method to validate move
    static boolean isValidMove(int row, int col) {

        // Check bounds (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}