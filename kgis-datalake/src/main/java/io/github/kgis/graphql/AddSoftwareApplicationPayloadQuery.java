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
public class AddSoftwareApplicationPayloadQuery extends Query<AddSoftwareApplicationPayloadQuery> {
    AddSoftwareApplicationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class SoftwareapplicationArguments extends Arguments {
        SoftwareapplicationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SoftwareapplicationArguments filter(SoftwareApplicationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SoftwareapplicationArguments order(SoftwareApplicationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SoftwareapplicationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SoftwareapplicationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SoftwareapplicationArgumentsDefinition {
        void define(SoftwareapplicationArguments args);
    }

    /**
    * 
    */
    public AddSoftwareApplicationPayloadQuery softwareapplication(SoftwareApplicationQueryDefinition queryDef) {
        return softwareapplication(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddSoftwareApplicationPayloadQuery softwareapplication(SoftwareapplicationArgumentsDefinition argsDef, SoftwareApplicationQueryDefinition queryDef) {
        startField("softwareapplication");

        SoftwareapplicationArguments args = new SoftwareapplicationArguments(_queryBuilder);
        argsDef.define(args);
        SoftwareapplicationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SoftwareApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddSoftwareApplicationPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
