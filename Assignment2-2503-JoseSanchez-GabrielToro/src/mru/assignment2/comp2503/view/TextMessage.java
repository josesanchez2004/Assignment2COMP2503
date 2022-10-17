package mru.assignment2.comp2503.view;

import java.util.Scanner;

import mru.assignment2.comp2503.model.Card;

public class TextMessage {
	Scanner sc;
	public TextMessage() {
		sc= new Scanner(System.in);
	}
	
	public void deckHasBeenShuffled() {
		System.out.println(" ");
		System.out.println(" Deck has been shuffled! ");
	}
	
	public void mainMenuText() {
		System.out.println(" ");
		System.out.println("Welcome to Jose and Gabes game!!");
		System.out.println("	(1) Play Game  "); 
		System.out.println("	(2) Shuffle Cards ");
		System.out.println("    	(3) Exit  ");
	}
	
	public int promptMenuChoice() {
		int choice=0;
		boolean toggle=false;
		while(toggle==false) {
			System.out.print("Please select your choice:  ");
			if(sc.hasNextInt()) {
				 choice= sc.nextInt();
				 toggle=true;
				if(choice<0 || choice>3) {
					System.out.println();
					System.out.println("You have entered a wrong input");
				}
			}else {
				System.out.println();
				System.out.println("You have entered a wrong input");
				sc.nextLine();
				
			}
		}
			
		
		 
		 return choice;
	}
	
	public int howManyCards() {
		System.out.print("How many cards would you like to deal: ");
		int cards= sc.nextInt();
		System.out.println("");
		
		return cards;
	}
	
	public void printPlayerOutput(Card card1, Card card2) {
		System.out.println("Player 1 has card: "+card1.toString());
		System.out.println("Player 2 has card: "+card2.toString());
		System.out.println("");
		
	}
	
	public void tieGame() {
		System.out.println("The game has tied.");
		System.out.println(" ");
		System.out.println("GAME OVER");
		
	}
	public void player1Wins() {
		System.out.println("Player 1 wins!!!!!!");
		System.out.println(" ");
		System.out.println("GAME OVER");
	}
	
	public void player2Wins() {
		System.out.println("Player 2 wins!!!!!!");
		System.out.println(" ");
		System.out.println("GAME OVER");
		
	}
	

}
