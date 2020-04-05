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

public class MessageOrder implements Serializable {
    private Input<MessageOrderable> asc = Input.undefined();

    private Input<MessageOrderable> desc = Input.undefined();

    private Input<MessageOrder> then = Input.undefined();

    public MessageOrderable getAsc() {
        return asc.getValue();
    }

    public Input<MessageOrderable> getAscInput() {
        return asc;
    }

    public MessageOrder setAsc(MessageOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public MessageOrder setAscInput(Input<MessageOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public MessageOrderable getDesc() {
        return desc.getValue();
    }

    public Input<MessageOrderable> getDescInput() {
        return desc;
    }

    public MessageOrder setDesc(MessageOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public MessageOrder setDescInput(Input<MessageOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public MessageOrder getThen() {
        return then.getValue();
    }

    public Input<MessageOrder> getThenInput() {
        return then;
    }

    public MessageOrder setThen(MessageOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public MessageOrder setThenInput(Input<MessageOrder> then) {
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
