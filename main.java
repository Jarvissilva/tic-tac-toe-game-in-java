import java.util.Scanner;

public class TicTacToe {
  static String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
  static String currentPlayer = "X";
  static boolean isGameEnded = false;

  static void displayBoard() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println("");
    }
  }

  static void takeInput() {
    System.out.print(currentPlayer + " player turn enter you position: ");
    Scanner myObj = new Scanner(System.in);
    String playerInput = myObj.nextLine();

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j].equals(playerInput)) {
          board[i][j] = currentPlayer;
          if (currentPlayer == "X") {
            currentPlayer = "O";
          } else if (currentPlayer == "O") {
            currentPlayer = "X";
          }
          break;
        }
      }
    }
    displayBoard();
    checkBoard();
  }

  static void checkBoard() {
    for (int i = 0; i < board.length; i++) {
      if (board[i][0] == "X" && board[i][1] == "X" && board[i][2] == "X") {
        System.out.println("X is the winner");
        isGameEnded = true;
      } else if (board[i][0] == "O" && board[i][1] == "O" && board[i][2] == "O") {
        System.out.println("O is the winner");
        isGameEnded = true;
      }
      if (board[0][i] == "X" && board[1][i] == "X" && board[2][i] == "X") {
        System.out.println("X is the winner");
        isGameEnded = true;
      } else if (board[0][i] == "O" && board[1][i] == "O" && board[2][i] == "O") {
        System.out.println("O is the winner");
        isGameEnded = true;
      }

      else if (board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") {
        System.out.println("X is the winner");
        isGameEnded = true;
      } else if (board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O") {
        System.out.println("O is the winner");
        isGameEnded = true;
      } else if (board[0][2] == "X" && board[1][1] == "X" && board[2][0] == "X") {
        System.out.println("X is the winner");
        isGameEnded = true;
      } else if (board[0][2] == "O" && board[1][1] == "O" && board[2][0] == "O") {
        System.out.println("O is the winner");
        isGameEnded = true;
      }
    }
  }

  public static void main(String[] args) {
    displayBoard();

    while (isGameEnded == false) {
      takeInput();
    }
  }
}
