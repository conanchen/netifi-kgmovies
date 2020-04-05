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
public class UpdateOfferPayloadTuery extends Tuery<UpdateOfferPayloadTuery> {
    UpdateOfferPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class OfferArguments extends Arguments {
        OfferArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OfferArguments filter(OfferFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OfferArguments order(OfferOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OfferArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public OfferArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OfferArgumentsDefinition {
        void define(OfferArguments args);
    }

    /**
    * 
    */
    public UpdateOfferPayloadTuery offer(OfferTueryDefinition queryDef) {
        return offer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateOfferPayloadTuery offer(OfferArgumentsDefinition argsDef, OfferTueryDefinition queryDef) {
        startField("offer");

        OfferArguments args = new OfferArguments(_queryBuilder);
        argsDef.define(args);
        OfferArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OfferTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateOfferPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
