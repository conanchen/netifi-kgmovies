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
public class UpdateCartPayloadTuery extends Tuery<UpdateCartPayloadTuery> {
    UpdateCartPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CartArguments extends Arguments {
        CartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CartArguments filter(CartFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartArguments order(CartOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CartArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CartArgumentsDefinition {
        void define(CartArguments args);
    }

    /**
    * 
    */
    public UpdateCartPayloadTuery cart(CartTueryDefinition queryDef) {
        return cart(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCartPayloadTuery cart(CartArgumentsDefinition argsDef, CartTueryDefinition queryDef) {
        startField("cart");

        CartArguments args = new CartArguments(_queryBuilder);
        argsDef.define(args);
        CartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateCartPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
