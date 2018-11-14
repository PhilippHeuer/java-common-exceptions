package com.github.philippheuer.common.exceptions;

/**
 * Infinite Loop
 */
public class InfiniteLoopException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public InfiniteLoopException(String errorCode, String errorMessage) {
        super(508, errorCode, errorMessage); // 508: Loop Detected
    }

}
