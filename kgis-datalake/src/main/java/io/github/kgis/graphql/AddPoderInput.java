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

public class AddPoderInput implements Serializable {
    private String name;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<Boolean> isGift = Input.undefined();

    private Input<DateTime> poderDate = Input.undefined();

    private Input<String> poderNumber = Input.undefined();

    private Input<PoderStatus> poderStatus = Input.undefined();

    private Input<List<PoderItemRef>> items = Input.undefined();

    public AddPoderInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddPoderInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddPoderInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddPoderInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddPoderInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddPoderInput setIdentifierInput(Input<String> identifier) {
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

    public AddPoderInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddPoderInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddPoderInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddPoderInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public Boolean getIsGift() {
        return isGift.getValue();
    }

    public Input<Boolean> getIsGiftInput() {
        return isGift;
    }

    public AddPoderInput setIsGift(Boolean isGift) {
        this.isGift = Input.optional(isGift);
        return this;
    }

    public AddPoderInput setIsGiftInput(Input<Boolean> isGift) {
        if (isGift == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isGift = isGift;
        return this;
    }

    public DateTime getPoderDate() {
        return poderDate.getValue();
    }

    public Input<DateTime> getPoderDateInput() {
        return poderDate;
    }

    public AddPoderInput setPoderDate(DateTime poderDate) {
        this.poderDate = Input.optional(poderDate);
        return this;
    }

    public AddPoderInput setPoderDateInput(Input<DateTime> poderDate) {
        if (poderDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poderDate = poderDate;
        return this;
    }

    public String getPoderNumber() {
        return poderNumber.getValue();
    }

    public Input<String> getPoderNumberInput() {
        return poderNumber;
    }

    public AddPoderInput setPoderNumber(String poderNumber) {
        this.poderNumber = Input.optional(poderNumber);
        return this;
    }

    public AddPoderInput setPoderNumberInput(Input<String> poderNumber) {
        if (poderNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poderNumber = poderNumber;
        return this;
    }

    public PoderStatus getPoderStatus() {
        return poderStatus.getValue();
    }

    public Input<PoderStatus> getPoderStatusInput() {
        return poderStatus;
    }

    public AddPoderInput setPoderStatus(PoderStatus poderStatus) {
        this.poderStatus = Input.optional(poderStatus);
        return this;
    }

    public AddPoderInput setPoderStatusInput(Input<PoderStatus> poderStatus) {
        if (poderStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poderStatus = poderStatus;
        return this;
    }

    public List<PoderItemRef> getItems() {
        return items.getValue();
    }

    public Input<List<PoderItemRef>> getItemsInput() {
        return items;
    }

    public AddPoderInput setItems(List<PoderItemRef> items) {
        this.items = Input.optional(items);
        return this;
    }

    public AddPoderInput setItemsInput(Input<List<PoderItemRef>> items) {
        if (items == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.items = items;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

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

        if (this.isGift.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isGift:");
            if (isGift.getValue() != null) {
                _queryBuilder.append(isGift.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.poderDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poderDate:");
            if (poderDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, poderDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.poderNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poderNumber:");
            if (poderNumber.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, poderNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.poderStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poderStatus:");
            if (poderStatus.getValue() != null) {
                _queryBuilder.append(poderStatus.getValue().toString());
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
                    for (PoderItemRef item1 : items.getValue()) {
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
