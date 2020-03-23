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
* 可读物
*/
public class ReadableQuery extends Query<ReadableQuery> {
    ReadableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class HasReadNotesArguments extends Arguments {
        HasReadNotesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasReadNotesArguments filter(ReadNoteFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments order(ReadNoteOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasReadNotesArgumentsDefinition {
        void define(HasReadNotesArguments args);
    }

    /**
    *     【阅读收条】 记录每个人阅读本条消息的时间,逆属性: ReadNote.isReadNoteOf    
    */
    public ReadableQuery hasReadNotes(ReadNoteQueryDefinition queryDef) {
        return hasReadNotes(args -> {}, queryDef);
    }

    /**
    *     【阅读收条】 记录每个人阅读本条消息的时间,逆属性: ReadNote.isReadNoteOf    
    */
    public ReadableQuery hasReadNotes(HasReadNotesArgumentsDefinition argsDef, ReadNoteQueryDefinition queryDef) {
        startField("hasReadNotes");

        HasReadNotesArguments args = new HasReadNotesArguments(_queryBuilder);
        argsDef.define(args);
        HasReadNotesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ReadableQuery onMessage(MessageQueryDefinition queryDef) {
        startInlineFragment("Message");
        queryDef.define(new MessageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
