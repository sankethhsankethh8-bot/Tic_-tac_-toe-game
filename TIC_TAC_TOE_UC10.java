public class TIC_TAC_TOE_UC10 {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'X', 'O', 'O'},
        {'O', 'X', 'X'}
    };

    public static void main(String[] args) {

        if (isDraw()) {
            System.out.println("Game is a draw!");
        } else {
            System.out.println("Game is not a draw.");
        }
    }

    // UC10: Check draw condition
    static boolean isDraw() {

        // Traverse entire board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any cell is empty, not a draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells found → draw
        return true;
    }
}