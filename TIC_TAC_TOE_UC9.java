public class TIC_TAC_TOE_UC9 {

    static char[][] board = {
        {'X', 'X', 'X'},
        {'-', 'O', '-'},
        {'-', '-', 'O'}
    };

    public static void main(String[] args) {

        char symbol = 'X';

        if (checkWin(symbol)) {
            System.out.println(symbol + " has won the game!");
        } else {
            System.out.println("No winner yet.");
        }
    }

    // UC9: Check win condition
    static boolean checkWin(char symbol) {

        // Check rows and columns
        for (int i = 0; i < 3; i++) {

            // Row check
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }

            // Column check
            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        // Diagonal checks
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }
}