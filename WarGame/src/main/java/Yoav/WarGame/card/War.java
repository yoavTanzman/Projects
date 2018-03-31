package Yoav.WarGame.card;

import java.util.ArrayList;
import java.util.Collections;

import Yoav.WarGame.Deck;
import Yoav.WarGame.Player;

public class War implements Deck{

	ArrayList<Card> deck = new ArrayList<Card>();
	
	public void create() {
		
		  int i = 0;
		  for (Suit s : Suit.values()) {
		    for (Rank r : Rank.values()) {
		    	deck.add(i, new Card(s,r));
		      i++;  // increment i here
		    }
		  }
            }


	public void shuffle() {
			
		Collections.shuffle(deck);
		
	}

	public void deal(Player player1, Player player2) {
		
        for (int i = 0; i < deck.size(); i = i + 2) {
            player1.addCard(deck.get(i));
            player2.addCard(deck.get(i + 1));
	}		
        
	}

	public int numCards() {
		return deck.size(); 
	}
	
	public void printDeck(){
		int counter =0;
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i).getRank()+" "+deck.get(i).getSuit());
			counter++;
		}
		//System.out.println(counter); /* this is to check that 52 cards have been made  */
	}
	
	
	public void PlayGame(Player one , Player two){
		
		War warTest = new War();
		warTest.create();
		warTest.shuffle();
		//warTest.printDeck();
		warTest.deal(one, two);
		
		System.out.println("Deck of player "+one.getName());
		one.printDeck();
		System.out.println();
		System.out.println("Deck of player "+two.getName());
		two.printDeck();
		System.out.println();
		
		
		
		while(one.getDeckSize()>0&& two.getDeckSize()>0)
		{
			Card a = new Card(one.getStack().get(0).getSuit(), one.getStack().get(0).getRank());
			Card b = new Card(two.getStack().get(0).getSuit(), two.getStack().get(0).getRank());
			a.printCard();
			b.printCard();
			if(a.compareTo(b)>0){
				System.out.println(one.getName()+" won this hand");
				one.addCard(b);
				two.removeCard();
			}
			else if(a.compareTo(b)<0){
				System.out.println(two.getName()+" won this hand");
				two.addCard(a);
				one.removeCard();
			}
			else if(a.compareTo(b)==0){
				 ArrayList<Card> tempList = new ArrayList<Card>();
				 one.removeCard();
				 two.removeCard();
				 	
				/*
				if(one.getDeckSize()>4 && two.getDeckSize()>4){
					
					System.out.println("This is a tie ");
					
				 for (int i = 0; i < 2; i++) {
					 Card temp = new Card(one.getStack().get(0).getSuit(), one.getStack().get(0).getRank());
					 Card temp1 = new Card(two.getStack().get(0).getSuit(), two.getStack().get(0).getRank());
					 tempList.add(temp);
					 tempList.add(temp1);
					 one.removeCard();
					 two.removeCard();
					 
				 }
				
					if(a.compareTo(b)>0){
						System.out.println(one.getName()+" won this hand");
						one.addCard(b);
						two.removeCard();
						while(!tempList.isEmpty()){
							one.addCard(tempList.get(0));
							tempList.remove(0);
						}
						
						
					}
					else if(a.compareTo(b)<0){
						System.out.println(two.getName()+" won this hand");
						two.addCard(a);
						one.removeCard();
						while(!tempList.isEmpty()){
							two.addCard(tempList.get(0));
							tempList.remove(0);
						}
						
						
					}						
						
					}
				else{
					one.removeCard();
					two.removeCard();
				}
				 */
				 
				}
			}
		
		System.out.println(one.getDeckSize());
		System.out.println(two.getDeckSize());
		if(one.getDeckSize()==0) System.out.println("The winner is "+two.getName());
		else{
			System.out.println("The winner is "+one.getName());
		}
	}	
			

	
	

	public static void main(String[] args) {
		War warTest = new War();
		Player player = new Player("Yoav");
		Player player2 = new Player("Ben");
		warTest.PlayGame(player, player2);

	}
	
	
}
