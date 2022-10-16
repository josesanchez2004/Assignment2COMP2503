package mru.assignment2.comp2503.controller;

import mru.assignment2.comp2503.model.Card;
import mru.assignment2.comp2503.model.DoublyLinkedListDeck;
import mru.assignment2.comp2503.model.LinkedListStack;
import mru.assignment2.comp2503.view.TextMessage;

public class WarGame {
	TextMessage message;
	LinkedListStack gameDeck;
public WarGame() {
	message= new TextMessage();
	gameDeck= new LinkedListStack<Card>();
	
}

private void playGame(CardDeck deck) {
	deck.shuffleDeck();
	int amountOfCards=message.howManyCards();
	for(int count=0;count<amountOfCards;count++) {
		Card c=deck.list.removeFromEnd();
		
	}

}

}
