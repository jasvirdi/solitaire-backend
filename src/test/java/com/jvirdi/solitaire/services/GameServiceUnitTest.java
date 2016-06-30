package com.jvirdi.solitaire.services;

import org.junit.Assert;
import org.junit.Test;

import com.jvirdi.solitaire.domain.Deck;
import com.jvirdi.solitaire.domain.GameBoard;

public class GameServiceUnitTest {

  @Test
  public void gameServiceReturnAFullyConstructedBoard() {

    GameService gameService = new GameService();

    Deck deck = new Deck();

    GameBoard gameBoard = gameService.dealSolitaire(deck);
    Assert.assertEquals(0, deck.size());

  }

}
