package com.jamierf.sony.bravia.client.error;

public class CommunicationException extends RuntimeException {

    public CommunicationException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
