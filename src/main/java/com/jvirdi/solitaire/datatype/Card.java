package com.jvirdi.solitaire.datatype;

public class Card {

	private final Rank rank;
	private final Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank= rank;
		this.suit=suit;
				
	}

	public String getFullName() {
		
		return getRank().getShortName() + " of " + getSuit().getValue() ;
	}

	
	public Suit getSuit() {
		
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

}
