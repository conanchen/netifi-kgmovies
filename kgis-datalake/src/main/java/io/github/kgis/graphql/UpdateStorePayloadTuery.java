// Generated from graphql_java_gen gem  with template Tuery.java.erb

package io.github.kgis.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
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
public class UpdateStorePayloadTuery extends Tuery<UpdateStorePayloadTuery> {
    UpdateStorePayloadTuery(StringBuilder _queryBuilder) {
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
    public UpdateStorePayloadTuery store(StoreTueryDefinition queryDef) {
        return store(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateStorePayloadTuery store(StoreArgumentsDefinition argsDef, StoreTueryDefinition queryDef) {
        startField("store");

        StoreArguments args = new StoreArguments(_queryBuilder);
        argsDef.define(args);
        StoreArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateStorePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
