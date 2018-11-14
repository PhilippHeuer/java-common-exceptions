package com.github.philippheuer.common.exceptions;

import lombok.Getter;
import org.apache.commons.lang3.exception.ContextedRuntimeException;

public class AbstractBaseException extends ContextedRuntimeException {

    /**
     * HTTP Status Code
     */
    @Getter
    private Integer httpStatusCode;

    /**
     * Internal Error Code
     */
    @Getter
    private String errorCode;

    /**
     * Error Message
     */
    @Getter
    private String errorMessage;

    /**
     * Constructor
     *
     * @param httpStatusCode HTTP Status Code
     * @param errorMessage   Error Message
     */
    public AbstractBaseException(Integer httpStatusCode, String errorCode, String errorMessage) {
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
