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
public class AddEntryPointPayloadTuery extends Tuery<AddEntryPointPayloadTuery> {
    AddEntryPointPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class EntrypointArguments extends Arguments {
        EntrypointArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public EntrypointArguments filter(EntryPointFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EntrypointArguments order(EntryPointOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EntrypointArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public EntrypointArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EntrypointArgumentsDefinition {
        void define(EntrypointArguments args);
    }

    /**
    * 
    */
    public AddEntryPointPayloadTuery entrypoint(EntryPointTueryDefinition queryDef) {
        return entrypoint(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddEntryPointPayloadTuery entrypoint(EntrypointArgumentsDefinition argsDef, EntryPointTueryDefinition queryDef) {
        startField("entrypoint");

        EntrypointArguments args = new EntrypointArguments(_queryBuilder);
        argsDef.define(args);
        EntrypointArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EntryPointTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddEntryPointPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
