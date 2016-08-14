package com.jasvirdi.solitaire.domain;

import java.util.ArrayList;
import java.util.List;

import com.jasvirdi.solitaire.datatype.Card;
import com.jasvirdi.solitaire.datatype.Rank;
import com.jasvirdi.solitaire.datatype.Suit;

public class Deck {

  private final List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();

    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        addCard(new Card(rank, suit));
      }
    }

  }

  public void addCard(Card card) {
    cards.add(0, card);
  }

  public Card drawCard() {

    return cards.remove(0);
  }

  public int size() {

    return cards.size();
  }

  public Card drawBottomCard() {

    if (size() > 0) {
      return cards.remove(size() - 1);
    }

    return null;
  }

}
