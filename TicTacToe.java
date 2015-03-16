import java.util.Scanner;

public class TicTacToe
{
  
  private static char[][] board = new char[3][3];
  
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    
    initialBoard();
    displayBoard();
    
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
    System.out.println("  1  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    System.out.println("    --+-+--");
    System.out.println("  2  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
    System.out.println("    --+-+--");
    System.out.println("  3  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    System.out.println("     1 2 3 ");
  }
  
  
}



