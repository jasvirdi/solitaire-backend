package com.jasvirdi.solitaire.web.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.jasvirdi.solitaire.datatype.ServerDownException;
import com.jasvirdi.solitaire.domain.Deck;
import com.jasvirdi.solitaire.domain.GameBoard;
import com.jasvirdi.solitaire.services.GameService;

@RestController
@EnableAutoConfiguration
@EnableWebMvc
public class GameResource {

  private GameService gameService;

  @Autowired
  public GameResource(GameService gameService) {
    this.gameService = gameService;

  }

  @RequestMapping(value = "/games", method = RequestMethod.POST)
  public @ResponseBody GameBoard createNewGame() throws ServerDownException {
    return createNewGame(new Deck());
  }

  public GameBoard createNewGame(Deck deck) throws ServerDownException {

    try {
      return gameService.dealSolitaire(deck);
    } catch (RuntimeException e) {
      throw new ServerDownException(e.getMessage(), e);
    }

  }

}
