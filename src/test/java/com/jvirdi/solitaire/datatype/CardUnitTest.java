package com.jvirdi.solitaire.datatype;

import org.junit.Assert;
import org.junit.Test;


public class CardUnitTest {
	
	
	@Test
	public void aCardCanBeInstanciatedWithARankAndASuit(){
		Card card = new Card(Rank.ACE, Suit.SPADES);
		
		Assert.assertEquals(card.getFullName(), "Ace of Spades");
		
		Assert.assertEquals(card.getSuit().getColor(), Color.BLACK);
		
		
		Card tenOfClubs = new Card(Rank.TEN, Suit.CLUBS);
		
		Assert.assertEquals(tenOfClubs.getFullName(), "10 of Clubs");
		
		Assert.assertEquals(tenOfClubs.getSuit().getColor(), Color.BLACK);
		
		
		
	}

}
