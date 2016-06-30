package com.jvirdi.solitaire.domain;

import java.util.HashMap;
import java.util.Map;

import com.jvirdi.solitaire.datatype.Card;
import com.jvirdi.solitaire.datatype.Location;
import com.jvirdi.solitaire.datatype.Pile;

public class GameBoard {

  private Map<Location, Pile> piles;

  public GameBoard() {

    piles = new HashMap<>();

    for (Location location : Location.values()) {
      piles.put(location, new Pile());
    }

  }

  public void addCard(Location location, Card card) {

    piles.get(location).addCard(card);

  }

  public Pile getPile(Location location) {

    return piles.get(location);
  }

}
