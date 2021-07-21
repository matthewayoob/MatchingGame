/*
    The Card class creates and manipulates a card of suit and value for the game.
  */
public class Card
{
  int v;
  int s;
  public Card(int ss, int vv)
  {
    v = vv;
    s = ss;
  }
  /**
    * finds the value of the card
    * @return integer representation of the card value
  */
  public int getValue()
  {
    if(v == 1)
    {
      return 1;
    }
    else if(v <= 2)
      {
      return 2;
      }
    else if(v <= 3)
    {
      return 3;
    }
    else if(v <= 4)
    {
      return 4;
    }
    else if(v <= 5)
    {
      return 5;
    }
    else if(v <= 6)
    {
    return 6;
    }
    else if(v <= 7)
    {
      return 7;
    }
    else if(v <= 8)
    {
      return 8;
    }
    else if(v <= 9)
    {
      return 9;
    }
    else if(v <= 10)
    {
      return 10;
    }
    else if(v <= 11)
    {
      return 11;
    }
    else if(v <= 12)
    {
      return 12;
    }
    else if(v <= 13)
    {
      return 13;
    }
    else 
    {
      return 14;
    }
  }
  
  /**
    * creates a string representation of the suit
    * @return string representaiton of the suit
  */
  public String getSuit()
  {
    if(s>3 || s<0)
    {
      return "please choose a number btwn 0 and 3";
    }
    else if(s==0)
    {
      return "diamonds";
    }
    else if(s==1)
    {
      return "hearts";
    }
    else if(s==2)
    {
      return "spades";
    }
    else 
    {
      return "clubs";
    }
  }
    public String toString()
    {
    return  getValue() + " of "  + getSuit(); }
}
