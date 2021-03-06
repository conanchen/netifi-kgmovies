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
public class UpdateOwnershipPayloadTuery extends Tuery<UpdateOwnershipPayloadTuery> {
    UpdateOwnershipPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class OwnershipArguments extends Arguments {
        OwnershipArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnershipArguments filter(OwnershipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnershipArguments order(OwnershipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnershipArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public OwnershipArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OwnershipArgumentsDefinition {
        void define(OwnershipArguments args);
    }

    /**
    * 
    */
    public UpdateOwnershipPayloadTuery ownership(OwnershipTueryDefinition queryDef) {
        return ownership(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateOwnershipPayloadTuery ownership(OwnershipArgumentsDefinition argsDef, OwnershipTueryDefinition queryDef) {
        startField("ownership");

        OwnershipArguments args = new OwnershipArguments(_queryBuilder);
        argsDef.define(args);
        OwnershipArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OwnershipTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateOwnershipPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
