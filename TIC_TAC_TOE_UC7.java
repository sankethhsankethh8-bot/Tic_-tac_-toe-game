import java.util.Random;

public class TIC_TAC_TOE_UC7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        char computerSymbol = 'O';

        computerMove(computerSymbol);

        displayBoard();
    }

    // UC7: Computer makes random valid move
    static void computerMove(char symbol) {

        Random rand = new Random();
        int row, col;

        // Loop until a valid move is found
        while (true) {

            int slot = rand.nextInt(9) + 1; // 1–9

            int[] pos = convertSlotToIndex(slot);
            row = pos[0];
            col = pos[1];

            if (isValidMove(row, col)) {
                placeMove(row, col, symbol);
                break;
            }
        }
    }

    // Convert slot (1–9) → row, col
    static int[] convertSlotToIndex(int slot) {
        int index = slot - 1;
        int row = index / 3;
        int col = index % 3;
        return new int[]{row, col};
    }

    // Validate move (UC5 logic reused)
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == '-';
    }

    // Place move (UC6 reused)
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Display board
    static void displayBoard() {
        System.out.println("Board after computer move:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}