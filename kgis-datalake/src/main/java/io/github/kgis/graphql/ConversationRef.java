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

public class ConversationRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<UserRef> accountablePerson = Input.undefined();

    private Input<UserRef> creator = Input.undefined();

    private Input<DateTime> dateCreated = Input.undefined();

    private Input<DataCatalogRef> includedInDataCatalog = Input.undefined();

    private Input<List<MessageRef>> hasMessages = Input.undefined();

    private Input<List<WebhookRef>> webhook = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ConversationRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ConversationRef setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public ConversationRef setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public ConversationRef setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public ConversationRef setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public ConversationRef setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public ConversationRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public ConversationRef setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public ConversationRef setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public ConversationRef setAlternateNameInput(Input<String> alternateName) {
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

    public ConversationRef setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public ConversationRef setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public UserRef getAccountablePerson() {
        return accountablePerson.getValue();
    }

    public Input<UserRef> getAccountablePersonInput() {
        return accountablePerson;
    }

    public ConversationRef setAccountablePerson(UserRef accountablePerson) {
        this.accountablePerson = Input.optional(accountablePerson);
        return this;
    }

    public ConversationRef setAccountablePersonInput(Input<UserRef> accountablePerson) {
        if (accountablePerson == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.accountablePerson = accountablePerson;
        return this;
    }

    public UserRef getCreator() {
        return creator.getValue();
    }

    public Input<UserRef> getCreatorInput() {
        return creator;
    }

    public ConversationRef setCreator(UserRef creator) {
        this.creator = Input.optional(creator);
        return this;
    }

    public ConversationRef setCreatorInput(Input<UserRef> creator) {
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

    public ConversationRef setDateCreated(DateTime dateCreated) {
        this.dateCreated = Input.optional(dateCreated);
        return this;
    }

    public ConversationRef setDateCreatedInput(Input<DateTime> dateCreated) {
        if (dateCreated == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateCreated = dateCreated;
        return this;
    }

    public DataCatalogRef getIncludedInDataCatalog() {
        return includedInDataCatalog.getValue();
    }

    public Input<DataCatalogRef> getIncludedInDataCatalogInput() {
        return includedInDataCatalog;
    }

    public ConversationRef setIncludedInDataCatalog(DataCatalogRef includedInDataCatalog) {
        this.includedInDataCatalog = Input.optional(includedInDataCatalog);
        return this;
    }

    public ConversationRef setIncludedInDataCatalogInput(Input<DataCatalogRef> includedInDataCatalog) {
        if (includedInDataCatalog == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.includedInDataCatalog = includedInDataCatalog;
        return this;
    }

    public List<MessageRef> getHasMessages() {
        return hasMessages.getValue();
    }

    public Input<List<MessageRef>> getHasMessagesInput() {
        return hasMessages;
    }

    public ConversationRef setHasMessages(List<MessageRef> hasMessages) {
        this.hasMessages = Input.optional(hasMessages);
        return this;
    }

    public ConversationRef setHasMessagesInput(Input<List<MessageRef>> hasMessages) {
        if (hasMessages == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasMessages = hasMessages;
        return this;
    }

    public List<WebhookRef> getWebhook() {
        return webhook.getValue();
    }

    public Input<List<WebhookRef>> getWebhookInput() {
        return webhook;
    }

    public ConversationRef setWebhook(List<WebhookRef> webhook) {
        this.webhook = Input.optional(webhook);
        return this;
    }

    public ConversationRef setWebhookInput(Input<List<WebhookRef>> webhook) {
        if (webhook == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.webhook = webhook;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, name.getValue().toString());
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

        if (this.accountablePerson.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("accountablePerson:");
            if (accountablePerson.getValue() != null) {
                accountablePerson.getValue().appendTo(_queryBuilder);
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

        if (this.includedInDataCatalog.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("includedInDataCatalog:");
            if (includedInDataCatalog.getValue() != null) {
                includedInDataCatalog.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasMessages.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasMessages:");
            if (hasMessages.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MessageRef item1 : hasMessages.getValue()) {
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

        if (this.webhook.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("webhook:");
            if (webhook.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (WebhookRef item1 : webhook.getValue()) {
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

        _queryBuilder.append('}');
    }
}
