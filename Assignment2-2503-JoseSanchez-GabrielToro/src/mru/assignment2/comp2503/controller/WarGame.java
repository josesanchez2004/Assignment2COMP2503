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
				if(calculateRank(cardOne)>calculateRank(cardTwo)) {
					message.printPlayerOutput(cardOne, cardTwo);
					playerOneCount++;
				}else if(calculateRank(cardOne)<calculateRank(cardTwo)){
					message.printPlayerOutput(cardOne, cardTwo);
					playerTwoCount++;
				}else {
					message.printPlayerOutput(cardOne, cardTwo);
					playerOneCount++;
					playerTwoCount++;
				}
				
		}
				
		
		index++;
	}
	
	System.out.println("Player 1 points: "+playerOneCount);
	System.out.println("Player 2 points: "+playerTwoCount);
	System.out.println("");
	
	if(playerOneCount>playerTwoCount) {
		message.player1Wins();
	}else if (playerOneCount<playerTwoCount) {
		message.player2Wins();
	}else {
		message.tieGame();
	}
	
	

}

/**
 * calculates the rank of suits by numerating them with order of highest to lowest, Spade, Heart, Diamond, and Club.
 * @param c
 * @return
 */
public int calculateRank(Card c) {
	
	if(c.getSuit()=="Spade") {
		return 4;
	}else if (c.getSuit()=="Heart") {
		return 3;
	}else if (c.getSuit()=="Diamond") {
		return 2;
	}
	else {
		return 1;
	}
}


}
