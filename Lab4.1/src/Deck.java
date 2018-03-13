import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	private ArrayList <Card> unDealt;
	private ArrayList <Card> Dealt;

	
	public Deck(Array ranks, Array suits, Array pointValues) 
	{
		this.Dealt = Dealt;
		this.unDealt = unDealt;
		ArrayList<Card> cardz = new ArrayList<Card>();
		cardz.addAll(cardz);
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
