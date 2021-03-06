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
* Checkout:A container for all the information required to checkout items and
* pay.结算单，包含需要结算和支付的所有信息：税收、送货地址、发票账单寄送地址、备注说明等结算单信息完备后才可以创建订单
*/
public class CheckoutTuery extends Tuery<CheckoutTuery> {
    CheckoutTuery(StringBuilder _queryBuilder) {
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
    public CheckoutTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CheckoutTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public CheckoutTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public CheckoutTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public CheckoutTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public CheckoutTuery description() {
        startField("description");

        return this;
    }

    public class OwnerArguments extends Arguments {
        OwnerArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnerArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface OwnerArgumentsDefinition {
        void define(OwnerArguments args);
    }

    /**
    *     结算单所有者    
    */
    public CheckoutTuery owner(UserTueryDefinition queryDef) {
        return owner(args -> {}, queryDef);
    }

    /**
    *     结算单所有者    
    */
    public CheckoutTuery owner(OwnerArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("owner");

        OwnerArguments args = new OwnerArguments(_queryBuilder);
        argsDef.define(args);
        OwnerArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     The date and time when the checkout was completed.    
    */
    public CheckoutTuery completedAt() {
        startField("completedAt");

        return this;
    }

    /**
    *     The date and time when the checkout was created.    
    */
    public CheckoutTuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    *     The email attached to this checkout.    
    */
    public CheckoutTuery email() {
        startField("email");

        return this;
    }

    public class ItemsArguments extends Arguments {
        ItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ItemsArguments filter(CheckoutItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ItemsArguments order(CheckoutItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ItemsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ItemsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ItemsArgumentsDefinition {
        void define(ItemsArguments args);
    }

    /**
    *     A list of line item objects, each one containing information about an item in the checkout.    
    */
    public CheckoutTuery items(CheckoutItemTueryDefinition queryDef) {
        return items(args -> {}, queryDef);
    }

    /**
    *     A list of line item objects, each one containing information about an item in the checkout.    
    */
    public CheckoutTuery items(ItemsArgumentsDefinition argsDef, CheckoutItemTueryDefinition queryDef) {
        startField("items");

        ItemsArguments args = new ItemsArguments(_queryBuilder);
        argsDef.define(args);
        ItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     The note associated with the checkout.    
    */
    public CheckoutTuery note() {
        startField("note");

        return this;
    }

    /**
    *     Whether or not the Checkout is ready and can be completed. Checkouts may have asynchronous
    * operations that can take time to finish. If you want to complete a checkout or ensure all the fields
    * are populated and up to date, polling is required until the value is true.    
    */
    public CheckoutTuery ready() {
        startField("ready");

        return this;
    }

    /**
    *     States whether or not the fulfillment requires shipping.    
    */
    public CheckoutTuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    *     The date and time when the checkout was last updated.    
    */
    public CheckoutTuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
