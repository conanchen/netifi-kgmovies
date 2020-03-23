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
public class UpdateProductModelPayloadQuery extends Query<UpdateProductModelPayloadQuery> {
    UpdateProductModelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ProductmodelArguments extends Arguments {
        ProductmodelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProductmodelArguments filter(ProductModelFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductmodelArguments order(ProductModelOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductmodelArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProductmodelArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductmodelArgumentsDefinition {
        void define(ProductmodelArguments args);
    }

    /**
    * 
    */
    public UpdateProductModelPayloadQuery productmodel(ProductModelQueryDefinition queryDef) {
        return productmodel(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateProductModelPayloadQuery productmodel(ProductmodelArgumentsDefinition argsDef, ProductModelQueryDefinition queryDef) {
        startField("productmodel");

        ProductmodelArguments args = new ProductmodelArguments(_queryBuilder);
        argsDef.define(args);
        ProductmodelArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductModelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateProductModelPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
