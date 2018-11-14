package com.github.philippheuer.common.exceptions;

/**
 * Validation
 */
public class ValidationException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public ValidationException(String errorCode, String errorMessage) {
        super(400, errorCode, errorMessage); // 400: Bad Request
    }

}
