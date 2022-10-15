package mru.assignment2.comp2503.controller;

import java.util.Random;

import mru.assignment2.comp2503.model.Card;
import mru.assignment2.comp2503.model.DoublyLinkedListDeck;

public class CardDeck {
	
	public DoublyLinkedListDeck<Card> list;
	
	private int maxCards;
	private int index; 
	
	public CardDeck() {
		list = new DoublyLinkedListDeck<Card>();
		 maxCards=52;
		 generateDeck();
	}
	
	public void generateDeck() {
		for(index=1;index<=52;index++) {
			if(index<=13) {
				Card diamonds = new Card("Diamond",index);
				list.addToStart(diamonds);
			}else if(index<=26) {
				Card clubs = new Card("Club",index-13);
				list.addToStart(clubs);
			}else if(index<=39) {
				Card hearts = new Card("Heart",index-26);
				list.addToStart(hearts);
			}else if(index<=52) {
				Card spades = new Card("Spade",index-39);
				list.addToStart(spades);
			}
		}
		
	}
	
	public void shuffleDeck() {
		for(int i=1;i<=52;i++) {
			Card c=list.removeFromStart();
			Random rand = new Random();
			list.addAt(rand.nextInt(maxCards), c);
		}
	}
	}
