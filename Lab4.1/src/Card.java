
public class Card 
{
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card (String rank, String suit, int pointValue) 
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public String getRank() 
	{
		return rank;
	}
	
	public String getSuit() 
	{
		return suit;
	}
	
	public int getPointValue() 
	{
		return pointValue;
	}

/*	public static boolean equals(Card a, Card b) 
	{
		if(getPointValue(a) == getPointValue(b)) 
		{
			return true;
		}
		return false;
	}
*/	
	public String toString() 
	{
		return "\nCard- " + " Rank: " + suit + " Value: " + pointValue + " Suit: " + rank; 		
	}

}
