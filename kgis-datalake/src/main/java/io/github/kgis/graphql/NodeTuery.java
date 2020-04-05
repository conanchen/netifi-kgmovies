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
* An object with an ID
*/
public class NodeTuery extends Tuery<NodeTuery> {
    NodeTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    *     The id of the thing.    The id: ID! in Thing means that an auto-generated ID by Dgraph will be
    * used to identify things.    
    */
    public NodeTuery id() {
        startField("id");

        return this;
    }

    public NodeTuery onCart(CartTueryDefinition queryDef) {
        startInlineFragment("Cart");
        queryDef.define(new CartTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onCartItem(CartItemTueryDefinition queryDef) {
        startInlineFragment("CartItem");
        queryDef.define(new CartItemTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onCheckout(CheckoutTueryDefinition queryDef) {
        startInlineFragment("Checkout");
        queryDef.define(new CheckoutTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onCheckoutItem(CheckoutItemTueryDefinition queryDef) {
        startInlineFragment("CheckoutItem");
        queryDef.define(new CheckoutItemTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onConversation(ConversationTueryDefinition queryDef) {
        startInlineFragment("Conversation");
        queryDef.define(new ConversationTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onDataCatalog(DataCatalogTueryDefinition queryDef) {
        startInlineFragment("DataCatalog");
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onEmployeeRole(EmployeeRoleTueryDefinition queryDef) {
        startInlineFragment("EmployeeRole");
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onEntryPoint(EntryPointTueryDefinition queryDef) {
        startInlineFragment("EntryPoint");
        queryDef.define(new EntryPointTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onFollowerRole(FollowerRoleTueryDefinition queryDef) {
        startInlineFragment("FollowerRole");
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onGeneralOrganization(GeneralOrganizationTueryDefinition queryDef) {
        startInlineFragment("GeneralOrganization");
        queryDef.define(new GeneralOrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onMemberRole(MemberRoleTueryDefinition queryDef) {
        startInlineFragment("MemberRole");
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onMessage(MessageTueryDefinition queryDef) {
        startInlineFragment("Message");
        queryDef.define(new MessageTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onNamespace(NamespaceTueryDefinition queryDef) {
        startInlineFragment("Namespace");
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onOffer(OfferTueryDefinition queryDef) {
        startInlineFragment("Offer");
        queryDef.define(new OfferTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onOwnership(OwnershipTueryDefinition queryDef) {
        startInlineFragment("Ownership");
        queryDef.define(new OwnershipTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onPartyRoleName(PartyRoleNameTueryDefinition queryDef) {
        startInlineFragment("PartyRoleName");
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onPerson(PersonTueryDefinition queryDef) {
        startInlineFragment("Person");
        queryDef.define(new PersonTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onPoder(PoderTueryDefinition queryDef) {
        startInlineFragment("Poder");
        queryDef.define(new PoderTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onPoderItem(PoderItemTueryDefinition queryDef) {
        startInlineFragment("PoderItem");
        queryDef.define(new PoderItemTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onProduct(ProductTueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onProductModel(ProductModelTueryDefinition queryDef) {
        startInlineFragment("ProductModel");
        queryDef.define(new ProductModelTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onReadNote(ReadNoteTueryDefinition queryDef) {
        startInlineFragment("ReadNote");
        queryDef.define(new ReadNoteTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onReview(ReviewTueryDefinition queryDef) {
        startInlineFragment("Review");
        queryDef.define(new ReviewTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onSoftwareApplication(SoftwareApplicationTueryDefinition queryDef) {
        startInlineFragment("SoftwareApplication");
        queryDef.define(new SoftwareApplicationTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onStore(StoreTueryDefinition queryDef) {
        startInlineFragment("Store");
        queryDef.define(new StoreTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onUser(UserTueryDefinition queryDef) {
        startInlineFragment("User");
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeTuery onWebhook(WebhookTueryDefinition queryDef) {
        startInlineFragment("Webhook");
        queryDef.define(new WebhookTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
