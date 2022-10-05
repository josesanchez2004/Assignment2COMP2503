package mru.assignment2.comp2503.model;

public class Card {

	private String suit;
	private int rank;
	
	public Card(String suit, int rank) {
		this.suit=suit;
		this.rank=rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

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
