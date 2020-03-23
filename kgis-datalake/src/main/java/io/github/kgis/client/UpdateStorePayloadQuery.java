// Generated from graphql_java_gen gem

package io.github.kgis.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 
*/
public class UpdateStorePayloadQuery extends Query<UpdateStorePayloadQuery> {
    UpdateStorePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class StoreArguments extends Arguments {
        StoreArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public StoreArguments filter(StoreFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoreArguments order(StoreOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoreArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public StoreArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StoreArgumentsDefinition {
        void define(StoreArguments args);
    }

    /**
    * 
    */
    public UpdateStorePayloadQuery store(StoreQueryDefinition queryDef) {
        return store(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateStorePayloadQuery store(StoreArgumentsDefinition argsDef, StoreQueryDefinition queryDef) {
        startField("store");

        StoreArguments args = new StoreArguments(_queryBuilder);
        argsDef.define(args);
        StoreArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateStorePayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
