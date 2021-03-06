package com.jasvirdi.solitaire.datatype;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pile {

	@JsonProperty
  private List<Card> cards;

  public Pile() {

    cards = new ArrayList<>();

  }

  public void addCard(Card card) {

    if (cards.contains(card)) {

      throw new DuplicateCardReferenceException("Duplicate Cards are not allowed");

    }
    cards.add(card);

  }

  public Card getCard(int index) {

    return cards.get(index);

  }

  public int size() {
    return cards.size();
  }

}
