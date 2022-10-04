package mru.assignment2.comp2503.controller;

import mru.assignment2.comp2503.model.Card;

public class CardDeck {
	
	private Card[] deck;
	private int maxCards;
	private int index; 
	
	public CardDeck() {
		maxCards=52;
		deck= new Card[maxCards];
		 deck=generateDeck();
		 index=1;
	}
	
	public Card[] generateDeck() {
		
		for(int i=1;i<=13;i++) {
			Card c= new Card("Diamonds",i);
			deck[index]=c;
			index++;
		}
		for(int i=1;i<=13;i++) {
				Card c= new Card("Hearts",i);
				deck[index]=c;
				index++;
		}
		for(int i=1;i<=13;i++) {
			Card c= new Card("Clubs",i);
			deck[index]=c;
			index++;
		}
		for(int i=1;i<=13;i++) {
			Card c= new Card("Spades",i);
			deck[index]=c;
			index++;
		}
		
		return deck;
		
	}
	
	public void printDeck() {
		for(int i=0;i<deck.length;i++) {
			System.out.println(deck[i].toString()); 
		}
	}

}
