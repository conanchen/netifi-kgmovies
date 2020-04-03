// Generated from graphql_java_gen gem

package io.github.kgis.graphql;

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
public class UpdateThingPayloadQuery extends Query<UpdateThingPayloadQuery> {
    UpdateThingPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ThingArguments extends Arguments {
        ThingArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ThingArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ThingArguments order(ThingOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ThingArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ThingArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ThingArgumentsDefinition {
        void define(ThingArguments args);
    }

    /**
    * 
    */
    public UpdateThingPayloadQuery thing(ThingQueryDefinition queryDef) {
        return thing(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateThingPayloadQuery thing(ThingArgumentsDefinition argsDef, ThingQueryDefinition queryDef) {
        startField("thing");

        ThingArguments args = new ThingArguments(_queryBuilder);
        argsDef.define(args);
        ThingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateThingPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
