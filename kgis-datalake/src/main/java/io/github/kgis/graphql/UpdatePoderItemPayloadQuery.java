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
public class UpdatePoderItemPayloadQuery extends Query<UpdatePoderItemPayloadQuery> {
    UpdatePoderItemPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PoderitemArguments extends Arguments {
        PoderitemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PoderitemArguments filter(PoderItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderitemArguments order(PoderItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderitemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PoderitemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PoderitemArgumentsDefinition {
        void define(PoderitemArguments args);
    }

    /**
    * 
    */
    public UpdatePoderItemPayloadQuery poderitem(PoderItemQueryDefinition queryDef) {
        return poderitem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdatePoderItemPayloadQuery poderitem(PoderitemArgumentsDefinition argsDef, PoderItemQueryDefinition queryDef) {
        startField("poderitem");

        PoderitemArguments args = new PoderitemArguments(_queryBuilder);
        argsDef.define(args);
        PoderitemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdatePoderItemPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
