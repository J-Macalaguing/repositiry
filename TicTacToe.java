import java.util.Scanner;

public class TicTacToe {
    public static void printBoard(String[][] board) {
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
            System.out.println(" --+---+--");
            System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
            System.out.println(" --+---+--");
            System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
        System.out.println("WELCOME TO TIC TAC TOE!!!");
        System.out.println("HOW TO PLAY:");
        System.out.println("Input the number you would like to place your move.");

        // would be using methods if i knew how :(

        for (int turn = 0; turn < 10; turn++) {
            String player = "X";
            if (turn == 1) {
                player = "O";
            }
            if (turn == 3) {
                player = "O";
            }
            if (turn == 5) {
                player = "O";
            }
            if (turn == 7) {
                player = "O";
            }
            if (turn == 9) {
                System.out.println(" ");
                printBoard(board);
                System.out.println("ITS A tie.");
                break;
            }
            System.out.println(" ");
            System.out.println(player + "'S TURN");
            printBoard(board);

            int move = kb.nextInt();
            if (move == 1) {
                board[0][0] = player;
            }
            if (move == 2) {
                board[0][1] = player;
            }
            if (move == 3) {
                board[0][2] = player;
            }
            if (move == 4) {
                board[1][0] = player;
            }
            if (move == 5) {
                board[1][1] = player;
            }
            if (move == 6) {
                board[1][2] = player;
            }
            if (move == 7) {
                board[2][0] = player;
            }
            if (move == 8) {
                board[2][1] = player;
            }
            if (move == 9) {
                board[2][2] = player;
            }
            // horizontal wins
            if (board[0][0] == player && board[0][1] == player && board[0][2] == player) {
                System.out.println(" ");
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
            if (board[1][0] == player && board[1][1] == player && board[1][2] == player) {
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
            if (board[2][0] == player && board[2][1] == player && board[2][2] == player) {
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
            // vertical wins
            if (board[0][0] == player && board[1][0] == player && board[2][0] == player) {
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
            if (board[0][1] == player && board[1][1] == player && board[2][1] == player) {
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
            if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
            // diagonal wins
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                printBoard(board);
                System.out.println(player + " WINS!!!");
                break;
            }
        }
    }
}