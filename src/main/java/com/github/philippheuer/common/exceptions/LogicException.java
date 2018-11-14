package com.github.philippheuer.common.exceptions;

/**
 * Logic
 * <p>
 * We encountered an unexpected condition.
 */
public class LogicException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public LogicException(String errorCode, String errorMessage) {
        super(500, errorCode, errorMessage); // 500: INTERNAL SERVER ERROR
    }

}
