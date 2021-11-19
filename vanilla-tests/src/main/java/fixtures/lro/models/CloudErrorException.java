package fixtures.lro.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with CloudError information. */
public final class CloudErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the CloudErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public CloudErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the CloudErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public CloudErrorException(String message, HttpResponse response, CloudError value) {
        super(message, response, value);
    }

    @Override
    public CloudError getValue() {
        return (CloudError) super.getValue();
    }
}