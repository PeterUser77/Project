package br.edu.udf.bdadvanced.exception;

public class AuthenticationException extends IllegalArgumentException {

    public AuthenticationException(String message) {
        super(message);
    }
}
