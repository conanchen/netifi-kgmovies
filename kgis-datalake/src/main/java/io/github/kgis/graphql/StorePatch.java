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

public class StorePatch implements Serializable {
    private Input<List<OwnershipRef>> owns = Input.undefined();

    private Input<List<NamespaceRef>> hasNamespaces = Input.undefined();

    private Input<List<PartyRoleNameRef>> hasPartyRoleName = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<EmployeeRoleRef>> employees = Input.undefined();

    private Input<List<FollowerRoleRef>> followers = Input.undefined();

    private Input<List<MemberRoleRef>> members = Input.undefined();

    private Input<DateTime> dateCreated = Input.undefined();

    private Input<DateTime> dateModified = Input.undefined();

    private Input<UserRef> creator = Input.undefined();

    public List<OwnershipRef> getOwns() {
        return owns.getValue();
    }

    public Input<List<OwnershipRef>> getOwnsInput() {
        return owns;
    }

    public StorePatch setOwns(List<OwnershipRef> owns) {
        this.owns = Input.optional(owns);
        return this;
    }

    public StorePatch setOwnsInput(Input<List<OwnershipRef>> owns) {
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

    public StorePatch setHasNamespaces(List<NamespaceRef> hasNamespaces) {
        this.hasNamespaces = Input.optional(hasNamespaces);
        return this;
    }

    public StorePatch setHasNamespacesInput(Input<List<NamespaceRef>> hasNamespaces) {
        if (hasNamespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasNamespaces = hasNamespaces;
        return this;
    }

    public List<PartyRoleNameRef> getHasPartyRoleName() {
        return hasPartyRoleName.getValue();
    }

    public Input<List<PartyRoleNameRef>> getHasPartyRoleNameInput() {
        return hasPartyRoleName;
    }

    public StorePatch setHasPartyRoleName(List<PartyRoleNameRef> hasPartyRoleName) {
        this.hasPartyRoleName = Input.optional(hasPartyRoleName);
        return this;
    }

    public StorePatch setHasPartyRoleNameInput(Input<List<PartyRoleNameRef>> hasPartyRoleName) {
        if (hasPartyRoleName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasPartyRoleName = hasPartyRoleName;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public StorePatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public StorePatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public StorePatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public StorePatch setIdentifierInput(Input<String> identifier) {
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

    public StorePatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public StorePatch setNameInput(Input<String> name) {
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

    public StorePatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public StorePatch setAlternateNameInput(Input<String> alternateName) {
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

    public StorePatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public StorePatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<EmployeeRoleRef> getEmployees() {
        return employees.getValue();
    }

    public Input<List<EmployeeRoleRef>> getEmployeesInput() {
        return employees;
    }

    public StorePatch setEmployees(List<EmployeeRoleRef> employees) {
        this.employees = Input.optional(employees);
        return this;
    }

    public StorePatch setEmployeesInput(Input<List<EmployeeRoleRef>> employees) {
        if (employees == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.employees = employees;
        return this;
    }

    public List<FollowerRoleRef> getFollowers() {
        return followers.getValue();
    }

    public Input<List<FollowerRoleRef>> getFollowersInput() {
        return followers;
    }

    public StorePatch setFollowers(List<FollowerRoleRef> followers) {
        this.followers = Input.optional(followers);
        return this;
    }

    public StorePatch setFollowersInput(Input<List<FollowerRoleRef>> followers) {
        if (followers == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.followers = followers;
        return this;
    }

    public List<MemberRoleRef> getMembers() {
        return members.getValue();
    }

    public Input<List<MemberRoleRef>> getMembersInput() {
        return members;
    }

    public StorePatch setMembers(List<MemberRoleRef> members) {
        this.members = Input.optional(members);
        return this;
    }

    public StorePatch setMembersInput(Input<List<MemberRoleRef>> members) {
        if (members == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.members = members;
        return this;
    }

    public DateTime getDateCreated() {
        return dateCreated.getValue();
    }

    public Input<DateTime> getDateCreatedInput() {
        return dateCreated;
    }

    public StorePatch setDateCreated(DateTime dateCreated) {
        this.dateCreated = Input.optional(dateCreated);
        return this;
    }

    public StorePatch setDateCreatedInput(Input<DateTime> dateCreated) {
        if (dateCreated == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateCreated = dateCreated;
        return this;
    }

    public DateTime getDateModified() {
        return dateModified.getValue();
    }

    public Input<DateTime> getDateModifiedInput() {
        return dateModified;
    }

    public StorePatch setDateModified(DateTime dateModified) {
        this.dateModified = Input.optional(dateModified);
        return this;
    }

    public StorePatch setDateModifiedInput(Input<DateTime> dateModified) {
        if (dateModified == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateModified = dateModified;
        return this;
    }

    public UserRef getCreator() {
        return creator.getValue();
    }

    public Input<UserRef> getCreatorInput() {
        return creator;
    }

    public StorePatch setCreator(UserRef creator) {
        this.creator = Input.optional(creator);
        return this;
    }

    public StorePatch setCreatorInput(Input<UserRef> creator) {
        if (creator == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.creator = creator;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.hasPartyRoleName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasPartyRoleName:");
            if (hasPartyRoleName.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PartyRoleNameRef item1 : hasPartyRoleName.getValue()) {
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

        if (this.employees.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("employees:");
            if (employees.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (EmployeeRoleRef item1 : employees.getValue()) {
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

        if (this.followers.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("followers:");
            if (followers.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FollowerRoleRef item1 : followers.getValue()) {
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

        if (this.members.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("members:");
            if (members.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MemberRoleRef item1 : members.getValue()) {
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

        if (this.dateModified.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateModified:");
            if (dateModified.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateModified.getValue().toString());
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

        _queryBuilder.append('}');
    }
}
