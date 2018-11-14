package com.github.philippheuer.common.exceptions;

/**
 * Deprecated
 */
public class DeprecatedException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public DeprecatedException(String errorCode, String errorMessage) {
        super(410, errorCode, errorMessage); // 410: Gone
    }

}
