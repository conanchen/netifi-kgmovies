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
public class UpdateReviewPayloadQuery extends Query<UpdateReviewPayloadQuery> {
    UpdateReviewPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ReviewArguments extends Arguments {
        ReviewArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ReviewArguments filter(ReviewFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReviewArguments order(ReviewOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReviewArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ReviewArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReviewArgumentsDefinition {
        void define(ReviewArguments args);
    }

    /**
    * 
    */
    public UpdateReviewPayloadQuery review(ReviewQueryDefinition queryDef) {
        return review(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateReviewPayloadQuery review(ReviewArgumentsDefinition argsDef, ReviewQueryDefinition queryDef) {
        startField("review");

        ReviewArguments args = new ReviewArguments(_queryBuilder);
        argsDef.define(args);
        ReviewArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateReviewPayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
