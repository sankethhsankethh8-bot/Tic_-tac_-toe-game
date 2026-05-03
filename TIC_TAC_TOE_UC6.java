public class TIC_TAC_TOE_UC6 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;          // example position
        int col = 1;
        char symbol = 'X';    // player symbol

        placeMove(row, col, symbol);

        displayBoard();
    }

    // UC6: Place symbol on board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Utility to display board
    static void displayBoard() {
        System.out.println("Board after move:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}