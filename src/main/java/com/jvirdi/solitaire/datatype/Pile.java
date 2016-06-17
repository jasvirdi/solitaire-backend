package com.jvirdi.solitaire.datatype;

import java.util.ArrayList;
import java.util.List;

public class Pile {

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
