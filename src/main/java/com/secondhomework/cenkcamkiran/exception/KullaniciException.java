package com.secondhomework.cenkcamkiran.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class KullaniciException extends RuntimeException {

    public KullaniciException(String message) {
        super(message);
    }

}
