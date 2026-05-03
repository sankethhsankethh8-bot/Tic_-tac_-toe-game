import java.util.Random;
import java.util.Scanner;

public class TIC_TAC_TOE_UC8 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static char humanSymbol = 'X';
    static char computerSymbol = 'O';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            displayBoard();

            if (isHumanTurn) {
                System.out.print("Enter slot (1-9): ");
                int slot = sc.nextInt();

                int[] pos = convertSlotToIndex(slot);

                if (isValidMove(pos[0], pos[1])) {
                    placeMove(pos[0], pos[1], humanSymbol);
                    isHumanTurn = false; // switch turn
                } else {
                    System.out.println("Invalid move, try again.");
                    continue;
                }

            } else {
                computerMove(computerSymbol);
                isHumanTurn = true; // switch turn
            }

            // Check win
            if (checkWin(humanSymbol)) {
                displayBoard();
                System.out.println("Human wins!");
                break;
            }

            if (checkWin(computerSymbol)) {
                displayBoard();
                System.out.println("Computer wins!");
                break;
            }

            // Check draw
            if (isBoardFull()) {
                displayBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    // ---------------- UC4 ----------------
    static int[] convertSlotToIndex(int slot) {
        int index = slot - 1;
        return new int[]{index / 3, index % 3};
    }

    // ---------------- UC5 ----------------
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    // ---------------- UC6 ----------------
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // ---------------- UC7 ----------------
    static void computerMove(char symbol) {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = convertSlotToIndex(slot);

            if (isValidMove(pos[0], pos[1])) {
                placeMove(pos[0], pos[1], symbol);
                break;
            }
        }
    }

    // ---------------- Win Check ----------------
    static boolean checkWin(char symbol) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    // ---------------- Draw Check ----------------
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // ---------------- Display ----------------
    static void displayBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}