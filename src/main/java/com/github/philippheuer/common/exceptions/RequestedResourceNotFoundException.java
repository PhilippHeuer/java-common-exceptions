package com.github.philippheuer.common.exceptions;

/**
 * Requested Resource Not Found
 */
public class RequestedResourceNotFoundException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public RequestedResourceNotFoundException(String errorCode, String errorMessage) {
        super(404, errorCode, errorMessage); // 410: Gone
    }

}
