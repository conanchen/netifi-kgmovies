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
* https://schema.org/PoderItemAn poder item is a line of an poder. It includes the quantity and
* shipping details of a bought offer.购物订单内容项
*/
public class PoderItemTuery extends Tuery<PoderItemTuery> {
    PoderItemTuery(StringBuilder _queryBuilder) {
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
    public PoderItemTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PoderItemTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public PoderItemTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PoderItemTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PoderItemTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PoderItemTuery description() {
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
    *     partOfPoder    Poder    The overall poder the items in this delivery were included in.    
    */
    public PoderItemTuery isItemOf(PoderTueryDefinition queryDef) {
        return isItemOf(args -> {}, queryDef);
    }

    /**
    *     partOfPoder    Poder    The overall poder the items in this delivery were included in.    
    */
    public PoderItemTuery isItemOf(IsItemOfArgumentsDefinition argsDef, PoderTueryDefinition queryDef) {
        startField("isItemOf");

        IsItemOfArguments args = new IsItemOfArguments(_queryBuilder);
        argsDef.define(args);
        IsItemOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     poderItemNumber    Text    The identifier of the poder item.    
    */
    public PoderItemTuery poderItemNumber() {
        startField("poderItemNumber");

        return this;
    }

    /**
    *     poderItemStatus    PoderStatus    The current status of the poder item.    
    */
    public PoderItemTuery poderItemStatus() {
        startField("poderItemStatus");

        return this;
    }

    /**
    *     poderQuantity    Number    The number of the item podered. If the property is not set, assume
    * the quantity is one.    
    */
    public PoderItemTuery poderQuantity() {
        startField("poderQuantity");

        return this;
    }

    /**
    *     poderedItem    PoderItem  or Product  or Service    
    */
    public PoderItemTuery poderedItem(ShoppingableTueryDefinition queryDef) {
        startField("poderedItem");

        _queryBuilder.append('{');
        queryDef.define(new ShoppingableTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
