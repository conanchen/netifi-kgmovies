// Generated from graphql_java_gen gem  with template Tuery.java.erb

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

/**
* 
*/
public class DeleteEntryPointPayloadTuery extends Tuery<DeleteEntryPointPayloadTuery> {
    DeleteEntryPointPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public DeleteEntryPointPayloadTuery msg() {
        startField("msg");

        return this;
    }

    /**
    * 
    */
    public DeleteEntryPointPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
