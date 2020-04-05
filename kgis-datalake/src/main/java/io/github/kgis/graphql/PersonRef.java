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

public class PersonRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<OwnershipRef>> owns = Input.undefined();

    private Input<List<NamespaceRef>> hasNamespaces = Input.undefined();

    private Input<String> personalId = Input.undefined();

    private Input<String> familyName = Input.undefined();

    private Input<String> givenName = Input.undefined();

    private Input<UserRef> hasUser = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public PersonRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public PersonRef setIdInput(Input<ID> id) {
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

    public PersonRef setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public PersonRef setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public PersonRef setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public PersonRef setIdentifierInput(Input<String> identifier) {
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

    public PersonRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public PersonRef setNameInput(Input<String> name) {
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

    public PersonRef setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public PersonRef setAlternateNameInput(Input<String> alternateName) {
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

    public PersonRef setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public PersonRef setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<OwnershipRef> getOwns() {
        return owns.getValue();
    }

    public Input<List<OwnershipRef>> getOwnsInput() {
        return owns;
    }

    public PersonRef setOwns(List<OwnershipRef> owns) {
        this.owns = Input.optional(owns);
        return this;
    }

    public PersonRef setOwnsInput(Input<List<OwnershipRef>> owns) {
        if (owns == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.owns = owns;
        return this;
    }

    public List<NamespaceRef> getHasNamespaces() {
        return hasNamespaces.getValue();
    }

    public Input<List<NamespaceRef>> getHasNamespacesInput() {
        return hasNamespaces;
    }

    public PersonRef setHasNamespaces(List<NamespaceRef> hasNamespaces) {
        this.hasNamespaces = Input.optional(hasNamespaces);
        return this;
    }

    public PersonRef setHasNamespacesInput(Input<List<NamespaceRef>> hasNamespaces) {
        if (hasNamespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasNamespaces = hasNamespaces;
        return this;
    }

    public String getPersonalId() {
        return personalId.getValue();
    }

    public Input<String> getPersonalIdInput() {
        return personalId;
    }

    public PersonRef setPersonalId(String personalId) {
        this.personalId = Input.optional(personalId);
        return this;
    }

    public PersonRef setPersonalIdInput(Input<String> personalId) {
        if (personalId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.personalId = personalId;
        return this;
    }

    public String getFamilyName() {
        return familyName.getValue();
    }

    public Input<String> getFamilyNameInput() {
        return familyName;
    }

    public PersonRef setFamilyName(String familyName) {
        this.familyName = Input.optional(familyName);
        return this;
    }

    public PersonRef setFamilyNameInput(Input<String> familyName) {
        if (familyName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.familyName = familyName;
        return this;
    }

    public String getGivenName() {
        return givenName.getValue();
    }

    public Input<String> getGivenNameInput() {
        return givenName;
    }

    public PersonRef setGivenName(String givenName) {
        this.givenName = Input.optional(givenName);
        return this;
    }

    public PersonRef setGivenNameInput(Input<String> givenName) {
        if (givenName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.givenName = givenName;
        return this;
    }

    public UserRef getHasUser() {
        return hasUser.getValue();
    }

    public Input<UserRef> getHasUserInput() {
        return hasUser;
    }

    public PersonRef setHasUser(UserRef hasUser) {
        this.hasUser = Input.optional(hasUser);
        return this;
    }

    public PersonRef setHasUserInput(Input<UserRef> hasUser) {
        if (hasUser == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasUser = hasUser;
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

        if (this.owns.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("owns:");
            if (owns.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OwnershipRef item1 : owns.getValue()) {
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

        if (this.hasNamespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasNamespaces:");
            if (hasNamespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : hasNamespaces.getValue()) {
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

        if (this.personalId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("personalID:");
            if (personalId.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, personalId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.familyName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("familyName:");
            if (familyName.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, familyName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.givenName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("givenName:");
            if (givenName.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, givenName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasUser.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasUser:");
            if (hasUser.getValue() != null) {
                hasUser.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
