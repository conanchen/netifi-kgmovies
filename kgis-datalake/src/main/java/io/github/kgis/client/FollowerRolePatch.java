// Generated from graphql_java_gen gem

package io.github.kgis.client;

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

public class FollowerRolePatch implements Serializable {
    private Input<PersonRef> person = Input.undefined();

    private Input<PartyRoleNameRef> roleName = Input.undefined();

    private Input<DateTime> dateFrom = Input.undefined();

    private Input<DateTime> dateThrough = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> settings = Input.undefined();

    public PersonRef getPerson() {
        return person.getValue();
    }

    public Input<PersonRef> getPersonInput() {
        return person;
    }

    public FollowerRolePatch setPerson(PersonRef person) {
        this.person = Input.optional(person);
        return this;
    }

    public FollowerRolePatch setPersonInput(Input<PersonRef> person) {
        if (person == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.person = person;
        return this;
    }

    public PartyRoleNameRef getRoleName() {
        return roleName.getValue();
    }

    public Input<PartyRoleNameRef> getRoleNameInput() {
        return roleName;
    }

    public FollowerRolePatch setRoleName(PartyRoleNameRef roleName) {
        this.roleName = Input.optional(roleName);
        return this;
    }

    public FollowerRolePatch setRoleNameInput(Input<PartyRoleNameRef> roleName) {
        if (roleName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.roleName = roleName;
        return this;
    }

    public DateTime getDateFrom() {
        return dateFrom.getValue();
    }

    public Input<DateTime> getDateFromInput() {
        return dateFrom;
    }

    public FollowerRolePatch setDateFrom(DateTime dateFrom) {
        this.dateFrom = Input.optional(dateFrom);
        return this;
    }

    public FollowerRolePatch setDateFromInput(Input<DateTime> dateFrom) {
        if (dateFrom == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateFrom = dateFrom;
        return this;
    }

    public DateTime getDateThrough() {
        return dateThrough.getValue();
    }

    public Input<DateTime> getDateThroughInput() {
        return dateThrough;
    }

    public FollowerRolePatch setDateThrough(DateTime dateThrough) {
        this.dateThrough = Input.optional(dateThrough);
        return this;
    }

    public FollowerRolePatch setDateThroughInput(Input<DateTime> dateThrough) {
        if (dateThrough == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateThrough = dateThrough;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public FollowerRolePatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public FollowerRolePatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public FollowerRolePatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public FollowerRolePatch setIdentifierInput(Input<String> identifier) {
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

    public FollowerRolePatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public FollowerRolePatch setNameInput(Input<String> name) {
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

    public FollowerRolePatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public FollowerRolePatch setAlternateNameInput(Input<String> alternateName) {
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

    public FollowerRolePatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public FollowerRolePatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getSettings() {
        return settings.getValue();
    }

    public Input<String> getSettingsInput() {
        return settings;
    }

    public FollowerRolePatch setSettings(String settings) {
        this.settings = Input.optional(settings);
        return this;
    }

    public FollowerRolePatch setSettingsInput(Input<String> settings) {
        if (settings == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.settings = settings;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.person.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("person:");
            if (person.getValue() != null) {
                person.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.roleName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("roleName:");
            if (roleName.getValue() != null) {
                roleName.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateFrom.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateFrom:");
            if (dateFrom.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateFrom.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateThrough.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateThrough:");
            if (dateThrough.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateThrough.getValue().toString());
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

        if (this.settings.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("settings:");
            if (settings.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, settings.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
