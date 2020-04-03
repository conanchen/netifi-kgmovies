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
public class UpdateMessagePayloadQuery extends Query<UpdateMessagePayloadQuery> {
    UpdateMessagePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class MessageArguments extends Arguments {
        MessageArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public MessageArguments filter(MessageFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MessageArguments order(MessageOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MessageArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public MessageArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MessageArgumentsDefinition {
        void define(MessageArguments args);
    }

    /**
    * 
    */
    public UpdateMessagePayloadQuery message(MessageQueryDefinition queryDef) {
        return message(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateMessagePayloadQuery message(MessageArgumentsDefinition argsDef, MessageQueryDefinition queryDef) {
        startField("message");

        MessageArguments args = new MessageArguments(_queryBuilder);
        argsDef.define(args);
        MessageArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MessageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateMessagePayloadQuery numUids() {
        startField("numUids");

        return this;
    }
}
