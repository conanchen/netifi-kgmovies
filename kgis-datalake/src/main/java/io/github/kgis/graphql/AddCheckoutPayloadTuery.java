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
public class AddCheckoutPayloadTuery extends Tuery<AddCheckoutPayloadTuery> {
    AddCheckoutPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CheckoutArguments extends Arguments {
        CheckoutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CheckoutArguments filter(CheckoutFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutArguments order(CheckoutOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CheckoutArgumentsDefinition {
        void define(CheckoutArguments args);
    }

    /**
    * 
    */
    public AddCheckoutPayloadTuery checkout(CheckoutTueryDefinition queryDef) {
        return checkout(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCheckoutPayloadTuery checkout(CheckoutArgumentsDefinition argsDef, CheckoutTueryDefinition queryDef) {
        startField("checkout");

        CheckoutArguments args = new CheckoutArguments(_queryBuilder);
        argsDef.define(args);
        CheckoutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddCheckoutPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
