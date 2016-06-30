package com.jvirdi.solitaire.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jvirdi.solitaire.datatype.Card;
import com.jvirdi.solitaire.datatype.Location;
import com.jvirdi.solitaire.domain.Deck;
import com.jvirdi.solitaire.domain.GameBoard;

@Component
@EnableAutoConfiguration
public class GameService {

  @Bean
  @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public GameBoard dealSolitaire(Deck deck) {

    Location[] locations =
        new Location[] {Location.TABLEAU_1, Location.TABLEAU_2, Location.TABLEAU_3,
            Location.TABLEAU_4, Location.TABLEAU_5, Location.TABLEAU_6, Location.TABLEAU_7};

    GameBoard gameBoard = new GameBoard();

    for (int x = 0; x < 7; x++) {

      for (int y = 0; y < 7; y++) {

        if (x > y) {
          continue;
        }

        Card card = deck.drawCard();
        gameBoard.addCard(locations[y], card);

        if (x == y) {
          card.turnFaceUp();
        }
      }
    }

    int remainingDeckSize = deck.size();
    for (int i = 0; i < remainingDeckSize; i++) {
      gameBoard.addCard(Location.DRAW, deck.drawBottomCard());
    }
    return gameBoard;
  }

}
