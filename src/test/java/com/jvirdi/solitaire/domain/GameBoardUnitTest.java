package com.jvirdi.solitaire.domain;

import org.junit.Assert;
import org.junit.Test;

import com.jvirdi.solitaire.datatype.Card;
import com.jvirdi.solitaire.datatype.DuplicateCardReferenceException;
import com.jvirdi.solitaire.datatype.Location;
import com.jvirdi.solitaire.datatype.Rank;
import com.jvirdi.solitaire.datatype.Suit;

public class GameBoardUnitTest {

  @Test
  public void aCardCanBeAddedToASpecificSpotOnTheGameBoard() {

    GameBoard gameBoard = new GameBoard();

    Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);

    gameBoard.addCard(Location.DISCARD, aceOfSpades);

    Assert.assertEquals(aceOfSpades, gameBoard.getPile(Location.DISCARD).getCard(0));
  }

  @Test
  public void cannotHaveADuplicateCard() {
    Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
    Card sameAceOfSpades = aceOfSpades;
    Card differentAceOfSpades = new Card(Rank.ACE, Suit.SPADES);

    GameBoard gameBoard = new GameBoard();

    gameBoard.addCard(Location.DISCARD, aceOfSpades);

    try {
      gameBoard.addCard(Location.DISCARD, sameAceOfSpades);
      Assert.fail("Cannot add the same reference to the test");
    } catch (DuplicateCardReferenceException e) {
      gameBoard.addCard(Location.DISCARD, differentAceOfSpades);
      Assert.assertEquals(gameBoard.getPile(Location.DISCARD).size(), 2);
    }

  }
}
