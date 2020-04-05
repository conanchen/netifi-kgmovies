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

public class UserFilter implements Serializable {
    private Input<List<ID>> id = Input.undefined();

    private Input<StringHashFilter> name = Input.undefined();

    private Input<StringHashFilter> username = Input.undefined();

    private Input<UserFilter> and = Input.undefined();

    private Input<UserFilter> or = Input.undefined();

    private Input<UserFilter> not = Input.undefined();

    public List<ID> getId() {
        return id.getValue();
    }

    public Input<List<ID>> getIdInput() {
        return id;
    }

    public UserFilter setId(List<ID> id) {
        this.id = Input.optional(id);
        return this;
    }

    public UserFilter setIdInput(Input<List<ID>> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public StringHashFilter getName() {
        return name.getValue();
    }

    public Input<StringHashFilter> getNameInput() {
        return name;
    }

    public UserFilter setName(StringHashFilter name) {
        this.name = Input.optional(name);
        return this;
    }

    public UserFilter setNameInput(Input<StringHashFilter> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public StringHashFilter getUsername() {
        return username.getValue();
    }

    public Input<StringHashFilter> getUsernameInput() {
        return username;
    }

    public UserFilter setUsername(StringHashFilter username) {
        this.username = Input.optional(username);
        return this;
    }

    public UserFilter setUsernameInput(Input<StringHashFilter> username) {
        if (username == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.username = username;
        return this;
    }

    public UserFilter getAnd() {
        return and.getValue();
    }

    public Input<UserFilter> getAndInput() {
        return and;
    }

    public UserFilter setAnd(UserFilter and) {
        this.and = Input.optional(and);
        return this;
    }

    public UserFilter setAndInput(Input<UserFilter> and) {
        if (and == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.and = and;
        return this;
    }

    public UserFilter getOr() {
        return or.getValue();
    }

    public Input<UserFilter> getOrInput() {
        return or;
    }

    public UserFilter setOr(UserFilter or) {
        this.or = Input.optional(or);
        return this;
    }

    public UserFilter setOrInput(Input<UserFilter> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public UserFilter getNot() {
        return not.getValue();
    }

    public Input<UserFilter> getNotInput() {
        return not;
    }

    public UserFilter setNot(UserFilter not) {
        this.not = Input.optional(not);
        return this;
    }

    public UserFilter setNotInput(Input<UserFilter> not) {
        if (not == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.not = not;
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
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : id.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Tuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.username.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("username:");
            if (username.getValue() != null) {
                username.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.and.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("and:");
            if (and.getValue() != null) {
                and.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.or.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("or:");
            if (or.getValue() != null) {
                or.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.not.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("not:");
            if (not.getValue() != null) {
                not.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
