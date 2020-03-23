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

/**
* 可购物：可以购买订购的产品或服务Product，Service
*/
public class ShoppingableQuery extends Query<ShoppingableQuery> {
    ShoppingableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * 可以购买订购的产品或服务Product，Service
    */
    public ShoppingableQuery isShoppingable() {
        startField("isShoppingable");

        return this;
    }

    public ShoppingableQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ShoppingableQuery onProductModel(ProductModelQueryDefinition queryDef) {
        startInlineFragment("ProductModel");
        queryDef.define(new ProductModelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
