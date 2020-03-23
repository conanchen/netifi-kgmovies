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

public class GeneralOrganizationFilter implements Serializable {
    private Input<StringHashFilter> name = Input.undefined();

    private Input<List<ID>> id = Input.undefined();

    private Input<GeneralOrganizationFilter> and = Input.undefined();

    private Input<GeneralOrganizationFilter> or = Input.undefined();

    private Input<GeneralOrganizationFilter> not = Input.undefined();

    public StringHashFilter getName() {
        return name.getValue();
    }

    public Input<StringHashFilter> getNameInput() {
        return name;
    }

    public GeneralOrganizationFilter setName(StringHashFilter name) {
        this.name = Input.optional(name);
        return this;
    }

    public GeneralOrganizationFilter setNameInput(Input<StringHashFilter> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<ID> getId() {
        return id.getValue();
    }

    public Input<List<ID>> getIdInput() {
        return id;
    }

    public GeneralOrganizationFilter setId(List<ID> id) {
        this.id = Input.optional(id);
        return this;
    }

    public GeneralOrganizationFilter setIdInput(Input<List<ID>> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public GeneralOrganizationFilter getAnd() {
        return and.getValue();
    }

    public Input<GeneralOrganizationFilter> getAndInput() {
        return and;
    }

    public GeneralOrganizationFilter setAnd(GeneralOrganizationFilter and) {
        this.and = Input.optional(and);
        return this;
    }

    public GeneralOrganizationFilter setAndInput(Input<GeneralOrganizationFilter> and) {
        if (and == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.and = and;
        return this;
    }

    public GeneralOrganizationFilter getOr() {
        return or.getValue();
    }

    public Input<GeneralOrganizationFilter> getOrInput() {
        return or;
    }

    public GeneralOrganizationFilter setOr(GeneralOrganizationFilter or) {
        this.or = Input.optional(or);
        return this;
    }

    public GeneralOrganizationFilter setOrInput(Input<GeneralOrganizationFilter> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public GeneralOrganizationFilter getNot() {
        return not.getValue();
    }

    public Input<GeneralOrganizationFilter> getNotInput() {
        return not;
    }

    public GeneralOrganizationFilter setNot(GeneralOrganizationFilter not) {
        this.not = Input.optional(not);
        return this;
    }

    public GeneralOrganizationFilter setNotInput(Input<GeneralOrganizationFilter> not) {
        if (not == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.not = not;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
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
