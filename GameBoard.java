/*
Creator: Matthew Ayoob
The GameBoard class creates a gameboard and an iteration of the game.
*/
public class GameBoard {
  String [][] tokens;
  int rows;
  int cols;

//Constructor
   public GameBoard(int r,int c)
   {
     tokens = new String[r][c];
     rows = r;
     cols = c;
   }

/**
    * places a string type token on the board
    * @return none
  */
 public void setToken(int r, int c, String si)
{
tokens[r][c] = si;
}

/**
    * places a string type token on the board
    * @return none
  */
public String getToken(int r, int c)
{
  return tokens[r][c];
}


/**
    * removes a token from the board
    * @return none
  */
public void removeToken(int r, int c)
{
  tokens[r][c] = null;
}

/**
    * counts the amount of tokens
    * @return integer representation of the tokens
  */
public int countTokens()
{
int count = 0;
for ( int r =0; r < tokens.length ; r++ )
{
   for (int c =0; c < tokens[r].length; c++)
   {
      if (tokens[r][c] != null)
{
  count++;
} 
   }

}
return count;
}
 
/**
    * displays the game
    * @return String
  */
public String display()
{ 
  String disp = ""; //building blocks
  String ro = "+-----------";
  String co = "|\t("; 
  String co1 = ")\t";

  for (int r =0 ; r <rows; r++) //makes perfect horizontal slice row times
  { 
    if (r >0) //inside of code makes horizontal slice
  disp += "\n";
 
  for (int i =0 ; i <cols; i++)
  {
    disp += ro;
  } 
  disp += "+\n";

  for (int s =0 ; s <cols; s++)
   { 
     disp +=co + r + "," + s + co1 ;
   }
   disp += "|";
  }

   for (int i =0 ; i <cols; i++) //final dash line
  {
    if (i==0)
  disp += "\n";
  disp += ro;
  } 
  disp += "+\n";
  
  return disp;
  
  //return "+-------+-------+-------+\n|\tA\t|\tA\t|\tA\t|\t\n+-------+-------+-------+\n|\tA\t|\tA\t|\tA\t|\n+-------+-------+-------+\n|\tA\t|\tA\t|\tA\t|\n+-------+-------+-------+\n|\tA\t|\tA\t|\tA\t|\n+-------+-------+-------+";
}

/**
    * flips a token when there's a match
    * @return String
  */
public String display(int r, int c) 
{
     String disp = ""; 
  String ro = "+-----------";
  String co = "|\t"; 
  String co1 = "\t";
  for (int w =0 ; w <rows; w++) //rows
  { 
    if (w >0) 
      disp += "\n";
  
    for (int i =0 ; i <cols; i++) //cell top
    {
      disp += ro;
    }  
    disp += "+\n";

    for (int s =0 ; s <cols; s++)
    { 
      if ( w == r && s ==c && tokens[w][s] !=null)
        disp +=co + "\t" + tokens[r][s] + co1;
      else
      {
        disp +=co + "\t " + co1 ;
      }
    }
    disp += "|";
  }

  for (int i =0 ; i <cols; i++) //Bottom of last row
  {
    if (i==0)
      disp += "\n";
    disp += ro;
  } 
  disp += "+\n";
  
  return disp;
}

/**
    * flips two tokens when there's a match
    * @return String
  */
public String display(int r, int c, int x, int y)
{
     String disp = ""; 
  String ro = "+-----------";
  String co = "|\t"; 
  String co1 = "\t";
  for (int w =0 ; w <rows; w++)
  { 
    if (w >0) 
  disp += "\n";
  
  for (int i =0 ; i <cols; i++)
  {
    disp += ro;
  } 
  disp += "+\n";

  for (int s =0 ; s <cols; s++)

   { if (( w == r && s ==c && tokens[w][s] !=null) || ( x == w && y ==s && tokens[w][s] !=null))
disp +=co + "\t" + tokens[w][s] + co1;
     else 
      {
     disp +=co + "\t " + co1 ;
       }
    
   }
   disp += "|";
  }

   for (int i =0 ; i <cols; i++) 
  {
    if (i==0)
  disp += "\n";
  disp += ro;
  } 
  disp += "+\n";
  
  return disp;
}

/**
    * creates a UX display of the game
    * @return String representation of the game to printed
  */
public String display(boolean b)
{
  String disp = ""; //building blocks
  String ro = "+-----------";
  String co = "|\t"; 
  String co1 = "\t";
  for (int r =0 ; r <rows; r++) //makes perfect horizontal slice row times
  { 
    if (r >0) //inside of code makes horizontal slice
  disp += "\n";
  
  for (int i =0 ; i <cols; i++)
  {
    disp += ro;
  } 
  disp += "+\n";

  for (int s =0 ; s <cols; s++)

   { 
     if (tokens[r][s] == null)
      {
     disp +=co + "\t " + co1 ;
       }
     else
     disp +=co + "\t" + tokens[r][s] + co1 ;
   }
   disp += "|";
  }

   for (int i =0 ; i <cols; i++) //final dash line
  {
    if (i==0)
  disp += "\n";
  disp += ro;
  } 
  disp += "+\n";
  
  return disp;
}

}
