package com.jasvirdi.solitaire.web.resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.jasvirdi.solitaire.datatype.ServerDownException;
import com.jasvirdi.solitaire.domain.Deck;
import com.jasvirdi.solitaire.domain.GameBoard;
import com.jasvirdi.solitaire.services.GameService;
import com.jasvirdi.solitaire.web.resource.GameResource;

import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class GameBoardResourceUnitTest {

  @Mocked
  private GameService gameService;

  private Deck deck;

  private GameResource gameResource;
  private GameBoard gameBoard;

  @Before
  public void setup() {
    gameResource = new GameResource(gameService);
    deck = new Deck();
    gameBoard = new GameBoard();
  }

  @Test
  public void webResouceCanCreateAGame() throws ServerDownException {

    new Expectations() {
      {
        gameService.dealSolitaire(withSameInstance(deck));
        result = gameBoard;
        times = 1;

      }
    };

    Assert.assertSame(gameBoard, gameResource.createNewGame(deck));
  }

  @Test(expected = ServerDownException.class)
  public void webResouceThrowsServerDownExceptionWhenGameServiceThrowsARuntimeException() throws ServerDownException {

    new Expectations() {
      {
        gameService.dealSolitaire(withSameInstance(deck));
        result = new RuntimeException();
        times = 1;

      }
    };

    gameResource.createNewGame(deck);
    Assert.fail("No way this should have gotten here");
  }

}
