import java.util.Scanner;

public class TicTacToe
{
  
  private static char[][] board = new char[3][3];
  
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);
    
    //welcome message
    System.out.println("Welcome! You'll play as X's");
    initialBoard();
     displayBoard();
    
    
  }
  
  
  
  public static void initialBoard()
  {
    // the board is blank
    for ( int r=0; r<3; r++ ){
      for ( int c=0; c<3; c++ )
    {
      board[r][c] = ' ';
    }
    }
    determineStarter();
  }
  
  public static void determineStarter() //random first player
  {
    int randomNum = (int)(Math.random()*10);
    if (randomNum > 5)
    {
      System.out.println("You go first");
      getInfo();
    }
    else 
    {
      System.out.println("The computer will go first");
      compPlayer();
    }
  }
  
  
  public static void displayBoard()
  {
    System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    System.out.println("    --+-+--");
    System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
    System.out.println("    --+-+--");
    System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    System.out.println("     0 1 2 ");
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
    else //if space is already taken
    {
      System.out.println("Someone already went there! Choose another space!");
      getInfo();
    }
    System.out.println("Your previous move:");
    displayBoard();
    checkXWin();
   
  }
 
  public static void compPlayer()
  {
    //ideal first move (middle)
    if(board[1][1] != 'X' && board[1][1] != 'O')  
    {
      board[1][1] = 'O';
    }
    //Wins
    else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] != 'X')
      board[0][2] = 'O';
    else if(board[0][0] == 'O' && board[0][2] == 'O' && board[0][1] != 'X')
      board[0][1] = 'O';
    else if(board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] != 'X')
      board[0][0] = 'O';
    
    else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] != 'X')
      board[1][2] = 'O';
    else if(board[1][0] == 'O' && board[1][2] == 'O' && board[1][1] != 'X')
      board[1][1] = 'O';
    else if(board[1][1] == 'O' && board[1][2] == 'O' && board[1][0] != 'X')
      board[1][0] = 'O';
    
    else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] != 'X')
      board[2][2] = 'O';
    else if(board[2][0] == 'O' && board[2][2] == 'O' && board[2][1] != 'X')
      board[2][1] = 'O';
    else if(board[2][1] == 'O' && board[2][2] == 'O' && board[2][0] != 'X')
      board[2][0] = 'O';
    
    else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] != 'X')
      board[2][2] = 'O';
    else if(board[2][2] == 'O' && board[0][0] == 'O' && board[1][1] != 'X')
      board[1][1] = 'O';
    else if(board[1][1] == 'O' && board[2][2] == 'O' && board[0][0] != 'X')
      board[0][0] = 'O';
    
    else if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] != 'X')
      board[0][2] = 'O';
    else if(board[2][0] == 'O' && board[0][2] == 'O' && board[1][1] != 'X')
      board[1][1] = 'O';
    else if(board[1][1] == 'O' && board[0][2] == 'O' && board[2][0] != 'X')
      board[2][0] = 'O';
    
    else if(board[2][0] == 'O' && board[1][0] == 'O' && board[0][0] != 'X')
      board[0][0] = 'O';
    else if(board[2][0] == 'O' && board[0][0] == 'O' && board[1][0] != 'X')
      board[1][0] = 'O';
    else if(board[1][0] == 'O' && board[0][0] == 'O' && board[2][0] != 'X')
      board[2][0] = 'O';
    
    else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] != 'X')
      board[2][1] = 'O';
    else if(board[1][1] == 'O' && board[2][1] == 'O' && board[0][1] != 'X')
      board[0][1] = 'O';
    else if(board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] != 'X')
      board[1][1] = 'O';
    
    else if(board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] != 'X')
      board[1][2] = 'O';
    else if(board[2][2] == 'O' && board[1][2] == 'O' && board[0][2] != 'X')
      board[0][2] = 'O';
    else if(board[1][2] == 'O' && board[0][2] == 'O' && board[2][2] != 'X')
      board[2][2] = 'O';
    ////BLOCKS
    else if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] != 'O')
      board[0][2] = 'O';
    else if(board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] != 'O')
      board[0][1] = 'O';
    else if(board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] != 'O')
      board[0][0] = 'O';
    
    else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] != 'O')
      board[1][2] = 'O';
    else if(board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] != 'O')
      board[1][1] = 'O';
    else if(board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] != 'O')
      board[1][0] = 'O';
    
    else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] != 'O')
      board[2][2] = 'O';
    else if(board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] != 'O')
      board[2][1] = 'O';
    else if(board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] != 'O')
      board[2][0] = 'O';
    
    else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] != 'O')
      board[2][2] = 'O';
    else if(board[2][2] == 'X' && board[0][0] == 'X' && board[1][1] != 'O')
      board[1][1] = 'O';
    else if(board[1][1] == 'X' && board[2][2] == 'X' && board[0][0] != 'O')
      board[0][0] = 'O';
    
    else if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] != 'O')
      board[0][2] = 'O';
    else if(board[2][0] == 'X' && board[0][2] == 'X' && board[1][1] != 'O')
      board[1][1] = 'O';
    else if(board[1][1] == 'X' && board[0][2] == 'X' && board[2][0] != 'O')
      board[2][0] = 'O';
    
    else if(board[2][1] == 'X' && board[1][1] == 'X' && board[0][1] != 'O')
      board[0][1] = 'O';
    else if(board[2][1] == 'X' && board[0][1] == 'X' && board[1][1] != 'O')
      board[1][1] = 'O';
    else if(board[1][1] == 'X' && board[0][1] == 'X' && board[2][1] != 'O')
      board[2][1] = 'O';
    
    else if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] != 'O')
      board[2][0] = 'O';
    else if(board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] != 'O')
      board[0][0] = 'O';
    else if(board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] != 'O')
      board[1][0] = 'O';
    
    else if(board[2][2] == 'X' && board[1][2] == 'X' && board[0][2] != 'O')
      board[0][2] = 'O';
    else if(board[2][2] == 'X' && board[0][2] == 'X' && board[1][2] != 'O')
      board[1][2] = 'O';
    else if(board[1][2] == 'X' && board[0][2] == 'X' && board[2][2] != 'O')
      board[2][2] = 'O';
    //Strategic moves
    else if(board[1][1] == 'O' && board[0][0] == 'O')
    {
      if(board[0][2] != 'O' && board[0][2] != 'X')
        board[0][2] = 'O';
      else if(board[2][0] != 'O' && board[2][0] != 'X')
        board[2][0] = 'O';
    }
    else if(board[1][1] == 'O' && board[2][0] == 'O')
    {
      if(board[0][0] != 'O' && board[0][0] != 'X')
        board[0][0] = 'O';
      else if(board[2][2] != 'O' && board[2][2] != 'X')
        board[2][2] = 'O';
    }
    else if(board[1][1] == 'O' && board[2][2] == 'O')
    {
      if(board[2][0] != 'O' && board[2][0] != 'X')
        board[2][0] = 'O';
      else if(board[0][2] != 'O' && board[0][2] != 'X')
        board[0][2] = 'O';
    }
    else if(board[1][1] == 'O' && board[0][2] == 'O')
    {
      if(board[0][0] != 'O' && board[0][0] != 'X')
        board[0][0] = 'O';
      else if(board[2][2] != 'O' && board[2][2] != 'X')
        board[2][2] = 'O';
    }
    
    //random moves
    else if(board[0][0] != 'X' && board[0][0] != 'O')  
    {
      board[0][0] = 'O';
    }
    else if(board[2][0] != 'X' && board[2][0] != 'O')  
    {
      board[2][0] = 'O';
    }
    else if(board[0][2] != 'X' && board[0][2] != 'O')  
    {
      board[0][2] = 'O';
    }
    else if(board[2][2] != 'X' && board[2][2] != 'O')  
    {
      board[2][2] = 'O';
    }
    else if(board[0][1] != 'X' && board[0][1] != 'O')  
    {
      board[0][1] = 'O';
    }
    else if(board[1][0] != 'X' && board[1][0] != 'O')  
    {
      board[1][0] = 'O';
    }
    else if(board[2][1] != 'X' && board[2][1] != 'O')  
    {
      board[2][1] = 'O';
    }
    else if(board[1][2] != 'X' && board[1][2] != 'O')  
    {
      board[1][2] = 'O';
    }
    System.out.println("Computer's previous move:");
    displayBoard();
    checkOWin();
  }
  
  
  
  public static void checkXWin() //check for three X's in a row/col/diagonal
  {
    if (board[1][1] == 'X'){
      if (board[0][0] == 'X'){
        if (board[2][2] == 'X'){
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
      else if (board[0][1] == 'X'){
        if (board[2][1] == 'X'){
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
      else if (board[1][0] == 'X'){
        if (board[1][2] == 'X'){
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
      else if (board[2][0] == 'X'){
        if (board[0][2] == 'X'){
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
      
    }
    else if (board[0][0] == 'X'){
      if (board[0][1] == 'X'){
        if (board[0][2] == 'X'){
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
      else if (board[1][0] == 'X'){
        if (board[2][0] == 'X'){
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
    }
    else if (board[2][2] == 'X'){
      if (board[0][2] == 'X') {
        if(board[1][2] == 'X'){
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
      
      else if (board[2][0] == 'X') {
        if (board[2][1] == 'X') {
          System.out.println("YOU WIN! New Game:");
          initialBoard();
        }
      }
    }
    
    compPlayer();
    
    
  }
  public static void checkOWin() //check for three O's in a row/col/diagonal
  {
    if (board[1][1] == 'O'){
      if (board[0][0] == 'O'){
        if (board[2][2] == 'O'){
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
          
        }
      }
      else if (board[0][1] == 'O'){
        if (board[2][1] == 'O'){
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
          
        }
      }
      else if (board[1][0] == 'O'){
        if (board[1][2] == 'O'){
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
          
        }
      }
      else if (board[2][0] == 'O'){
        if (board[0][2] == 'O'){
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
          
        }
      }
      
    }
    else if (board[0][0] == 'O'){
      if (board[0][1] == 'O'){
        if (board[0][2] == 'O'){
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
          
        }
      }
      else if (board[1][0] == 'O'){
        if (board[2][0] == 'O'){
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
          
        }
      }
    }
    else if (board[2][2] == 'O'){
      if (board[0][2] == 'O') {
        if(board[1][2] == 'O'){
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
          
        }
      }
      
      else if (board[2][0] == 'O') {
        if (board[2][1] == 'O') {
          System.out.println("THE COMPUTER WINS! New Game:");
          initialBoard();
         
        }
      }
    }
    
    checkTie();
    
    
  }
  public static void checkTie() //check for a full board
  {
    int temp;
    int temp2;
    int count = 0;
    for (temp = 0; temp <= 2; temp++)
    {
      for (temp2 = 0; temp2 <= 2; temp2++)
      {
        if (board[temp][temp2] == 'X' || board[temp][temp2] == 'O'){
          count++;
        }
      }
    }
    if (count == 9)
    {
      System.out.println("IT'S A TIE! New game: ");
      initialBoard();
      
    }
    else getInfo();
  }
  
  
  
} 






