import java.util.*;
public class tictactoe {
    private Scanner scan = new Scanner(System.in);
    private char[][] board = new char[3][3];
    private int chances = 9, row, col;
    private char letter;
    private int won=0;
    private int placeChar(char letter, int row, int col) {
        if(board[row][col]=='_'){
         board[row][col]=letter;
         return 1;
        }else
        return 0;
    }
    private void readInput(){
     System.out.println("Enter the letter,row and column");
     letter=scan.next().charAt(0);
     row=scan.nextInt();
     col=scan.nextInt();
    }
    private void displayBoard() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    private void check(char letter,int row,int col){
      if(row==0&&col==0){
        if((board[0][0]==letter&&board[0][1]==letter&&board[0][2]==letter)||
        (board[0][0]==letter&&board[1][0]==letter&&board[2][0]==letter)||
        (board[0][0]==letter&&board[1][1]==letter&&board[2][2]==letter))
        won++;
      }else if(row==1&&col==0){
        if((board[1][0]==letter&&board[0][0]==letter&&board[2][0]==letter)||
        (board[1][0]==letter&&board[1][1]==letter&&board[1][2]==letter))
        won++;
      }else if(row==2&&col==0){
        if((board[2][0]==letter&&board[1][1]==letter&&board[0][2]==letter)||
        (board[2][0]==letter&&board[2][1]==letter&&board[2][2]==letter)||
        (board[2][0]==letter&&board[1][0]==letter&&board[0][0]==letter))
        won++;
      }else if(row==2&&col==1){
        if((board[2][1]==letter&&board[2][0]==letter&&board[2][2]==letter)||
        (board[2][1]==letter&&board[1][1]==letter&&board[0][1]==letter))
        won++;
      }else if(row==2&&col==2){
        if((board[2][2]==letter&&board[2][0]==letter&&board[2][1]==letter)||
        (board[2][2]==letter&&board[1][2]==letter&&board[0][2]==letter)||
        (board[2][2]==letter&&board[1][1]==letter&&board[0][0]==letter))
        won++;
      }else if(row==1&&col==2){
        if((board[1][2]==letter&&board[0][2]==letter&&board[2][2]==letter)||
        (board[1][2]==letter&&board[1][0]==letter&&board[1][1]==letter))
        won++;
      }else if(row==0&&col==1){
        if((board[0][1]==letter&&board[0][0]==letter&&board[0][2]==letter)||
        (board[0][1]==letter&&board[1][1]==letter&&board[2][1]==letter))
        won++;
      }else if(row==0&&col==2){
        if((board[0][2]==letter&&board[2][0]==letter&&board[1][1]==letter)||
        (board[0][2]==letter&&board[1][2]==letter&&board[2][2]==letter)||
        (board[0][2]==letter&&board[0][0]==letter&&board[0][1]==letter))
        won++;
      }else if(row==1&&col==1){
        if((board[1][1]==letter&&board[0][1]==letter&&board[2][1]==letter)||
        (board[1][1]==letter&&board[1][0]==letter&&board[1][2]==letter)||
        (board[1][1]==letter&&board[2][0]==letter&&board[0][2]==letter)||
        (board[1][1]==letter&&board[0][0]==letter&&board[2][2]==letter))
        won++;
      }
}
    public void run() {
        for(char[] row:board){
            Arrays.fill(row,'_');
        }
        while(chances>0){
          if(chances%2==0){
            System.out.println("its x turn");
          }
          else{
            System.out.println("its o turn");
          }
            readInput();
        int place=placeChar(letter, row, col);
        displayBoard();
        check(letter, row, col);
        if(won==1&&chances%2==0){
            System.out.println("x won the game");
            break;
        }else if(won==1&&chances%2!=0){
          System.out.println("o won the game");
          break;
        }
        if(place==1){
        chances--;
        }else{
          System.out.println("This place is already filled");
        }
        }
        if(won==0&&chances==0)
        System.out.println("!!! Game Over !!!");
    }
}