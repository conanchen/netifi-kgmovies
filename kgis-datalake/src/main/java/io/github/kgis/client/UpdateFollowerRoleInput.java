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

public class UpdateFollowerRoleInput implements Serializable {
    private FollowerRoleFilter filter;

    private Input<FollowerRolePatch> set = Input.undefined();

    private Input<FollowerRolePatch> remove = Input.undefined();

    public UpdateFollowerRoleInput(FollowerRoleFilter filter) {
        this.filter = filter;
    }

    public FollowerRoleFilter getFilter() {
        return filter;
    }

    public UpdateFollowerRoleInput setFilter(FollowerRoleFilter filter) {
        this.filter = filter;
        return this;
    }

    public FollowerRolePatch getSet() {
        return set.getValue();
    }

    public Input<FollowerRolePatch> getSetInput() {
        return set;
    }

    public UpdateFollowerRoleInput setSet(FollowerRolePatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateFollowerRoleInput setSetInput(Input<FollowerRolePatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public FollowerRolePatch getRemove() {
        return remove.getValue();
    }

    public Input<FollowerRolePatch> getRemoveInput() {
        return remove;
    }

    public UpdateFollowerRoleInput setRemove(FollowerRolePatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateFollowerRoleInput setRemoveInput(Input<FollowerRolePatch> remove) {
        if (remove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remove = remove;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("filter:");
        filter.appendTo(_queryBuilder);

        if (this.set.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("set:");
            if (set.getValue() != null) {
                set.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remove:");
            if (remove.getValue() != null) {
                remove.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
