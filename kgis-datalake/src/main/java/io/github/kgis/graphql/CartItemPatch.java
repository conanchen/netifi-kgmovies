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

public class CartItemPatch implements Serializable {
    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<CartRef> isItemOf = Input.undefined();

    private Input<CartItemType> type = Input.undefined();

    private Input<Integer> quantity = Input.undefined();

    private Input<DateTime> createdAt = Input.undefined();

    private Input<DateTime> updatedAt = Input.undefined();

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public CartItemPatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public CartItemPatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public CartItemPatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public CartItemPatch setIdentifierInput(Input<String> identifier) {
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

    public CartItemPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CartItemPatch setNameInput(Input<String> name) {
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

    public CartItemPatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public CartItemPatch setAlternateNameInput(Input<String> alternateName) {
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

    public CartItemPatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public CartItemPatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public CartRef getIsItemOf() {
        return isItemOf.getValue();
    }

    public Input<CartRef> getIsItemOfInput() {
        return isItemOf;
    }

    public CartItemPatch setIsItemOf(CartRef isItemOf) {
        this.isItemOf = Input.optional(isItemOf);
        return this;
    }

    public CartItemPatch setIsItemOfInput(Input<CartRef> isItemOf) {
        if (isItemOf == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isItemOf = isItemOf;
        return this;
    }

    public CartItemType getType() {
        return type.getValue();
    }

    public Input<CartItemType> getTypeInput() {
        return type;
    }

    public CartItemPatch setType(CartItemType type) {
        this.type = Input.optional(type);
        return this;
    }

    public CartItemPatch setTypeInput(Input<CartItemType> type) {
        if (type == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.type = type;
        return this;
    }

    public Integer getQuantity() {
        return quantity.getValue();
    }

    public Input<Integer> getQuantityInput() {
        return quantity;
    }

    public CartItemPatch setQuantity(Integer quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    public CartItemPatch setQuantityInput(Input<Integer> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public DateTime getCreatedAt() {
        return createdAt.getValue();
    }

    public Input<DateTime> getCreatedAtInput() {
        return createdAt;
    }

    public CartItemPatch setCreatedAt(DateTime createdAt) {
        this.createdAt = Input.optional(createdAt);
        return this;
    }

    public CartItemPatch setCreatedAtInput(Input<DateTime> createdAt) {
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

    public CartItemPatch setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = Input.optional(updatedAt);
        return this;
    }

    public CartItemPatch setUpdatedAtInput(Input<DateTime> updatedAt) {
        if (updatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAt = updatedAt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.isItemOf.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isItemOf:");
            if (isItemOf.getValue() != null) {
                isItemOf.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.type.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type:");
            if (type.getValue() != null) {
                _queryBuilder.append(type.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.quantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantity:");
            if (quantity.getValue() != null) {
                _queryBuilder.append(quantity.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdAt:");
            if (createdAt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, createdAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updatedAt:");
            if (updatedAt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, updatedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
