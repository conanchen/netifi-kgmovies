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
public class AddPoderPayloadQuery extends Query<AddPoderPayloadQuery> {
    AddPoderPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PoderArguments extends Arguments {
        PoderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PoderArguments filter(PoderFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderArguments order(PoderOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PoderArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PoderArgumentsDefinition {
        void define(PoderArguments args);
    }

    /**
    * 
    */
    public AddPoderPayloadQuery poder(PoderQueryDefinition queryDef) {
        return poder(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddPoderPayloadQuery poder(PoderArgumentsDefinition argsDef, PoderQueryDefinition queryDef) {
        startField("poder");

        PoderArguments args = new PoderArguments(_queryBuilder);
        argsDef.define(args);
        PoderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddPoderPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
