import java.util.Scanner;

public class TicTacToe
{
  
  private static char[][] board = new char[3][3];
  
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    initialBoard();
    displayBoard();
    getInfo();
    
  }
  
  public static void initialBoard()
  {
    // the board is blank
    for ( int r=0; r<3; r++ )
      for ( int c=0; c<3; c++ )
      board[r][c] = ' ';
  }
  
  
  public static void displayBoard()
  {
    System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    System.out.println("    --+-+--");
    System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
    System.out.println("    --+-+--");
    System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    System.out.println("     0 1 2 ");
    System.out.println("--------------------------------------------------------");
  }
  //use scanner for user's desired row/col
  //place their label in that row/col
  
  
  
  public static void getInfo()
  {
    System.out.println("Enter the row (0, 1 or 2)");
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    System.out.println("Enter the column (0, 1 or 2)");
    Scanner input1 = new Scanner(System.in);
    int col = input1.nextInt();
    
    if(board[row][col] != 'X' && board[row][col] != 'O')  
    {
      board[row][col] = 'X';
      
    }
    else 
    {
      System.out.println("Someone already went there! Choose another space!");
      getInfo();
    }
    System.out.println("Your previous move:");
    displayBoard();
    compPlayer();
  }
  public static void compPlayer()
  {
    if(board[1][1] != 'X' && board[1][1] != 'O')  
    {
      board[1][1] = 'O';
      
    }
    else if(board[0][0] != 'X' && board[0][0] != 'O')  
    {
      board[0][0] = 'O';
      
    }
    else if(board[2][2] != 'X' && board[2][2] != 'O')  
    {
      board[2][2] = 'O';
      
    }
    else if(board[0][2] != 'X' && board[0][2] != 'O')  
    {
      board[0][2] = 'O';
      
    }
    else if(board[2][0] != 'X' && board[2][0] != 'O')  
    {
      board[2][0] = 'O';
      
    }
    System.out.println("Computer's previous move:");
    displayBoard();
    checkWin();
    
  }
  public static void checkWin()
  {
    if (board[1][1] == 'X'){
      if (board[0][0] == 'X'){
        if (board[2][2] == 'X'){
          System.out.println("X wins");
          initialBoard();
        }
      }
      else if (board[0][1] == 'X'){
        if (board[2][1] == 'X'){
          System.out.println("X wins");
          initialBoard();
        }
      }
      else if (board[1][0] == 'X'){
        if (board[1][2] == 'X'){
          System.out.println("X wins");
          initialBoard();
        }
      }
      else if (board[2][0] == 'X'){
        if (board[0][2] == 'X'){
          System.out.println("X wins");
          initialBoard();
        }
      }
      
    }
    if (board[0][0] == 'X'){
      if (board[0][1] == 'X'){
        if (board[0][2] == 'X'){
          System.out.println("X wins");
          initialBoard();
        }
      }
      else if (board[1][0] == 'X'){
        if (board[2][0] == 'X'){
          System.out.println("X wins");
          initialBoard();
        }
      }
    }
    if (board[2][2] == 'X'){
      if (board[0][2] == 'X') {
        if(board[1][2] == 'X'){
          System.out.println("X wins");
          initialBoard();
        }
      }
      
      else if (board[2][0] == 'X') {
        if (board[2][1] == 'X') {
          System.out.println("X wins");
          initialBoard();
        }
      }
    }
    
    getInfo();
    
    
  }
}





