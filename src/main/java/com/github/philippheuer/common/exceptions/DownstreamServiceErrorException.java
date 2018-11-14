package com.github.philippheuer.common.exceptions;

/**
 * Downstream Service Error
 */
public class DownstreamServiceErrorException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param httpErrorCode Http Error Code
     * @param serviceId     Service Id
     * @param errorCode     The internal error code
     * @param errorMessage  The error message
     */
    public DownstreamServiceErrorException(Integer httpErrorCode, String serviceId, String errorCode, String errorMessage) {
        super(httpErrorCode, errorCode, errorMessage);
        addContextValue("serviceId", serviceId);
    }

}
