package com.github.philippheuer.common.exceptions;

/**
 * Configuration
 * <p>
 * A wrong/bad configuration is preventing us from completing the call.
 */
public class ConfigurationException extends AbstractBaseException {

    /**
     * Constructor
     *
     * @param errorCode    The internal error code
     * @param errorMessage The error message
     */
    public ConfigurationException(String errorCode, String errorMessage) {
        super(500, errorCode, errorMessage); // 500: INTERNAL SERVER ERROR
    }

}
