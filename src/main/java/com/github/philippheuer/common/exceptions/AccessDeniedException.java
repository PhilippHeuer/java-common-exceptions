package com.github.philippheuer.common.exceptions;

/**
 * Access Denied
 */
public class AccessDeniedException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public AccessDeniedException(String errorCode, String errorMessage) {
        super(403, errorCode, errorMessage); // 403: Forbidden
    }

}
