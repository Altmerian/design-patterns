package com.pshakhlovich.solid.dependinv;

public interface Formatter {

    String format(Message message) throws FormatException;

}
