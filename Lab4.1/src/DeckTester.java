
public class DeckTester 
{

	public static void main(String[] args) 
	{
		String [] ranks = {"Q", "K", "A"};
		String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int [] pointValues = {2,3,4,5};
		
		
		
		Deck z = new Deck(ranks, suits, pointValues);
		
		z.deal();
		z.shuffler();
		System.out.print(z);
		
	}

}
