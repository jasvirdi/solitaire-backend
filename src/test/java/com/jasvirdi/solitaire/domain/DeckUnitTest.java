package com.jasvirdi.solitaire.domain;

import org.junit.Assert;
import org.junit.Test;

import com.jasvirdi.solitaire.datatype.Card;
import com.jasvirdi.solitaire.datatype.Rank;
import com.jasvirdi.solitaire.datatype.Suit;
import com.jasvirdi.solitaire.domain.Deck;

public class DeckUnitTest {

  @Test
  public void standardDeckHas52Cards() {
    Deck deck = new Deck();
    Assert.assertEquals(52, deck.size());
  }

  @Test
  public void whenDrawIsCalledTheTopCardIsDrawn() {
    Deck deck = new Deck();

    Card aceOfClubs = new Card(Rank.ACE, Suit.CLUBS);
    Card tenOfHearts = new Card(Rank.TEN, Suit.HEARTS);

    deck.addCard(aceOfClubs);
    deck.addCard(tenOfHearts);

    Assert.assertEquals(tenOfHearts, deck.drawCard());

  }

}
