package com.pshakhlovich.solid.dependinv;

import java.io.IOException;

public class FormatException extends IOException {

    public FormatException(Exception cause) {
        super(cause);
    }
}
