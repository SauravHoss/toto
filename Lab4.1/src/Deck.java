
import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	private ArrayList <Card> unDealt;
	private ArrayList <Card> Dealt;

	
	public Deck(String [] ranks, String [] suits, int [] pointValues) 
	{
		for(int i = 0; i < suits.length; i++) 
		{
			for(int k = 0; k < ranks.length; k++) 
			{
				unDealt.add(new Card(suits[i], ranks[k], pointValues[k]));
			}
		}
	}

	public boolean isEmpty()
	{
		if(unDealt.size() == 0) 
		{
			return true;
		}
		return false;
	}

	private int size() 
	{
		return unDealt.size();
	}
	
	public Card deal() 
	{
		if(unDealt.size() != 0)
		{
			unDealt.remove(0);
			return unDealt.get(0);
		}
		else return null;
	}
	
	public shuffle() 
	{	
		unDealt.addAll(Dealt);
		
		//shuffler
		
		
	}
	
	private ssshuffler() 
	{
		Random a = new Random();
		for (int i = 51; i > i; i++) 
		{
			a.nextInt(51);
			Card temp = cardz[i];
			
		}
	}
}
