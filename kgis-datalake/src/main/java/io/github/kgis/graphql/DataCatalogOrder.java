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

public class DataCatalogOrder implements Serializable {
    private Input<DataCatalogOrderable> asc = Input.undefined();

    private Input<DataCatalogOrderable> desc = Input.undefined();

    private Input<DataCatalogOrder> then = Input.undefined();

    public DataCatalogOrderable getAsc() {
        return asc.getValue();
    }

    public Input<DataCatalogOrderable> getAscInput() {
        return asc;
    }

    public DataCatalogOrder setAsc(DataCatalogOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public DataCatalogOrder setAscInput(Input<DataCatalogOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public DataCatalogOrderable getDesc() {
        return desc.getValue();
    }

    public Input<DataCatalogOrderable> getDescInput() {
        return desc;
    }

    public DataCatalogOrder setDesc(DataCatalogOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public DataCatalogOrder setDescInput(Input<DataCatalogOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public DataCatalogOrder getThen() {
        return then.getValue();
    }

    public Input<DataCatalogOrder> getThenInput() {
        return then;
    }

    public DataCatalogOrder setThen(DataCatalogOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public DataCatalogOrder setThenInput(Input<DataCatalogOrder> then) {
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
