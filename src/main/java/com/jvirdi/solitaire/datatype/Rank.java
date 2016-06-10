package com.jvirdi.solitaire.datatype;

public enum Rank {
	
	ACE("Ace"), TEN("10");
	
	private final String value;

	Rank(String value){
		this.value=value;
	}
	
	public String getShortName(){
	 return value;
	}

}
