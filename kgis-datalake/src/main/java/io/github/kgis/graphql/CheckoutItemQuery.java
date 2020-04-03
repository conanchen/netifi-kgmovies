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
* A single line item in the checkout, grouped by variant and attributes.
* 结算单内容项
*/
public class CheckoutItemQuery extends Query<CheckoutItemQuery> {
    CheckoutItemQuery(StringBuilder _queryBuilder) {
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
    public CheckoutItemQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CheckoutItemQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public CheckoutItemQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public CheckoutItemQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public CheckoutItemQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public CheckoutItemQuery description() {
        startField("description");

        return this;
    }

    public class IsItemOfArguments extends Arguments {
        IsItemOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsItemOfArguments filter(CheckoutFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsItemOfArgumentsDefinition {
        void define(IsItemOfArguments args);
    }

    /**
    * 所属结算单
    */
    public CheckoutItemQuery isItemOf(CheckoutQueryDefinition queryDef) {
        return isItemOf(args -> {}, queryDef);
    }

    /**
    * 所属结算单
    */
    public CheckoutItemQuery isItemOf(IsItemOfArgumentsDefinition argsDef, CheckoutQueryDefinition queryDef) {
        startField("isItemOf");

        IsItemOfArguments args = new IsItemOfArguments(_queryBuilder);
        argsDef.define(args);
        IsItemOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the line item.
    */
    public CheckoutItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Product/Service variant of the line item.
    */
    public CheckoutItemQuery variant(ShoppingableQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ShoppingableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
