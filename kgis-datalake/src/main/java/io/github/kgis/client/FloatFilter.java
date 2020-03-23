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

public class FloatFilter implements Serializable {
    private Input<Double> eq = Input.undefined();

    private Input<Double> le = Input.undefined();

    private Input<Double> lt = Input.undefined();

    private Input<Double> ge = Input.undefined();

    private Input<Double> gt = Input.undefined();

    public Double getEq() {
        return eq.getValue();
    }

    public Input<Double> getEqInput() {
        return eq;
    }

    public FloatFilter setEq(Double eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    public FloatFilter setEqInput(Input<Double> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    public Double getLe() {
        return le.getValue();
    }

    public Input<Double> getLeInput() {
        return le;
    }

    public FloatFilter setLe(Double le) {
        this.le = Input.optional(le);
        return this;
    }

    public FloatFilter setLeInput(Input<Double> le) {
        if (le == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.le = le;
        return this;
    }

    public Double getLt() {
        return lt.getValue();
    }

    public Input<Double> getLtInput() {
        return lt;
    }

    public FloatFilter setLt(Double lt) {
        this.lt = Input.optional(lt);
        return this;
    }

    public FloatFilter setLtInput(Input<Double> lt) {
        if (lt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lt = lt;
        return this;
    }

    public Double getGe() {
        return ge.getValue();
    }

    public Input<Double> getGeInput() {
        return ge;
    }

    public FloatFilter setGe(Double ge) {
        this.ge = Input.optional(ge);
        return this;
    }

    public FloatFilter setGeInput(Input<Double> ge) {
        if (ge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ge = ge;
        return this;
    }

    public Double getGt() {
        return gt.getValue();
    }

    public Input<Double> getGtInput() {
        return gt;
    }

    public FloatFilter setGt(Double gt) {
        this.gt = Input.optional(gt);
        return this;
    }

    public FloatFilter setGtInput(Input<Double> gt) {
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
