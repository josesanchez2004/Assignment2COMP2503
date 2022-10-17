package mru.assignment2.comp2503.controller;

import mru.assignment2.comp2503.model.Card;
import mru.assignment2.comp2503.model.DoublyLinkedListDeck;
import mru.assignment2.comp2503.model.LinkedListStack;
import mru.assignment2.comp2503.view.TextMessage;

/**
 * This class has the code for the WarGame
 * @author Jose Sanchez and Gabriel Toro
 */
public class WarGame {
	
	TextMessage message;
	LinkedListStack<Card> deckPlayer1;
	LinkedListStack<Card> deckPlayer2;
/**
 * WarGame is the constructor for the WarGame class and calls the playGame method to start the game. 
 * @param deck
 */
public WarGame(CardDeck deck) {
	message= new TextMessage();
	deckPlayer1 = new LinkedListStack<Card>();
	deckPlayer2 = new LinkedListStack<Card>();
	playGame(deck);
}

/**
 * playGame has the controller code for the game. 
 * @param deck
 */
private void playGame(CardDeck deck) {
	deck.shuffleDeck();
	int amountOfCards=message.howManyCards();
	int index=0;
	int playerOneCount=0;
	int playerTwoCount=0;
	for(int count=0;count<amountOfCards;count++) {
		Card c=deck.list.removeFromEnd();
		Card c2=deck.list.removeFromEnd();
		deckPlayer1.push(c);
		deckPlayer2.push(c2);
	}
	
	while(index<amountOfCards) {
		Card cardOne= deckPlayer1.pop();
		Card cardTwo= deckPlayer2.pop();
		
		if(cardOne.getRank()>cardTwo.getRank()) {
			message.printPlayerOutput(cardOne, cardTwo);
			playerOneCount++;
		}else if (cardOne.getRank()<cardTwo.getRank()) {
			message.printPlayerOutput(cardOne, cardTwo);
			playerTwoCount++;
		}else {
			
		}
		
		index++;
	}
	
	if(playerOneCount>playerTwoCount) {
		message.player1Wins();
	}else if (playerOneCount<playerTwoCount) {
		message.player2Wins();
	}else {
		message.tieGame();
	}
	
	

}


}
