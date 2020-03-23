// Generated from graphql_java_gen gem

package io.github.kgis.client;

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
public class UpdateProductPayloadQuery extends Query<UpdateProductPayloadQuery> {
    UpdateProductPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ProductArguments extends Arguments {
        ProductArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProductArguments filter(ProductFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductArguments order(ProductOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProductArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductArgumentsDefinition {
        void define(ProductArguments args);
    }

    /**
    * 
    */
    public UpdateProductPayloadQuery product(ProductQueryDefinition queryDef) {
        return product(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateProductPayloadQuery product(ProductArgumentsDefinition argsDef, ProductQueryDefinition queryDef) {
        startField("product");

        ProductArguments args = new ProductArguments(_queryBuilder);
        argsDef.define(args);
        ProductArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateProductPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
