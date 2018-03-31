package Yoav.WarGame.card;

public class Card implements Comparable<Card> {
	
	private Suit suit;
	private Rank rank;
	

	public Suit getSuit() {
		return suit;
	}


	public void setSuit(Suit suit) {
		this.suit = suit;
	}


	public Rank getRank() {
		return rank;
	}


	public void setRank(Rank rank) {
		this.rank = rank;
	}



	
	public Card(Suit suit,Rank rank)
	{
		this.suit=suit;
		this.rank=rank;
	}
	
	public void printCard(){
		System.out.println(this.getRank()+" "+this.getSuit());
	}
	



	public int compareTo(Card o) {
		return this.rank.compareTo(o.rank);
		
	}
	
	
}
