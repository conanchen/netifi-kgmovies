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

public class UpdateCartInput implements Serializable {
    private CartFilter filter;

    private Input<CartPatch> set = Input.undefined();

    private Input<CartPatch> remove = Input.undefined();

    public UpdateCartInput(CartFilter filter) {
        this.filter = filter;
    }

    public CartFilter getFilter() {
        return filter;
    }

    public UpdateCartInput setFilter(CartFilter filter) {
        this.filter = filter;
        return this;
    }

    public CartPatch getSet() {
        return set.getValue();
    }

    public Input<CartPatch> getSetInput() {
        return set;
    }

    public UpdateCartInput setSet(CartPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateCartInput setSetInput(Input<CartPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public CartPatch getRemove() {
        return remove.getValue();
    }

    public Input<CartPatch> getRemoveInput() {
        return remove;
    }

    public UpdateCartInput setRemove(CartPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateCartInput setRemoveInput(Input<CartPatch> remove) {
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
