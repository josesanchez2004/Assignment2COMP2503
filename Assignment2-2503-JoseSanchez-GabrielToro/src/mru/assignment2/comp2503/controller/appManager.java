package mru.assignment2.comp2503.controller;

import java.util.Scanner;

import mru.assignment2.comp2503.view.TextMessage;

public class appManager {

	Scanner in;
	TextMessage message;
	CardDeck deck;
	WarGame game;
	
	public appManager() {
		
		in = new Scanner(System.in);
		message=new TextMessage();
		mainMenu();
	}
	
	private void mainMenu() {
		boolean toggle = true;
		int choice=0;
		
		while(toggle) {
			message.mainMenuText();
			choice= message.promptMenuChoice();
			
			switch (choice) {
			case 1: 
				deck= new CardDeck();
				deck.generateDeck();
				deck.shuffleDeck();
				game= new WarGame(deck);
				
				break;
			
			case 2:
				deck.shuffleDeck();
				message.deckHasBeenShuffled();
				break;
			
			case 3: 
				toggle=false;
				break;
			
			
			}
		}
		
	}
}
