package io.github.kgis.client;

import okhttp3.Response;

public class GraphError extends Exception {


    GraphError(String message, Throwable cause) {

        super(message, cause);
    }


    public class NetworkError extends GraphError {
        NetworkError(String message, Throwable cause) {
            super(message, cause);
        }
    }


    /**
     * Error when HTTP response status code is not from {@code 200} series.
     */

    public static class HttpError extends GraphError {
        HttpError(Response response) {
            super("HTTP : " + response.code(), new Throwable(response.message()));
        }
    }


    /**
     * Error when `GraphQL` operation execution was canceled.
     */


    public static class CallCanceledError extends GraphError {
        CallCanceledError(String message, Throwable cause) {
            super(message, cause);
        }

    }


    /**
     * Error when `GraphQL` operation was successfully executed but http response is malformed and can't be parsed.
     */


    public static class ParseError extends GraphError {

        ParseError(String message, Throwable cause) {
            super(message, cause);
        }
    }


    /**
     * Unknown error encountered during the `GraphQL` operation execution.
     */

    public static class Unknown extends GraphError {
        Unknown(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
