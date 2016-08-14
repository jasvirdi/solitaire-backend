package com.jasvirdi.solitaire.domain;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jasvirdi.solitaire.datatype.Card;
import com.jasvirdi.solitaire.datatype.Location;
import com.jasvirdi.solitaire.datatype.Pile;

public class GameBoard {

	@JsonProperty
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
