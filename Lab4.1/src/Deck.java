import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	private ArrayList <Card> unDealt;
	private ArrayList <Card> Dealt;

	
	public Deck(String [] ranks, String [] suits, int [] pointValues) 
	{
		this.Dealt = new ArrayList<Card>();
		this.unDealt = new ArrayList<Card>();
		
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
			Card p = unDealt.get(0);
			Dealt.add(p);
			return unDealt.remove(0);
		}
		else return null;
	}

	public ArrayList<Card> shuffler()
	{
		ArrayList <Card> a = new ArrayList<Card>();
		
		Random y = new Random();
		Random z = new Random();

		int op = y.nextInt(unDealt.size());
	//	int po = z.nextInt(Dealt.size());
		
		for(int i = 0; i < unDealt.size(); i++) 
		{
			
			a.add(unDealt.get(op));
			unDealt.remove(unDealt.get(op));
		}
		
	/*	
		for(int i = 0; i < Dealt.size(); i++) 
		{
			
			a.add(Dealt.get(po));
			Dealt.remove(Dealt.get(po));
		
		}
		Dealt.clear();
		
	*/	
		
		return a;
	}
	
	@Override
	public String toString() 
	{
		return "Undealt Deck: " + unDealt + "\n Dealt Deck: " + Dealt;
	}
	
	
}
