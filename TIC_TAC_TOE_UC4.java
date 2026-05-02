public class TIC_TAC_TOE_UC4 {

    public static void main(String[] args) {

        int slot = 5; // example input

        int[] position = convertSlotToIndex(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }

    // Method to convert slot (1-9) to row & column
    static int[] convertSlotToIndex(int slot) {

        int index = slot - 1;   // convert to 0-based

        int row = index / 3;    // division
        int col = index % 3;    // modulo

        return new int[]{row, col};
    }
}