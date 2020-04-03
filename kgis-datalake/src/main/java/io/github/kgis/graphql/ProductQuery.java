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
* 产品
*/
public class ProductQuery extends Query<ProductQuery> {
    ProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
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
    public ProductQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProductQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public ProductQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ProductQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ProductQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ProductQuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public ProductQuery isShoppingable() {
        startField("isShoppingable");

        return this;
    }

    public class HasModelsArguments extends Arguments {
        HasModelsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasModelsArguments filter(ProductModelFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasModelsArguments order(ProductModelOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasModelsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasModelsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasModelsArgumentsDefinition {
        void define(HasModelsArguments args);
    }

    /**
    * 【型号】 产品的型号。
    */
    public ProductQuery hasModels(ProductModelQueryDefinition queryDef) {
        return hasModels(args -> {}, queryDef);
    }

    /**
    * 【型号】 产品的型号。
    */
    public ProductQuery hasModels(HasModelsArgumentsDefinition argsDef, ProductModelQueryDefinition queryDef) {
        startField("hasModels");

        HasModelsArguments args = new HasModelsArguments(_queryBuilder);
        argsDef.define(args);
        HasModelsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductModelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
