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

public class UserOrder implements Serializable {
    private Input<UserOrderable> asc = Input.undefined();

    private Input<UserOrderable> desc = Input.undefined();

    private Input<UserOrder> then = Input.undefined();

    public UserOrderable getAsc() {
        return asc.getValue();
    }

    public Input<UserOrderable> getAscInput() {
        return asc;
    }

    public UserOrder setAsc(UserOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public UserOrder setAscInput(Input<UserOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public UserOrderable getDesc() {
        return desc.getValue();
    }

    public Input<UserOrderable> getDescInput() {
        return desc;
    }

    public UserOrder setDesc(UserOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public UserOrder setDescInput(Input<UserOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public UserOrder getThen() {
        return then.getValue();
    }

    public Input<UserOrder> getThenInput() {
        return then;
    }

    public UserOrder setThen(UserOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public UserOrder setThenInput(Input<UserOrder> then) {
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
