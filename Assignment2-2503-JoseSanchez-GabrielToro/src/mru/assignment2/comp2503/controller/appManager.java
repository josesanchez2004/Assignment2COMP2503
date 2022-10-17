package mru.assignment2.comp2503.controller;

import java.util.Scanner;

import mru.assignment2.comp2503.view.TextMessage;

/**
 * this class has the code to run the main menu and call the warGame class and functions for the app. 
 * @author Jose Sanchez and Gabriel Toro
 *
 */
public class appManager {

	Scanner in;
	TextMessage message;
	CardDeck deck;
	WarGame game;
	
	/**
	 * This is the constructor for the appManager class. 
	 */
	public appManager() {
		
		in = new Scanner(System.in);
		message=new TextMessage();
		mainMenu();
	}
	
	/**
	 * mainMenu is the method that holds the controller code for the main menu
	 */
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
				deck= new CardDeck();
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
