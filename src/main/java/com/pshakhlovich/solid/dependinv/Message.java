package com.pshakhlovich.solid.dependinv;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {

    private final String msg;

    private final LocalDateTime timestamp;

    public Message(String msg) {
        this.msg = msg;
        this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
