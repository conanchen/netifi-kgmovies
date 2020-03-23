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

public class StringTermFilter implements Serializable {
    private Input<String> allofterms = Input.undefined();

    private Input<String> anyofterms = Input.undefined();

    public String getAllofterms() {
        return allofterms.getValue();
    }

    public Input<String> getAlloftermsInput() {
        return allofterms;
    }

    public StringTermFilter setAllofterms(String allofterms) {
        this.allofterms = Input.optional(allofterms);
        return this;
    }

    public StringTermFilter setAlloftermsInput(Input<String> allofterms) {
        if (allofterms == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.allofterms = allofterms;
        return this;
    }

    public String getAnyofterms() {
        return anyofterms.getValue();
    }

    public Input<String> getAnyoftermsInput() {
        return anyofterms;
    }

    public StringTermFilter setAnyofterms(String anyofterms) {
        this.anyofterms = Input.optional(anyofterms);
        return this;
    }

    public StringTermFilter setAnyoftermsInput(Input<String> anyofterms) {
        if (anyofterms == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anyofterms = anyofterms;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.allofterms.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("allofterms:");
            if (allofterms.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, allofterms.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.anyofterms.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("anyofterms:");
            if (anyofterms.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, anyofterms.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
