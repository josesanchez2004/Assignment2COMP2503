package mru.assignment2.comp2503.controller;

import java.util.Random;

import mru.assignment2.comp2503.model.Card;

public class Shuffler {
	
	private Card temporaryCard;

	
	public Shuffler() {
		
		
	}
	
	public CardDeck shuffleDeck() {
		int randomIndex;
		
		for(int i=0;i<52;i++) {
			Random random = new Random();
			randomIndex= random.nextInt(52);
			
		}
		
		
		
		
		return null;
		
	}
}
