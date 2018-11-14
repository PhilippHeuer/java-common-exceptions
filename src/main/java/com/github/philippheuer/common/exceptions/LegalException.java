package com.github.philippheuer.common.exceptions;

/**
 * Legal
 * <p>
 * The server is denying access to the resource as a consequence of a legal demand.
 */
public class LegalException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public LegalException(String errorCode, String errorMessage) {
        super(451, errorCode, errorMessage); // 451: UNAVAILABLE FOR LEGAL REASONS
    }

}
