package com.jasvirdi.solitaire.services;

import org.junit.Assert;
import org.junit.Test;

import com.jasvirdi.solitaire.domain.Deck;
import com.jasvirdi.solitaire.domain.GameBoard;
import com.jasvirdi.solitaire.services.GameService;

public class GameServiceUnitTest {

  @Test
  public void gameServiceReturnAFullyConstructedBoard() {

    GameService gameService = new GameService();

    Deck deck = new Deck();

    GameBoard gameBoard = gameService.dealSolitaire(deck);
    Assert.assertEquals(0, deck.size());

  }

}
