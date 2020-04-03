// Generated from graphql_java_gen gem

package io.github.kgis.graphql;

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

public class NamespaceOrder implements Serializable {
    private Input<NamespaceOrderable> asc = Input.undefined();

    private Input<NamespaceOrderable> desc = Input.undefined();

    private Input<NamespaceOrder> then = Input.undefined();

    public NamespaceOrderable getAsc() {
        return asc.getValue();
    }

    public Input<NamespaceOrderable> getAscInput() {
        return asc;
    }

    public NamespaceOrder setAsc(NamespaceOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public NamespaceOrder setAscInput(Input<NamespaceOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public NamespaceOrderable getDesc() {
        return desc.getValue();
    }

    public Input<NamespaceOrderable> getDescInput() {
        return desc;
    }

    public NamespaceOrder setDesc(NamespaceOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public NamespaceOrder setDescInput(Input<NamespaceOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public NamespaceOrder getThen() {
        return then.getValue();
    }

    public Input<NamespaceOrder> getThenInput() {
        return then;
    }

    public NamespaceOrder setThen(NamespaceOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public NamespaceOrder setThenInput(Input<NamespaceOrder> then) {
        if (then == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.then = then;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.asc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("asc:");
            if (asc.getValue() != null) {
                _queryBuilder.append(asc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.desc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("desc:");
            if (desc.getValue() != null) {
                _queryBuilder.append(desc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.then.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("then:");
            if (then.getValue() != null) {
                then.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
