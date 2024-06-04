package io.github.sidneiimatos.bank_application.exceptions;

import org.springframework.http.HttpStatus;

public class RequestException extends RuntimeException {
    private HttpStatus httpStatus;

    public RequestException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public RequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
