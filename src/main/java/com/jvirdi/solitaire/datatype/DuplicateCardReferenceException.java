package com.jvirdi.solitaire.datatype;

public class DuplicateCardReferenceException extends RuntimeException {

	private static final long serialVersionUID = 2197615869367919891L;

	public DuplicateCardReferenceException(String message) {
		super(message);
	}

}
