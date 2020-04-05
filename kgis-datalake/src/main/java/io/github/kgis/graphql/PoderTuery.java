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
* https://schema.org/Poder An poder is a confirmation of a transaction (a receipt), which can contain
* multiple line items, each represented by an Offer that has been accepted by the
* customer.命名为Poder即是PurchaseOrder购物订单的意思,为了区分排序单词Order
*/
public class PoderTuery extends Tuery<PoderTuery> {
    PoderTuery(StringBuilder _queryBuilder) {
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
    public PoderTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PoderTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public PoderTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PoderTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PoderTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PoderTuery description() {
        startField("description");

        return this;
    }

    /**
    *     acceptedOffer    Offer    The offer(s) -- e.g., product, quantity and price combinations --
    * included in the poder.    billingAddress    PostalAddress    The billing address for the poder.   
    * broker    Organization  or Person    An entity that arranges for an exchange between a buyer and a
    * seller. In most cases a broker never acquires or releases ownership of a product or service involved
    * in an exchange. If it is not clear whether an entity is a broker, seller, or buyer, the latter two
    * terms are preferred. Supersedes bookingAgent.    
    */
    public PoderTuery broker(PartyTueryDefinition queryDef) {
        startField("broker");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     confirmationNumber    Text    A number that confirms the given poder or payment has been
    * received.    customer    Organization  or Person    Party placing the poder or paying the invoice.  
    */
    public PoderTuery customer(PartyTueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     discount    Number  or Text    Any discount applied (to an Poder).    discountCode    Text   
    * Code used to redeem a discount.    discountCurrency    Text    The currency of the discount.    Use
    * standard formats: ISO 4217 currency format e.g. "USD"; Ticker symbol for cryptocurrencies e.g.
    * "BTC"; well known names for Local Exchange Tradings Systems (LETS) and other currency types e.g.
    * "Ithaca HOUR".    isGift    Boolean    Was the offer accepted as a gift for someone other than the
    * buyer.    
    */
    public PoderTuery isGift() {
        startField("isGift");

        return this;
    }

    /**
    *     poderDate    DateTime  or DateTime    DateTime poder was placed.    
    */
    public PoderTuery poderDate() {
        startField("poderDate");

        return this;
    }

    /**
    *     poderNumber    Text    The identifier of the transaction.    
    */
    public PoderTuery poderNumber() {
        startField("poderNumber");

        return this;
    }

    /**
    *     poderStatus    PoderStatus    The current status of the poder.    
    */
    public PoderTuery poderStatus() {
        startField("poderStatus");

        return this;
    }

    public class ItemsArguments extends Arguments {
        ItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ItemsArguments filter(PoderItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ItemsArguments order(PoderItemOrder value) {
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
    *     poderedItem    PoderItem  or Product  or Service    The item podered.    
    */
    public PoderTuery items(PoderItemTueryDefinition queryDef) {
        return items(args -> {}, queryDef);
    }

    /**
    *     poderedItem    PoderItem  or Product  or Service    The item podered.    
    */
    public PoderTuery items(ItemsArgumentsDefinition argsDef, PoderItemTueryDefinition queryDef) {
        startField("items");

        ItemsArguments args = new ItemsArguments(_queryBuilder);
        argsDef.define(args);
        ItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     partOfInvoice    Invoice    The poder is being paid as part of the referenced Invoice.   
    * paymentDueDate    DateTime  or DateTime    The date that payment is due. Supersedes paymentDue.   
    * paymentMethod    PaymentMethod    The name of the credit card or other method of payment for the
    * poder.    paymentMethodId    Text    An identifier for the method of payment used (e.g. the last 4
    * digits of the credit card).    paymentUrl    URL    The URL for sending a payment.    seller   
    * Organization  or Person    An entity which offers (sells / leases / lends / loans) the services /
    * goods. A seller may also be a provider. Supersedes merchant, vendor.    
    */
    public PoderTuery seller(OrganizationTueryDefinition queryDef) {
        startField("seller");

        _queryBuilder.append('{');
        queryDef.define(new OrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
