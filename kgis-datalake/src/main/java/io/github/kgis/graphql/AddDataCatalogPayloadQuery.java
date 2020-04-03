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

/**
* 
*/
public class AddDataCatalogPayloadQuery extends Query<AddDataCatalogPayloadQuery> {
    AddDataCatalogPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class DatacatalogArguments extends Arguments {
        DatacatalogArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DatacatalogArguments filter(DataCatalogFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DatacatalogArguments order(DataCatalogOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DatacatalogArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DatacatalogArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DatacatalogArgumentsDefinition {
        void define(DatacatalogArguments args);
    }

    /**
    * 
    */
    public AddDataCatalogPayloadQuery datacatalog(DataCatalogQueryDefinition queryDef) {
        return datacatalog(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddDataCatalogPayloadQuery datacatalog(DatacatalogArgumentsDefinition argsDef, DataCatalogQueryDefinition queryDef) {
        startField("datacatalog");

        DatacatalogArguments args = new DatacatalogArguments(_queryBuilder);
        argsDef.define(args);
        DatacatalogArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddDataCatalogPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
