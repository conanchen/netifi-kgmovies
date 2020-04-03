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
* 商品供应
*/
public class OfferQuery extends Query<OfferQuery> {
    OfferQuery(StringBuilder _queryBuilder) {
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
    public OfferQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public OfferQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public OfferQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public OfferQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public OfferQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public OfferQuery description() {
        startField("description");

        return this;
    }

    /**
    * 可购物的一个商品供应
    */
    public OfferQuery itemOffered(ShoppingableQueryDefinition queryDef) {
        startField("itemOffered");

        _queryBuilder.append('{');
        queryDef.define(new ShoppingableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 供应商品的组织或个人 Inverse property: makesOffer.
    */
    public OfferQuery offeredBy(PartyQueryDefinition queryDef) {
        startField("offeredBy");

        _queryBuilder.append('{');
        queryDef.define(new PartyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 商品价格The offer price of a product, or of a price component when attached to PriceSpecification and
    * its subtypes.
    */
    public OfferQuery price() {
        startField("price");

        return this;
    }

    /**
    * 【价格有效开始日期】
    */
    public OfferQuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    * 【价格有效结束日期】
    */
    public OfferQuery dateThrough() {
        startField("dateThrough");

        return this;
    }
}
