package mru.assignment2.comp2503.model;

public class Card {

	private String suit;
	private int rank;
	/**
	 * Card is a class to define a Card
	 * @param suit
	 * @param rank
	 */
	public Card(String suit, int rank) {
		this.suit=suit;
		this.rank=rank;
	}
	
	/**
	 * returns suit
	 * @return suit
	 */
	public String getSuit() {
		return suit;
	}
	
	/**
	 * sets the value of the suit of the Card
	 * @param suit
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	/**
	 * returns rank
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}
	
	/**
	 * sets the value of the rank of the Card
	 * @param rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
	
		
	/**
	 * toString method to print out the Card in a readable form. 
	 */
	@Override
	public String toString() {
		if(getRank()==1) {
			return "Ace of "+suit;
		}else if (getRank()==11) {
			return "Jack of "+suit;
		}else if (getRank()==12) {
			return "Queen of "+suit;
		}else if (getRank()==13) {
			return "King of "+suit;
		}
		return rank+" of "+ suit ;
	}
	
	
}
