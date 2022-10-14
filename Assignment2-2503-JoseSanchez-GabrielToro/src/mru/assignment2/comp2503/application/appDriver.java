package mru.assignment2.comp2503.application;

import mru.assignment2.comp2503.controller.CardDeck;
import mru.assignment2.comp2503.model.DoublyLinkedListDeck;

public class appDriver {

	public static void main(String[] args) {
		
		CardDeck dick= new CardDeck();
		dick.printDeck();
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		DoublyLinkedListDeck<Integer> list = new DoublyLinkedListDeck<>();
		
		
		list.addToEnd(7);
		list.addToStart(3);
		list.addToStart(2);
		
		list.addAt(2, 5);
		list.print();
	}

}
