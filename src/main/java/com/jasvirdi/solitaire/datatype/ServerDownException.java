package com.jasvirdi.solitaire.datatype;

public class ServerDownException extends Exception {

  private static final long serialVersionUID = -1364901627721404473L;

  public ServerDownException(String message, RuntimeException e) {
    super(message, e);

  }

}
