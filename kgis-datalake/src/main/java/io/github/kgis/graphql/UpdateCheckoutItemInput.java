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

public class UpdateCheckoutItemInput implements Serializable {
    private CheckoutItemFilter filter;

    private Input<CheckoutItemPatch> set = Input.undefined();

    private Input<CheckoutItemPatch> remove = Input.undefined();

    public UpdateCheckoutItemInput(CheckoutItemFilter filter) {
        this.filter = filter;
    }

    public CheckoutItemFilter getFilter() {
        return filter;
    }

    public UpdateCheckoutItemInput setFilter(CheckoutItemFilter filter) {
        this.filter = filter;
        return this;
    }

    public CheckoutItemPatch getSet() {
        return set.getValue();
    }

    public Input<CheckoutItemPatch> getSetInput() {
        return set;
    }

    public UpdateCheckoutItemInput setSet(CheckoutItemPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateCheckoutItemInput setSetInput(Input<CheckoutItemPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public CheckoutItemPatch getRemove() {
        return remove.getValue();
    }

    public Input<CheckoutItemPatch> getRemoveInput() {
        return remove;
    }

    public UpdateCheckoutItemInput setRemove(CheckoutItemPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateCheckoutItemInput setRemoveInput(Input<CheckoutItemPatch> remove) {
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
