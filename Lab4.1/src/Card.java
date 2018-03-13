
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

	public static boolean equals(Card otherCard) 
	{
		if(Card.equals(otherCard)) 
		{
			return true;
		}
		return false;
	}
	
	public String toString() 
	{
		return "Card- \n" + "Suit: " + suit + "Value: " + pointValue + "Rank: " + rank; 		
	}

}
