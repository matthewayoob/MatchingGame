import java.util.Scanner;

 /*
    Creator: Matthew Ayoob
    The Main class integrates all of the other classes for a functional and interactive encryption.
  */
class Main {
  public static void main(String[] args) {
  
int row2 = 0;
int col1 = 0;
int row1 = 0;
int col2 = 0;
 String[] Players = new String[2];
 Scanner p1 = new Scanner(System.in);
 System.out.println(" What's your name player one?");
 String ans1 = p1.nextLine();
 Scanner p2 = new Scanner(System.in);
 System.out.println(" What's your name player two?");
 String ans2 = p2.nextLine();
Players[0] = ans1;
Players[1] = ans2;
 int[] Scores = new int[2];
 GameBoard gb = new GameBoard(3,4);
 System.out.println(gb.display(0,0,1,1));
 Deck dee = new Deck();
 dee.addCard(new Card(0,2));
 dee.addCard(new Card(1,2));
 dee.addCard(new Card(0,3));
 dee.addCard(new Card(1,3));
 dee.addCard(new Card(1,4));
 dee.addCard(new Card(2,4));
 dee.addCard(new Card(3,5));
 dee.addCard(new Card(1,5));
 dee.addCard(new Card(0,6));
 dee.addCard(new Card(1,6));
 dee.addCard(new Card(3,7));
 dee.addCard(new Card(1,7));
 gb.setToken(0,0,dee.toString());

 for ( int r = 0 ; r < 3; r++)
 {
   for ( int c = 0 ; c < 4; c++)
   {
     Card co = dee.dealCard();
    String t = "" + co.getValue();
    gb.setToken(r,c,t);
   }
 }
 System.out.println(gb.display(true));
 int CurrentPlayer = 0;

  Scores[0] = 0;
 Scores[1] = 0;

 while(gb.countTokens() > 0)
 {
   System.out.println(gb.display());
 System.out.println(Players[CurrentPlayer%2] + ", What row");
 ans1 = p1.nextLine();
 row1 = Integer.parseInt(ans1);
  System.out.println(Players[CurrentPlayer%2] + ", What column?");
 ans2 = p1.nextLine();
 col1 = Integer.parseInt(ans2);
   System.out.println(gb.display(row1,col1));
  System.out.println(Players[CurrentPlayer%2] + ", What row");
  ans1 = p1.nextLine();
  row2 = Integer.parseInt(ans1);
  System.out.println(Players[CurrentPlayer%2] + ", What column?");
 String ans3 = p1.nextLine();
 col2 = Integer.parseInt(ans3);
 System.out.println(gb.display(row1, col1,row2,col2));
  if (gb.getToken(row1, col1) != null && gb.getToken(row2,col2)!= null && gb.getToken(row1,col1).equals(gb.getToken(row2, col2)))
 {
   System.out.println("Congratulations! " + Players[CurrentPlayer%2] + " ,you got a match!");
   gb.removeToken(row1,col1);
   gb.removeToken(row2,col2);
   if(CurrentPlayer%2 == 0)
   {
     Scores[0]++;
   }
   if(CurrentPlayer%2 == 1 )
   {
     Scores[1]++;
   }
 } 
 else{
   System.out.println("Sorry, no match");
 } 
 for(int i = 0; i < Players.length; i++)
 {
   System.out.println(Players[i] +":" + Scores[i]);
 }
 CurrentPlayer++;


 }

if(gb.countTokens() == 0)
{
  if (Scores[0] > Scores [1])
  {
    System.out.println("Congratulations," + Players[0] + " ,You have just won the Hunger Games!" );
  }
  else if(Scores[0]==Scores [1])
  System.out.println("Congratulations, you just tied!");

  else
   System.out.println("Congratulations," + Players[1] + " ,You have just won the Hunger Games!" );
}

  }
}
