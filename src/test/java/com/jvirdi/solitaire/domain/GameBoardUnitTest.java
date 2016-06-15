package com.jvirdi.solitaire.domain;

import org.junit.Test;

import com.jvirdi.solitaire.datatype.Card;
import com.jvirdi.solitaire.datatype.Rank;
import com.jvirdi.solitaire.datatype.Suit;

import junit.framework.Assert;

public class GameBoardUnitTest {

	@Test
	public void aCardCanBeAddedToASpecificSpotOnTheGameBoard(){
		GameBoard gameBoard = new GameBoard();
		
		Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
		
		gameBoard.addCard(Location.DISCARD, aceOfSpades);
		
		Assert.assertEquals(aceOfSpades, gameBoard.getPile(Location.DISCARD).get(0));
	}
	
}
