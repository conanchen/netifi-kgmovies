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
public class UpdateConversationPayloadTuery extends Tuery<UpdateConversationPayloadTuery> {
    UpdateConversationPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ConversationArguments extends Arguments {
        ConversationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ConversationArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ConversationArguments order(ConversationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ConversationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ConversationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ConversationArgumentsDefinition {
        void define(ConversationArguments args);
    }

    /**
    * 
    */
    public UpdateConversationPayloadTuery conversation(ConversationTueryDefinition queryDef) {
        return conversation(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateConversationPayloadTuery conversation(ConversationArgumentsDefinition argsDef, ConversationTueryDefinition queryDef) {
        startField("conversation");

        ConversationArguments args = new ConversationArguments(_queryBuilder);
        argsDef.define(args);
        ConversationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateConversationPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
