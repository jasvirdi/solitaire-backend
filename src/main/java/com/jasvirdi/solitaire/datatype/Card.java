package com.jasvirdi.solitaire.datatype;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Card {

  private final Rank rank;
  private final Suit suit;
  private CardState cardState;

  public Card(Rank rank, Suit suit) {
    this(rank, suit, CardState.FACE_DOWN);
  }

  @JsonCreator
  public Card(Rank rank, Suit suit, CardState cardState) {
    this.rank = rank;
    this.suit = suit;
    this.cardState = cardState;
  }

  public String getFullName() {

    return getRank().getShortName() + " of " + getSuit().getValue();
  }

  public Suit getSuit() {

    return suit;
  }

  public Rank getRank() {
    return rank;
  }

  public CardState getCardState() {
    return cardState;
  }

  public void turnFaceDown() {
    this.cardState = CardState.FACE_DOWN;
  }

  public void turnFaceUp() {
    this.cardState = CardState.FACE_UP;
  }

  public boolean isFaceUp() {

    return getCardState() == CardState.FACE_UP;

  }
}
