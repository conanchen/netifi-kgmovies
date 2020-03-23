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

public class StringRegExpFilter implements Serializable {
    private Input<String> regexp = Input.undefined();

    public String getRegexp() {
        return regexp.getValue();
    }

    public Input<String> getRegexpInput() {
        return regexp;
    }

    public StringRegExpFilter setRegexp(String regexp) {
        this.regexp = Input.optional(regexp);
        return this;
    }

    public StringRegExpFilter setRegexpInput(Input<String> regexp) {
        if (regexp == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regexp = regexp;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.regexp.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("regexp:");
            if (regexp.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, regexp.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
