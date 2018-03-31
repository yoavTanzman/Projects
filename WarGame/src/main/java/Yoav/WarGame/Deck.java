package Yoav.WarGame;

import Yoav.WarGame.card.Card;

public interface Deck {
	  /* Create the deck of cards */
	  public void create();

	  /* Shuffle the deck */
	  public void shuffle();

	  /* deal a card from the deck */
	  public void deal(Player player1, Player player2);

	  /* return the number of cards in a deck */
	  public int numCards();
	}
