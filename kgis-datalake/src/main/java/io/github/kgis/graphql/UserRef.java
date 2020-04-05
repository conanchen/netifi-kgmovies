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

public class UserRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> username = Input.undefined();

    private Input<String> password = Input.undefined();

    private Input<String> bio = Input.undefined();

    private Input<PersonRef> isUserOf = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public UserRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public UserRef setIdInput(Input<ID> id) {
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

    public UserRef setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public UserRef setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public UserRef setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public UserRef setIdentifierInput(Input<String> identifier) {
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

    public UserRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public UserRef setNameInput(Input<String> name) {
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

    public UserRef setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public UserRef setAlternateNameInput(Input<String> alternateName) {
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

    public UserRef setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public UserRef setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getUsername() {
        return username.getValue();
    }

    public Input<String> getUsernameInput() {
        return username;
    }

    public UserRef setUsername(String username) {
        this.username = Input.optional(username);
        return this;
    }

    public UserRef setUsernameInput(Input<String> username) {
        if (username == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password.getValue();
    }

    public Input<String> getPasswordInput() {
        return password;
    }

    public UserRef setPassword(String password) {
        this.password = Input.optional(password);
        return this;
    }

    public UserRef setPasswordInput(Input<String> password) {
        if (password == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.password = password;
        return this;
    }

    public String getBio() {
        return bio.getValue();
    }

    public Input<String> getBioInput() {
        return bio;
    }

    public UserRef setBio(String bio) {
        this.bio = Input.optional(bio);
        return this;
    }

    public UserRef setBioInput(Input<String> bio) {
        if (bio == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.bio = bio;
        return this;
    }

    public PersonRef getIsUserOf() {
        return isUserOf.getValue();
    }

    public Input<PersonRef> getIsUserOfInput() {
        return isUserOf;
    }

    public UserRef setIsUserOf(PersonRef isUserOf) {
        this.isUserOf = Input.optional(isUserOf);
        return this;
    }

    public UserRef setIsUserOfInput(Input<PersonRef> isUserOf) {
        if (isUserOf == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isUserOf = isUserOf;
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

        if (this.username.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("username:");
            if (username.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, username.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.password.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("password:");
            if (password.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, password.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.bio.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("bio:");
            if (bio.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, bio.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isUserOf.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isUserOf:");
            if (isUserOf.getValue() != null) {
                isUserOf.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
