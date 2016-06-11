package com.jvirdi.solitaire.domain;

import java.util.ArrayList;
import java.util.List;

import com.jvirdi.solitaire.datatype.Card;

public class Deck {

  private final List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();
  }

  public void addCard(Card card) {
    cards.add(0, card);
  }

  public Card drawCard() {
    return cards.get(0);
  }

}
