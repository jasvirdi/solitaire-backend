package com.jvirdi.solitaire.datatype;

public enum Suit {

  SPADES("Spades", Color.BLACK), HEARTS("Hearts", Color.RED), CLUBS("Clubs",
      Color.BLACK), DIAMONDS("Diamonds", Color.RED);

  private final Color color;
  private final String value;

  Suit(String value, Color color) {

    this.color = color;
    this.value = value;
  }

  public Color getColor() {

    return color;
  }

  public String getValue() {
    return value;
  }


}


