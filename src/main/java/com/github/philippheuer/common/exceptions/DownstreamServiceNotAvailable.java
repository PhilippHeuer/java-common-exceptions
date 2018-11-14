package com.github.philippheuer.common.exceptions;

/**
 * Downstream Service Not Available
 */
public class DownstreamServiceNotAvailable extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public DownstreamServiceNotAvailable(String errorCode, String errorMessage) {
        super(504, errorCode, errorMessage); // 504: Gateway Timeout
    }

}
