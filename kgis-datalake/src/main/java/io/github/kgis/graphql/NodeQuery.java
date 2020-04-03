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
* An object with an ID
*/
public class NodeQuery extends Query<NodeQuery> {
    NodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The id of the thing.
    * The id: ID! in Thing means that an auto-generated ID by Dgraph will be used to identify things.
    */
    public NodeQuery id() {
        startField("id");

        return this;
    }

    public NodeQuery onCart(CartQueryDefinition queryDef) {
        startInlineFragment("Cart");
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCartItem(CartItemQueryDefinition queryDef) {
        startInlineFragment("CartItem");
        queryDef.define(new CartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCheckout(CheckoutQueryDefinition queryDef) {
        startInlineFragment("Checkout");
        queryDef.define(new CheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCheckoutItem(CheckoutItemQueryDefinition queryDef) {
        startInlineFragment("CheckoutItem");
        queryDef.define(new CheckoutItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onConversation(ConversationQueryDefinition queryDef) {
        startInlineFragment("Conversation");
        queryDef.define(new ConversationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDataCatalog(DataCatalogQueryDefinition queryDef) {
        startInlineFragment("DataCatalog");
        queryDef.define(new DataCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onEmployeeRole(EmployeeRoleQueryDefinition queryDef) {
        startInlineFragment("EmployeeRole");
        queryDef.define(new EmployeeRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onEntryPoint(EntryPointQueryDefinition queryDef) {
        startInlineFragment("EntryPoint");
        queryDef.define(new EntryPointQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFollowerRole(FollowerRoleQueryDefinition queryDef) {
        startInlineFragment("FollowerRole");
        queryDef.define(new FollowerRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onGeneralOrganization(GeneralOrganizationQueryDefinition queryDef) {
        startInlineFragment("GeneralOrganization");
        queryDef.define(new GeneralOrganizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMemberRole(MemberRoleQueryDefinition queryDef) {
        startInlineFragment("MemberRole");
        queryDef.define(new MemberRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMessage(MessageQueryDefinition queryDef) {
        startInlineFragment("Message");
        queryDef.define(new MessageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onNamespace(NamespaceQueryDefinition queryDef) {
        startInlineFragment("Namespace");
        queryDef.define(new NamespaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onOffer(OfferQueryDefinition queryDef) {
        startInlineFragment("Offer");
        queryDef.define(new OfferQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onOwnership(OwnershipQueryDefinition queryDef) {
        startInlineFragment("Ownership");
        queryDef.define(new OwnershipQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPartyRoleName(PartyRoleNameQueryDefinition queryDef) {
        startInlineFragment("PartyRoleName");
        queryDef.define(new PartyRoleNameQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPerson(PersonQueryDefinition queryDef) {
        startInlineFragment("Person");
        queryDef.define(new PersonQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPoder(PoderQueryDefinition queryDef) {
        startInlineFragment("Poder");
        queryDef.define(new PoderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPoderItem(PoderItemQueryDefinition queryDef) {
        startInlineFragment("PoderItem");
        queryDef.define(new PoderItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductModel(ProductModelQueryDefinition queryDef) {
        startInlineFragment("ProductModel");
        queryDef.define(new ProductModelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReadNote(ReadNoteQueryDefinition queryDef) {
        startInlineFragment("ReadNote");
        queryDef.define(new ReadNoteQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReview(ReviewQueryDefinition queryDef) {
        startInlineFragment("Review");
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSoftwareApplication(SoftwareApplicationQueryDefinition queryDef) {
        startInlineFragment("SoftwareApplication");
        queryDef.define(new SoftwareApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStore(StoreQueryDefinition queryDef) {
        startInlineFragment("Store");
        queryDef.define(new StoreQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUser(UserQueryDefinition queryDef) {
        startInlineFragment("User");
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onWebhook(WebhookQueryDefinition queryDef) {
        startInlineFragment("Webhook");
        queryDef.define(new WebhookQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
