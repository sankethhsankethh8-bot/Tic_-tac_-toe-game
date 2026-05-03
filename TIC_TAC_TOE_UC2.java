public class TIC_TAC_TOE_UC2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {
        if (Math.random() < 0.5) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss!");
            System.out.println("Human plays first with symbol: " + humanSymbol);
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first with symbol: " + computerSymbol);
        }
    }
}