package io.github.kgis.client;

import com.shopify.graphql.support.AbstractResponse;

import java.util.List;

public class GraphResponse<T extends AbstractResponse<T>> {


    public GraphResponse(T data, List<Error> errors) {
        this.data = data;
        this.errors = errors;
    }

    T data;

    /**
     * `GraphQL` operation errors.
     * <p>
     * These errors are not meant to be displayed to the end-user. **They are for debug purposes only**.
     */
    List<Error> errors;
}
