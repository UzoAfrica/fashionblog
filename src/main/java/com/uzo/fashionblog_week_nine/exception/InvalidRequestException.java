package com.uzo.fashionblog_week_nine.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvalidRequestException extends RuntimeException {

    private String debugMessage;

    public InvalidRequestException(String message) {
        super(message);
    }

    public InvalidRequestException(String message, String debugMessage) {
        super(message);
        this.debugMessage = debugMessage;
    }
}

