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

public class StringExactFilter implements Serializable {
    private Input<String> eq = Input.undefined();

    private Input<String> le = Input.undefined();

    private Input<String> lt = Input.undefined();

    private Input<String> ge = Input.undefined();

    private Input<String> gt = Input.undefined();

    public String getEq() {
        return eq.getValue();
    }

    public Input<String> getEqInput() {
        return eq;
    }

    public StringExactFilter setEq(String eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    public StringExactFilter setEqInput(Input<String> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    public String getLe() {
        return le.getValue();
    }

    public Input<String> getLeInput() {
        return le;
    }

    public StringExactFilter setLe(String le) {
        this.le = Input.optional(le);
        return this;
    }

    public StringExactFilter setLeInput(Input<String> le) {
        if (le == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.le = le;
        return this;
    }

    public String getLt() {
        return lt.getValue();
    }

    public Input<String> getLtInput() {
        return lt;
    }

    public StringExactFilter setLt(String lt) {
        this.lt = Input.optional(lt);
        return this;
    }

    public StringExactFilter setLtInput(Input<String> lt) {
        if (lt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lt = lt;
        return this;
    }

    public String getGe() {
        return ge.getValue();
    }

    public Input<String> getGeInput() {
        return ge;
    }

    public StringExactFilter setGe(String ge) {
        this.ge = Input.optional(ge);
        return this;
    }

    public StringExactFilter setGeInput(Input<String> ge) {
        if (ge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ge = ge;
        return this;
    }

    public String getGt() {
        return gt.getValue();
    }

    public Input<String> getGtInput() {
        return gt;
    }

    public StringExactFilter setGt(String gt) {
        this.gt = Input.optional(gt);
        return this;
    }

    public StringExactFilter setGtInput(Input<String> gt) {
        if (gt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gt = gt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.eq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("eq:");
            if (eq.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, eq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.le.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("le:");
            if (le.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, le.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lt:");
            if (lt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, lt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ge.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ge:");
            if (ge.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, ge.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.gt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gt:");
            if (gt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, gt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
