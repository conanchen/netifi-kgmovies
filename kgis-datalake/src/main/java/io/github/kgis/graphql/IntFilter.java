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

public class IntFilter implements Serializable {
    private Input<Integer> eq = Input.undefined();

    private Input<Integer> le = Input.undefined();

    private Input<Integer> lt = Input.undefined();

    private Input<Integer> ge = Input.undefined();

    private Input<Integer> gt = Input.undefined();

    public Integer getEq() {
        return eq.getValue();
    }

    public Input<Integer> getEqInput() {
        return eq;
    }

    public IntFilter setEq(Integer eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    public IntFilter setEqInput(Input<Integer> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    public Integer getLe() {
        return le.getValue();
    }

    public Input<Integer> getLeInput() {
        return le;
    }

    public IntFilter setLe(Integer le) {
        this.le = Input.optional(le);
        return this;
    }

    public IntFilter setLeInput(Input<Integer> le) {
        if (le == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.le = le;
        return this;
    }

    public Integer getLt() {
        return lt.getValue();
    }

    public Input<Integer> getLtInput() {
        return lt;
    }

    public IntFilter setLt(Integer lt) {
        this.lt = Input.optional(lt);
        return this;
    }

    public IntFilter setLtInput(Input<Integer> lt) {
        if (lt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lt = lt;
        return this;
    }

    public Integer getGe() {
        return ge.getValue();
    }

    public Input<Integer> getGeInput() {
        return ge;
    }

    public IntFilter setGe(Integer ge) {
        this.ge = Input.optional(ge);
        return this;
    }

    public IntFilter setGeInput(Input<Integer> ge) {
        if (ge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ge = ge;
        return this;
    }

    public Integer getGt() {
        return gt.getValue();
    }

    public Input<Integer> getGtInput() {
        return gt;
    }

    public IntFilter setGt(Integer gt) {
        this.gt = Input.optional(gt);
        return this;
    }

    public IntFilter setGtInput(Input<Integer> gt) {
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
                _queryBuilder.append(eq.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.le.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("le:");
            if (le.getValue() != null) {
                _queryBuilder.append(le.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lt:");
            if (lt.getValue() != null) {
                _queryBuilder.append(lt.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ge.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ge:");
            if (ge.getValue() != null) {
                _queryBuilder.append(ge.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.gt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gt:");
            if (gt.getValue() != null) {
                _queryBuilder.append(gt.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
