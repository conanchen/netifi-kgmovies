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

public class AddPoderItemInput implements Serializable {
    private String name;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<PoderRef> isItemOf = Input.undefined();

    private Input<String> poderItemNumber = Input.undefined();

    private Input<PoderStatus> poderItemStatus = Input.undefined();

    private Input<Integer> poderQuantity = Input.undefined();

    public AddPoderItemInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddPoderItemInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddPoderItemInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddPoderItemInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddPoderItemInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddPoderItemInput setIdentifierInput(Input<String> identifier) {
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

    public AddPoderItemInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddPoderItemInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddPoderItemInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddPoderItemInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public PoderRef getIsItemOf() {
        return isItemOf.getValue();
    }

    public Input<PoderRef> getIsItemOfInput() {
        return isItemOf;
    }

    public AddPoderItemInput setIsItemOf(PoderRef isItemOf) {
        this.isItemOf = Input.optional(isItemOf);
        return this;
    }

    public AddPoderItemInput setIsItemOfInput(Input<PoderRef> isItemOf) {
        if (isItemOf == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isItemOf = isItemOf;
        return this;
    }

    public String getPoderItemNumber() {
        return poderItemNumber.getValue();
    }

    public Input<String> getPoderItemNumberInput() {
        return poderItemNumber;
    }

    public AddPoderItemInput setPoderItemNumber(String poderItemNumber) {
        this.poderItemNumber = Input.optional(poderItemNumber);
        return this;
    }

    public AddPoderItemInput setPoderItemNumberInput(Input<String> poderItemNumber) {
        if (poderItemNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poderItemNumber = poderItemNumber;
        return this;
    }

    public PoderStatus getPoderItemStatus() {
        return poderItemStatus.getValue();
    }

    public Input<PoderStatus> getPoderItemStatusInput() {
        return poderItemStatus;
    }

    public AddPoderItemInput setPoderItemStatus(PoderStatus poderItemStatus) {
        this.poderItemStatus = Input.optional(poderItemStatus);
        return this;
    }

    public AddPoderItemInput setPoderItemStatusInput(Input<PoderStatus> poderItemStatus) {
        if (poderItemStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poderItemStatus = poderItemStatus;
        return this;
    }

    public Integer getPoderQuantity() {
        return poderQuantity.getValue();
    }

    public Input<Integer> getPoderQuantityInput() {
        return poderQuantity;
    }

    public AddPoderItemInput setPoderQuantity(Integer poderQuantity) {
        this.poderQuantity = Input.optional(poderQuantity);
        return this;
    }

    public AddPoderItemInput setPoderQuantityInput(Input<Integer> poderQuantity) {
        if (poderQuantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poderQuantity = poderQuantity;
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

        if (this.poderItemNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poderItemNumber:");
            if (poderItemNumber.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, poderItemNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.poderItemStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poderItemStatus:");
            if (poderItemStatus.getValue() != null) {
                _queryBuilder.append(poderItemStatus.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.poderQuantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poderQuantity:");
            if (poderQuantity.getValue() != null) {
                _queryBuilder.append(poderQuantity.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
