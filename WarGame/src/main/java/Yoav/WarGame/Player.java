package Yoav.WarGame;
import java.util.ArrayList;

import Yoav.WarGame.card.Card;

public class Player {
    private String name;
    private int points;

    private ArrayList<Card> stack = new ArrayList<Card>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public ArrayList<Card> getStack() {
        return stack;
    }

    public void addCard(Card card) {
        stack.add(card);
    }
    public void removeCard(){
    	stack.remove(0);
    }
    
    public void printDeck()
    {
    	int counter = 0;
    	for (int i = 0; i < stack.size(); i++) {
    		if(i==0){
    			System.out.print("[ "+stack.get(i).getRank()+" "+ stack.get(i).getSuit()+" , ");
    			counter++;
    		}
    		else if(i<stack.size()-1&&i!=0){
			System.out.print(stack.get(i).getRank()+" "+ stack.get(i).getSuit()+" , ");
			counter++;
    		}
    		else{
    			System.out.print(stack.get(i).getRank()+" "+ stack.get(i).getSuit()+" ] ");
    			counter++;
    		}
		}
    	System.out.println(counter);
    }
    
    public int getDeckSize(){
    	return stack.size();
    }
}


