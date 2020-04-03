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
public class AddNamespacePayloadQuery extends Query<AddNamespacePayloadQuery> {
    AddNamespacePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class NamespaceArguments extends Arguments {
        NamespaceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespaceArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespaceArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespaceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespaceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespaceArgumentsDefinition {
        void define(NamespaceArguments args);
    }

    /**
    * 
    */
    public AddNamespacePayloadQuery namespace(NamespaceQueryDefinition queryDef) {
        return namespace(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddNamespacePayloadQuery namespace(NamespaceArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("namespace");

        NamespaceArguments args = new NamespaceArguments(_queryBuilder);
        argsDef.define(args);
        NamespaceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddNamespacePayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
