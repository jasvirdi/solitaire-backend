package com.jvirdi.solitaire.domain;

import org.junit.Assert;
import org.junit.Test;

import com.jvirdi.solitaire.datatype.Card;
import com.jvirdi.solitaire.datatype.Rank;
import com.jvirdi.solitaire.datatype.Suit;


public class DeckUnitTest {

	@Test
	public void whenDrawIsCalledTheTopCardIsDrawn(){
		Deck deck = new Deck();
		
		Card aceOfClubs = new Card(Rank.ACE, Suit.CLUBS);
		Card tenOfHearts = new Card(Rank.TEN, Suit.HEARTS);
		
		deck.addCard(aceOfClubs);
		deck.addCard(tenOfHearts);
		
		Assert.assertEquals(tenOfHearts, deck.drawCard());
		
	}
	
}
