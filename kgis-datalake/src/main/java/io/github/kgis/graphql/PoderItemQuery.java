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
* https://schema.org/PoderItem
* An poder item is a line of an poder. It includes the quantity and shipping details of a bought
* offer.
* 购物订单内容项
*/
public class PoderItemQuery extends Query<PoderItemQuery> {
    PoderItemQuery(StringBuilder _queryBuilder) {
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
    public PoderItemQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PoderItemQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    public PoderItemQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PoderItemQuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PoderItemQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PoderItemQuery description() {
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
        public IsItemOfArguments filter(PoderFilter value) {
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
    * partOfPoder    Poder    The overall poder the items in this delivery were included in.
    */
    public PoderItemQuery isItemOf(PoderQueryDefinition queryDef) {
        return isItemOf(args -> {}, queryDef);
    }

    /**
    * partOfPoder    Poder    The overall poder the items in this delivery were included in.
    */
    public PoderItemQuery isItemOf(IsItemOfArgumentsDefinition argsDef, PoderQueryDefinition queryDef) {
        startField("isItemOf");

        IsItemOfArguments args = new IsItemOfArguments(_queryBuilder);
        argsDef.define(args);
        IsItemOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * poderItemNumber    Text    The identifier of the poder item.
    */
    public PoderItemQuery poderItemNumber() {
        startField("poderItemNumber");

        return this;
    }

    /**
    * poderItemStatus    PoderStatus    The current status of the poder item.
    */
    public PoderItemQuery poderItemStatus() {
        startField("poderItemStatus");

        return this;
    }

    /**
    * poderQuantity    Number    The number of the item podered. If the property is not set, assume the
    * quantity is one.
    */
    public PoderItemQuery poderQuantity() {
        startField("poderQuantity");

        return this;
    }

    /**
    * poderedItem    PoderItem  or Product  or Service
    */
    public PoderItemQuery poderedItem(ShoppingableQueryDefinition queryDef) {
        startField("poderedItem");

        _queryBuilder.append('{');
        queryDef.define(new ShoppingableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
