// Generated from graphql_java_gen gem

package com.shopify.graphql.support;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedMinimal {
    public static TueryRootTuery query(TueryRootTueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("{");
        TueryRootTuery query = new TueryRootTuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }

    public static class TueryResponse {
        private TopLevelResponse response;
        private TueryRoot data;

        public TueryResponse(TopLevelResponse response) throws SchemaViolationError {
            this.response = response;
            this.data = response.getData() != null ? new TueryRoot(response.getData()) : null;
        }

        public TueryRoot getData() {
            return data;
        }

        public List<Error> getErrors() {
            return response.getErrors();
        }

        public String toJson() {
            return new Gson().toJson(response);
        }

        public String prettyPrintJson() {
            final Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(response);
        }

        public static TueryResponse fromJson(String json) throws SchemaViolationError {
            final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
            return new TueryResponse(response);
        }
    }

    public interface TueryRootTueryDefinition {
        void define(TueryRootTuery _queryBuilder);
    }

    public static class TueryRootTuery extends Tuery<TueryRootTuery> {
        TueryRootTuery(StringBuilder _queryBuilder) {
            super(_queryBuilder);
        }

        public TueryRootTuery version() {
            startField("version");

            return this;
        }

        public String toString() {
            return _queryBuilder.toString();
        }
    }

    public static class TueryRoot extends AbstractResponse<TueryRoot> {
        public TueryRoot() {
        }

        public TueryRoot(JsonObject fields) throws SchemaViolationError {
            for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
                String key = field.getKey();
                String fieldName = getFieldName(key);
                switch (fieldName) {
                    case "version": {
                        String optional1 = null;
                        if (!field.getValue().isJsonNull()) {
                            optional1 = jsonAsString(field.getValue(), key);
                        }

                        responseData.put(key, optional1);

                        break;
                    }

                    case "__typename": {
                        responseData.put(key, jsonAsString(field.getValue(), key));
                        break;
                    }
                    default: {
                        throw new SchemaViolationError(this, key, field.getValue());
                    }
                }
            }
        }

        public String getGraphQlTypeName() {
            return "TueryRoot";
        }

        public String getVersion() {
            return (String) get("version");
        }

        public TueryRoot setVersion(String arg) {
            optimisticData.put(getKey("version"), arg);
            return this;
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                case "version": return false;

                default: return false;
            }
        }
    }
}
