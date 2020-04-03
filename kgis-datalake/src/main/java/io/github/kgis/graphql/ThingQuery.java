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
* A Thing with an ID，在KGIS平台内所有内容都是东西Thing,也就是资源Resource
*/
public class ThingQuery extends Query<ThingQuery> {
    ThingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
    * 资源对象所属的namespaces
    */
    public ThingQuery namespaces(NamespaceQueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 资源对象所属的namespaces
    */
    public ThingQuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceQueryDefinition queryDef) {
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
    * 【标识符】 标识符 The identifier property represents any kind of identifier for any kind of Thing, such as
    * ISBNs, GTIN codes, UUIDs etc.
    */
    public ThingQuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 【名称】name    Text    The name of the item.
    */
    public ThingQuery name() {
        startField("name");

        return this;
    }

    /**
    * 【别名】 该项的别名。 An alias for the item.
    */
    public ThingQuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 【描述】 该项的一个简单描述。 A description of the item.
    */
    public ThingQuery description() {
        startField("description");

        return this;
    }

    public ThingQuery onCart(CartQueryDefinition queryDef) {
        startInlineFragment("Cart");
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onCartItem(CartItemQueryDefinition queryDef) {
        startInlineFragment("CartItem");
        queryDef.define(new CartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onCheckout(CheckoutQueryDefinition queryDef) {
        startInlineFragment("Checkout");
        queryDef.define(new CheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onCheckoutItem(CheckoutItemQueryDefinition queryDef) {
        startInlineFragment("CheckoutItem");
        queryDef.define(new CheckoutItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onConversation(ConversationQueryDefinition queryDef) {
        startInlineFragment("Conversation");
        queryDef.define(new ConversationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onDataCatalog(DataCatalogQueryDefinition queryDef) {
        startInlineFragment("DataCatalog");
        queryDef.define(new DataCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onEmployeeRole(EmployeeRoleQueryDefinition queryDef) {
        startInlineFragment("EmployeeRole");
        queryDef.define(new EmployeeRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onEntryPoint(EntryPointQueryDefinition queryDef) {
        startInlineFragment("EntryPoint");
        queryDef.define(new EntryPointQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onFollowerRole(FollowerRoleQueryDefinition queryDef) {
        startInlineFragment("FollowerRole");
        queryDef.define(new FollowerRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onGeneralOrganization(GeneralOrganizationQueryDefinition queryDef) {
        startInlineFragment("GeneralOrganization");
        queryDef.define(new GeneralOrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onMemberRole(MemberRoleQueryDefinition queryDef) {
        startInlineFragment("MemberRole");
        queryDef.define(new MemberRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onMessage(MessageQueryDefinition queryDef) {
        startInlineFragment("Message");
        queryDef.define(new MessageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onNamespace(NamespaceQueryDefinition queryDef) {
        startInlineFragment("Namespace");
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onOffer(OfferQueryDefinition queryDef) {
        startInlineFragment("Offer");
        queryDef.define(new OfferQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onOwnership(OwnershipQueryDefinition queryDef) {
        startInlineFragment("Ownership");
        queryDef.define(new OwnershipQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onPartyRoleName(PartyRoleNameQueryDefinition queryDef) {
        startInlineFragment("PartyRoleName");
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onPerson(PersonQueryDefinition queryDef) {
        startInlineFragment("Person");
        queryDef.define(new PersonQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onPoder(PoderQueryDefinition queryDef) {
        startInlineFragment("Poder");
        queryDef.define(new PoderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onPoderItem(PoderItemQueryDefinition queryDef) {
        startInlineFragment("PoderItem");
        queryDef.define(new PoderItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onProductModel(ProductModelQueryDefinition queryDef) {
        startInlineFragment("ProductModel");
        queryDef.define(new ProductModelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onReadNote(ReadNoteQueryDefinition queryDef) {
        startInlineFragment("ReadNote");
        queryDef.define(new ReadNoteQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onReview(ReviewQueryDefinition queryDef) {
        startInlineFragment("Review");
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onSoftwareApplication(SoftwareApplicationQueryDefinition queryDef) {
        startInlineFragment("SoftwareApplication");
        queryDef.define(new SoftwareApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onStore(StoreQueryDefinition queryDef) {
        startInlineFragment("Store");
        queryDef.define(new StoreQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onUser(UserQueryDefinition queryDef) {
        startInlineFragment("User");
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ThingQuery onWebhook(WebhookQueryDefinition queryDef) {
        startInlineFragment("Webhook");
        queryDef.define(new WebhookQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
