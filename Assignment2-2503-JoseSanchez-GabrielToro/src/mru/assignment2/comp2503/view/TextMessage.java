package mru.assignment2.comp2503.view;

import java.util.Scanner;

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
		System.out.print("Please select your choice:  ");
		 int choice= sc.nextInt();
		 return choice;
	}

}
