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
* 产品型号
*/
public class ProductModelQuery extends Query<ProductModelQuery> {
    ProductModelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public ProductModelQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProductModelQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public ProductModelQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ProductModelQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ProductModelQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ProductModelQuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public ProductModelQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public ProductModelQuery isShoppingable() {
        startField("isShoppingable");

        return this;
    }

    public class IsModelOfArguments extends Arguments {
        IsModelOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsModelOfArguments filter(ProductFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsModelOfArgumentsDefinition {
        void define(IsModelOfArguments args);
    }

    /**
    *     【产品】 所属产品。    
    */
    public ProductModelQuery isModelOf(ProductQueryDefinition queryDef) {
        return isModelOf(args -> {}, queryDef);
    }

    /**
    *     【产品】 所属产品。    
    */
    public ProductModelQuery isModelOf(IsModelOfArgumentsDefinition argsDef, ProductQueryDefinition queryDef) {
        startField("isModelOf");

        IsModelOfArguments args = new IsModelOfArguments(_queryBuilder);
        argsDef.define(args);
        IsModelOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
