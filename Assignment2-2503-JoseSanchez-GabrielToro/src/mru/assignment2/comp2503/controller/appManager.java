package mru.assignment2.comp2503.controller;

import java.util.Scanner;

import mru.assignment2.comp2503.view.TextMessage;

public class appManager {

	Scanner in;
	TextMessage message;
	public appManager() {
		in = new Scanner(System.in);
		message=new TextMessage();
		mainMenu();
	}
	
	private void mainMenu() {
		boolean exit = false;
	
		
		while(exit) {
			switch (2) {
			case 1: {
				
			}
			case 2:{
				
			}
			case 3: {
				exit=true;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " );
			}
		}
		
	}
}
