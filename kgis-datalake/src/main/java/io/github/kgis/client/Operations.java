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

public class Operations {
    public static RootQueryQuery query(RootQueryQueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("{");
        RootQueryQuery query = new RootQueryQuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }

    public static RootMutationQuery mutation(RootMutationQueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("mutation{");
        RootMutationQuery query = new RootMutationQuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }
}
