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

public class CartRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<UserRef> owner = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<List<CartItemRef>> items = Input.undefined();

    private Input<String> notes = Input.undefined();

    private Input<DateTime> createdAt = Input.undefined();

    private Input<DateTime> updatedAt = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public CartRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public CartRef setIdInput(Input<ID> id) {
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

    public CartRef setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public CartRef setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public CartRef setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public CartRef setIdentifierInput(Input<String> identifier) {
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

    public CartRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CartRef setNameInput(Input<String> name) {
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

    public CartRef setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public CartRef setAlternateNameInput(Input<String> alternateName) {
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

    public CartRef setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public CartRef setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public UserRef getOwner() {
        return owner.getValue();
    }

    public Input<UserRef> getOwnerInput() {
        return owner;
    }

    public CartRef setOwner(UserRef owner) {
        this.owner = Input.optional(owner);
        return this;
    }

    public CartRef setOwnerInput(Input<UserRef> owner) {
        if (owner == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.owner = owner;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public CartRef setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public CartRef setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public List<CartItemRef> getItems() {
        return items.getValue();
    }

    public Input<List<CartItemRef>> getItemsInput() {
        return items;
    }

    public CartRef setItems(List<CartItemRef> items) {
        this.items = Input.optional(items);
        return this;
    }

    public CartRef setItemsInput(Input<List<CartItemRef>> items) {
        if (items == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.items = items;
        return this;
    }

    public String getNotes() {
        return notes.getValue();
    }

    public Input<String> getNotesInput() {
        return notes;
    }

    public CartRef setNotes(String notes) {
        this.notes = Input.optional(notes);
        return this;
    }

    public CartRef setNotesInput(Input<String> notes) {
        if (notes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notes = notes;
        return this;
    }

    public DateTime getCreatedAt() {
        return createdAt.getValue();
    }

    public Input<DateTime> getCreatedAtInput() {
        return createdAt;
    }

    public CartRef setCreatedAt(DateTime createdAt) {
        this.createdAt = Input.optional(createdAt);
        return this;
    }

    public CartRef setCreatedAtInput(Input<DateTime> createdAt) {
        if (createdAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAt = createdAt;
        return this;
    }

    public DateTime getUpdatedAt() {
        return updatedAt.getValue();
    }

    public Input<DateTime> getUpdatedAtInput() {
        return updatedAt;
    }

    public CartRef setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = Input.optional(updatedAt);
        return this;
    }

    public CartRef setUpdatedAtInput(Input<DateTime> updatedAt) {
        if (updatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAt = updatedAt;
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
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
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
                Query.appendQuotedString(_queryBuilder, identifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alternateName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateName:");
            if (alternateName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alternateName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.owner.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("owner:");
            if (owner.getValue() != null) {
                owner.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, email.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.items.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("items:");
            if (items.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CartItemRef item1 : items.getValue()) {
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

        if (this.notes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("notes:");
            if (notes.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, notes.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdAt:");
            if (createdAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, createdAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updatedAt:");
            if (updatedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, updatedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
