package br.com.erudio.restwithspringbootandjava.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsopportedMathOperationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

}
