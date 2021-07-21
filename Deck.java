import java.util.ArrayList;

/*
Creator: Matthew Ayoob
The Deck class creates a deck of cards
*/
public class Deck
{
  ArrayList<Card> theDeck;
  {
    theDeck = new ArrayList<Card>();
  }
 /**
    * adds a card to the deck
    * @return none
  */
  public void addCard(Card c)
  {
    theDeck.add(c);
  }
  
  /**
    * deals a card 
    * @return dealt Card
  */
  public Card dealCard()
  {
    int p = (int)((Math.random())*(theDeck.size()));
    return theDeck.remove(p);
  }
  
  /**
    * converts the Deck into a string
    * @return string representation of the deck
  */
  public String toString()
    {
      String temp = "";
      for ( int i = 0; i <theDeck.size() ; i++)
      {
        temp += theDeck.get(i).toString() + "\n";
      }
      return temp;
    }
    
  }
