package com.secondhomework.cenkcamkiran.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UrunException extends RuntimeException {

    public UrunException(String message) {
        super(message);
    }

}
