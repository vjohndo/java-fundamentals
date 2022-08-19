public class TicTacToe {
    private String[][] myBoard = generateBoard();

    private static String[][] generateBoard() {
        String[][] ticTacToe = new String[3][3];
        ticTacToe[0][0] = "O";
        ticTacToe[0][1] = "X";
        ticTacToe[0][2] = "X";
        ticTacToe[1][0] = "X";
        ticTacToe[1][1] = "O";
        ticTacToe[1][2] = "O";
        ticTacToe[2][0] = "X";
        ticTacToe[2][1] = "O";
        ticTacToe[2][2] = "O";
        return ticTacToe;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        System.out.println(ticTacToe.myBoard[2][2]);

        // Better solution below;
        char[][] ticTacToeBoard = { {'O','O','O'}, {'O','O','O'}, {'O','O','O'} };

    }
}
