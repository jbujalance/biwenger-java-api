package org.biwenger.exception;

public class InvalidLoginException extends Exception {

    public InvalidLoginException() {
        super();
    }

    public InvalidLoginException(String pMessage) {
        super(pMessage);
    }

    public InvalidLoginException(String pMessage, Throwable pThrowable) {
        super(pMessage, pThrowable);
    }
}
