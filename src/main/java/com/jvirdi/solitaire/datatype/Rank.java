package com.jvirdi.solitaire.datatype;

public enum Rank {

  ACE("Ace"), ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("5"), SEVEN("7"), EIGHT(
      "8"), NINE("9"), TEN("10"), JACK("Jack"), QUEEN("Queen"), KING("King");

  private final String value;

  Rank(String value) {
    this.value = value;
  }

  public String getShortName() {
    return value;
  }

}
