// Generated from graphql_java_gen gem  with template Input.java.erb

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

public class AddWebhookInput implements Serializable {
    private String name;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> payloadUrl = Input.undefined();

    private Input<String> contentType = Input.undefined();

    private Input<String> secret = Input.undefined();

    private Input<UserRef> creator = Input.undefined();

    private Input<DateTime> dateCreated = Input.undefined();

    private Input<SoftwareApplicationRef> client = Input.undefined();

    public AddWebhookInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddWebhookInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddWebhookInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddWebhookInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
        if (namespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespaces = namespaces;
        return this;
    }

    public String getIdentifier() {
        return identifier.getValue();
    }

    public Input<String> getIdentifierInput() {
        return identifier;
    }

    public AddWebhookInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddWebhookInput setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public AddWebhookInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddWebhookInput setAlternateNameInput(Input<String> alternateName) {
        if (alternateName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alternateName = alternateName;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public AddWebhookInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddWebhookInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getPayloadUrl() {
        return payloadUrl.getValue();
    }

    public Input<String> getPayloadUrlInput() {
        return payloadUrl;
    }

    public AddWebhookInput setPayloadUrl(String payloadUrl) {
        this.payloadUrl = Input.optional(payloadUrl);
        return this;
    }

    public AddWebhookInput setPayloadUrlInput(Input<String> payloadUrl) {
        if (payloadUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.payloadUrl = payloadUrl;
        return this;
    }

    public String getContentType() {
        return contentType.getValue();
    }

    public Input<String> getContentTypeInput() {
        return contentType;
    }

    public AddWebhookInput setContentType(String contentType) {
        this.contentType = Input.optional(contentType);
        return this;
    }

    public AddWebhookInput setContentTypeInput(Input<String> contentType) {
        if (contentType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.contentType = contentType;
        return this;
    }

    public String getSecret() {
        return secret.getValue();
    }

    public Input<String> getSecretInput() {
        return secret;
    }

    public AddWebhookInput setSecret(String secret) {
        this.secret = Input.optional(secret);
        return this;
    }

    public AddWebhookInput setSecretInput(Input<String> secret) {
        if (secret == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.secret = secret;
        return this;
    }

    public UserRef getCreator() {
        return creator.getValue();
    }

    public Input<UserRef> getCreatorInput() {
        return creator;
    }

    public AddWebhookInput setCreator(UserRef creator) {
        this.creator = Input.optional(creator);
        return this;
    }

    public AddWebhookInput setCreatorInput(Input<UserRef> creator) {
        if (creator == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.creator = creator;
        return this;
    }

    public DateTime getDateCreated() {
        return dateCreated.getValue();
    }

    public Input<DateTime> getDateCreatedInput() {
        return dateCreated;
    }

    public AddWebhookInput setDateCreated(DateTime dateCreated) {
        this.dateCreated = Input.optional(dateCreated);
        return this;
    }

    public AddWebhookInput setDateCreatedInput(Input<DateTime> dateCreated) {
        if (dateCreated == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateCreated = dateCreated;
        return this;
    }

    public SoftwareApplicationRef getClient() {
        return client.getValue();
    }

    public Input<SoftwareApplicationRef> getClientInput() {
        return client;
    }

    public AddWebhookInput setClient(SoftwareApplicationRef client) {
        this.client = Input.optional(client);
        return this;
    }

    public AddWebhookInput setClientInput(Input<SoftwareApplicationRef> client) {
        if (client == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.client = client;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Tuery.appendQuotedString(_queryBuilder, name.toString());

        if (this.namespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespaces:");
            if (namespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : namespaces.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.identifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("identifier:");
            if (identifier.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, identifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alternateName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateName:");
            if (alternateName.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, alternateName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.payloadUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("payloadUrl:");
            if (payloadUrl.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, payloadUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.contentType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("contentType:");
            if (contentType.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, contentType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.secret.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("secret:");
            if (secret.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, secret.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.creator.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("creator:");
            if (creator.getValue() != null) {
                creator.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateCreated.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateCreated:");
            if (dateCreated.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateCreated.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.client.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("client:");
            if (client.getValue() != null) {
                client.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
